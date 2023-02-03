# Прикрутить бота к задаче:
# Создать калькулятор для работы с рациональными и комплексными числами, 
# организовать меню, добавив в неё систему логирования


import telebot

import numpy as np
import random

import tg_token as tkn


bot = telebot.TeleBot(tkn.TOKEN)
@bot.message_handler(content_types=["text"])
def start(message):
    if message.text in ('/start'):
        bot.send_message(message.chat.id, f"{message.chat.first_name}, приветствую!")
        # board = [" " for x in range(9)]
        # print_board_telebot(message.chat.id, board)
        msg = bot.send_message(message.chat.id, 'Введите выражение:')
        bot.register_next_step_handler(msg, user_input)


def user_input(message):
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
    msg = bot.send_message(message.chat.id, 'Введите выражение:')
    bot.register_next_step_handler(msg, user_input)


bot.polling()