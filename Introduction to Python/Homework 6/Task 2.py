# Напишите программу, которая найдёт произведение пар чисел списка. 
# Парой считаем первый и последний элемент, второй и предпоследний и т.д.

import random

    
def CreateList(cnt, mx):
    lst = list()
    for i in range(cnt):
        lst.append(random.randint(-mx, mx))
    print(f'Искомый список: {lst}')
    return lst


def mult1(lst):
    mult_lst = list()
    for i in range((len(lst)+1)//2):
        mult_lst.append(lst[i]*lst[-(i+1)])
    return mult_lst


zp = lambda lst: zip(lst[:(len(lst)+1)//2], lst[::-1])
mult2 = lambda lst: [el[0]*el[1] for el in lst]


def main():
    mx = 10
    cnt = int(input('Введите количество элементов списка: '))
    lst = CreateList(cnt, mx)
    print(f'Произведение пар чисел списка: {mult1(lst)}')
    print(f'Произведение пар чисел списка: {mult2(zp(lst))}')


main()