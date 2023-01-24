# Задайте список из нескольких чисел. Напишите программу, 
# которая найдёт сумму элементов списка, стоящих на нечётной позиции.

import random

N = 10

def CreateList(cnt, mx):
    lst = list()
    for i in range(cnt):
        lst.append(random.randint(-mx, mx))
    print(f'Искомый список: {lst}')
    return lst

def sum1(lst):
    summ = 0
    for i in range(len(lst)):
        if i%2==1: summ += lst[i]
    return summ

def sum2(lst):
    summ = 0
    for i, val in enumerate(lst):
        if i%2==1: summ += val
    return summ

sum3 = lambda lst: sum([lst[i] for i in range(len(lst)) if i%2==1])

sum4 = lambda lst: sum([v for i, v in enumerate(lst) if i%2==1])


def main():
    cnt = int(input('Введите количество элементов списка: '))
    lst = CreateList(cnt, N)
    print(f'Сумма элементов на нечетных позициях равна: {sum1(lst)}')
    print(f'Сумма элементов на нечетных позициях равна: {sum2(lst)}')
    print(f'Сумма элементов на нечетных позициях равна: {sum3(lst)}')
    print(f'Сумма элементов на нечетных позициях равна: {sum4(lst)}')


main()