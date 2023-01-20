# Создайте программу для игры с конфетами человек против человека.
# Условие задачи: На столе лежит 2021 конфета.
# Играют два игрока делая ход друг после друга.
# Первый ход определяется жеребьёвкой.
# За один ход можно забрать не более чем 28 конфет.
# Все конфеты оппонента достаются сделавшему последний ход.
# Сколько конфет нужно взять первому игроку, чтобы забрать все конфеты у своего конкурента?
# a) Добавьте игру против бота
# b) Подумайте как наделить бота ""интеллектом""

import random


def step_human(count, max_c):
    count -= int(input(f'Ваш ход! Введите количество конфет (не более {min(max_c, count)}): '))
    print(f'Осталось {count} конфет.')
    return count


def step_pc(count, max_c):
    cnt = random.randint(1, max_c)
    if cnt > count:
        cnt = count
    count -= cnt
    print(f'Ход ПК. ПК забрал {cnt} конфет. Осталось {count} конфет.')
    return count


def main():
    count = 2021
    max_c = 28

    print(f'Всего {count} конфет.')
    flag = bool(random.randint(0, 1))
    while count > 0:
        if flag:
            count = step_human(count, max_c)
        else:
            count = step_pc(count, max_c)
        # count = step_human(count, max_c) * int(flag) + step_pc(count, max_c) * (1 - int(flag))
        flag = not flag
    if flag:
        print(f'Победил ПК!')
    else:
        print(f'Поздравляем с победой!')


main()