# Задайте список из вещественных чисел. Напишите программу, 
# которая найдёт разницу между максимальным и минимальным значением 
# дробной части элементов.


import random


def CreateList(cnt:int, mx:int):
    lst = list()
    for i in range(cnt):
        lst.append(round((random.random()*2-1)*mx, 2))
    print(f'Искомый список: {lst}')
    return lst


def max_min_fraction(lst:list):
    max, min = lst[0]%1, lst[0]%1
    for el in lst:
        fract = el%1
        if fract > max: max = fract
        if fract < min: min = fract
    return round(max - min, 2)


fract = lambda x: x%1

fract_map = lambda lst: map(lambda x: x%1, lst) 


def main():
    mx = 10
    cnt = int(input('Введите количество элементов списка: '))
    lst = CreateList(cnt, mx)
    answ = 'Разница между максимальным и минимальным значением дробной части элементов равна:'
    print(f'{answ} {max_min_fraction(lst)}')
    print(f'{answ} {round(max(lst, key=fract)%1 - min(lst, key=fract)%1, 2)}')
    print(f'{answ} {round(max(fract_map(lst))-min(fract_map(lst)), 2)}')


main()