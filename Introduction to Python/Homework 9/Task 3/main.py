from import_data import import_data
from export_data import export_data
from logging_data import log_data
import telebot
import os

import tg_token as tkn


bot = telebot.TeleBot(tkn.TOKEN)
directory = u'C:\\Telegram\\'



def ask_about_data():
    print('\nЧто Вы хотите сделать?')
    print('1 - Импорт данных')
    print('2 - Экспорт данных')
    print('3 - Печать данных')
    print('Q - Закончить работу')
    answ = input()
    if answ not in ('1', '2', '3', 'Q', 'q'):
        print('Ошибка ввода!')
        answ = None
    print()
    return answ


bot = telebot.TeleBot(tkn.TOKEN)


def print_message(message):
    msg = 'Что Вы хотите сделать?\n' + \
        '1 - Импорт данных\n' + \
        '2 - Печать данных\n' + \
        '3 - Экспорт данных\n'
    return bot.send_message(message.chat.id, msg)


@bot.message_handler(content_types=["text"])
def start(message, lst_text=None):
    if message.text in ('/start'):
        bot.send_message(message.chat.id, f"{message.chat.first_name}, приветствую!")
        msg = print_message(message)
    elif message.text == '1':
        msg = bot.send_message(message.chat.id, 'Направьте импортируемый файл.')
        bot.register_next_step_handler(msg, import_file)
    elif message.text == '2':
        data = '\n'.join(map(lambda x: ' '.join(x), lst_text))
        bot.send_message(message.chat.id, data)
        msg = print_message(message)
        bot.register_next_step_handler(msg, start, lst_text)
        


@bot.message_handler(content_types=['document'])
def import_file(message):
    try:
        file_info = bot.get_file(message.document.file_id)
        downloaded_file = bot.download_file(file_info.file_path)
        file_name = directory + message.document.file_name
        with open(file_name, 'wb') as new_file:
            new_file.write(downloaded_file)        
        if file_name.split('.')[-1] not in ('txt', 'csv', 'xml'):
            bot.send_message(message.chat.id, 'Данный формат не поддерживается! Допустимы: txt, csv, xml.')
            msg = bot.send_message(message.chat.id, 'Направьте импортируемый файл.')
            bot.register_next_step_handler(msg, import_file)
        lst_text = import_data(file_name)
        bot.send_message(message.chat.id, 'Импорт данных выполнен!')
        msg = print_message(message)
        bot.register_next_step_handler(msg, start, lst_text)
    except Exception as e:
        bot.reply_to(message, e)
        msg = bot.send_message(message.chat.id, 'Направьте импортируемый файл.')
        bot.register_next_step_handler(msg, import_file)



if not os.path.exists(directory): os.mkdir(directory)
bot.polling(none_stop=True, interval=0)