# Создайте программу для игры в ""Крестики-нолики"" при помощи виртуального окружения и PIP

import telebot

import numpy as np
import random

import tg_token as tkn



def print_board_telebot(id, board):
    for i in np.arange(0, 9, step=3):
        bot.send_message(id, "| {} | {} | {} |".format(board[i], board[i+1], board[i+2]))


def step_pc(board):
    possibleMoves = [x for x, letter in enumerate(board) if letter == " "]
    move = random.choice(possibleMoves)
    board[move] = 'O'


def winner(board, icon):
    win_fields = ['012', '345', '678', '036', '147', '258', '048', '246']
    for w_field in win_fields:
        if board[int(w_field[0])] == icon and board[int(w_field[1])] == icon and board[int(w_field[2])] == icon:
            return True
    return False


bot = telebot.TeleBot(tkn.TOKEN)
@bot.message_handler(content_types=["text"])
def start(message):
    if message.text in ('/start'):
        bot.send_message(message.chat.id, f"{message.chat.first_name}, приветствую!")
        board = [" " for x in range(9)]
        print_board_telebot(message.chat.id, board)
        msg = bot.send_message(message.chat.id, 'Ваш ход (введите номер поля):')
        bot.register_next_step_handler(msg, step_user, board)


def step_user(message, board):
    step = message.text
    if step in [str(i) for i in range(1, 10)]:
        if board[int(step)-1] == " ": 
            board[int(step)-1] = "X"
            if winner(board, "X") or board.count(' ') == 0: 
                print_board_telebot(message.chat.id, board)
                if winner(board, "X"): bot.send_message(message.chat.id, 'Вы выиграли!', )
                elif board.count(' ') == 0: bot.send_message(message.chat.id, 'Ничья!', ) 
                msg = bot.send_message(message.chat.id, "Для начала с начала введите '/start'")
                bot.register_next_step_handler(msg, start)
                return
            step_pc(board)
            if winner(board, "O"): 
                print_board_telebot(message.chat.id, board)
                bot.send_message(message.chat.id, 'ПК выиграл!', )
                msg = bot.send_message(message.chat.id, "Для начала с начала введите '/start'")
                bot.register_next_step_handler(msg, start)
                return
            # print(board)
            print_board_telebot(message.chat.id, board)
            msg = bot.send_message(message.chat.id, 'Ваш ход (введите номер поля):')
            bot.register_next_step_handler(msg, step_user, board)
        else:
            msg = bot.send_message(message.chat.id, 'Вы ошиблись!') 
            msg = bot.send_message(message.chat.id, 'Ваш ход (введите номер поля):')
            bot.register_next_step_handler(msg, step_user, board)
    else:
        msg = bot.send_message(message.chat.id, 'Вы ошиблись!') 
        msg = bot.send_message(message.chat.id, 'Ваш ход (введите номер поля):')
        bot.register_next_step_handler(msg, step_user, board)


bot.polling()