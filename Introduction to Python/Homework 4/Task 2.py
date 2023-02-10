# Задайте натуральное число N. Напишите программу, которая составит список простых множителей числа N.


def is_Simple(n:int):
    div_list = [1, n]
    for i in range(2, int(n**(1/2))+2):
        if n%i == 0: div_list.append(i)
        if len(div_list) > 2: return False
    return True 


def simple_mult_list(n:int)->list:
    lst = list()
    for i in range(1, n+1):
        if n%i==0 and is_Simple(i): lst.append(i)
    return lst


n = int(input('Введите натуральное число N: '))
lst = simple_mult_list(n)
print('Cписок простых множителей числа N:', *lst, sep=' ')