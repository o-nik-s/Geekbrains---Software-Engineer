# Прикрутить бота к задаче:
# Создать калькулятор для работы с рациональными и комплексными числами, 
# организовать меню, добавив в неё систему логирования


import telebot
from logger import logging as log 

import tg_token as tkn


bot = telebot.TeleBot(tkn.TOKEN)
@bot.message_handler(content_types=["text"])
def start(message):
    if message.text in ('/start'):
        bot.send_message(message.chat.id, f"{message.chat.first_name}, приветствую!")
        msg = bot.send_message(message.chat.id, 'Введите выражение в формате "A sign B":')
        bot.register_next_step_handler(msg, user_input)


def user_input(message):
    try:
        inpt = message.text.split()
        match inpt[1]:
            case '+': result = float(inpt[0]) + float(inpt[2])
            case '-': result = float(inpt[0]) - float(inpt[2])
            case '*': result = float(inpt[0]) * float(inpt[2])
            case '/': result = float(inpt[0]) / float(inpt[2])
            case '//': result = float(inpt[0]) // float(inpt[2])
            case '%': result = float(inpt[0]) % float(inpt[2])
            case '**': result = float(inpt[0]) ** float(inpt[2])
        bot.send_message(message.chat.id, result)
        info = f'{message.chat.id}, {message.chat.first_name}, {message.chat.last_name}, {message.text}, {result}'
        log(info)
    except: bot.send_message(message.chat.id, 'Вы ошиблись!')
    msg = bot.send_message(message.chat.id, 'Введите выражение в формате "A sign B":')
    bot.register_next_step_handler(msg, user_input)


bot.polling()