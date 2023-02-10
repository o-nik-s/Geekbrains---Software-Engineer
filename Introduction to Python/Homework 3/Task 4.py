# Напишите программу, которая будет преобразовывать десятичное число в двоичное.

num = num10 = int(input('Введите десятичное число: '))

def num10to2str(num10:int):
    num2 = ''
    while num10>0:
        num2 = str(num10%2) + num2
        num10//=2
    return num2

print(num10to2str(num))

def num10to2num(num10:int):
    lst2, num2 = list(), 0
    while num10>0:
        lst2.append(num10%2)
        num10//=2
    for el in lst2[::-1]:
        num2 = num2 * 10 + el
    return num2

print(num10to2num(num))