# Задайте список из N элементов, заполненных числами из промежутка [-N, N].
# Найдите произведение элементов на указанных позициях.
# Позиции хранятся в файле file.txt в одной строке одно число.

import random


def read_file(filename: str):
    lst = list()
    file = open(filename, 'r')
    for line in file:
        lst.append(int(line))
    file.close()
    return lst


def create_random_list(n: int):
    lst = list()
    for i in range(n):
        lst.append(random.randint(-n, n))
    return lst


def product_list(lst: list, pos_lst: list):
    prod, n_len = 1, len(lst)
    for el in pos_lst:
        if el < n_len:
            prod *= lst[el]
    return prod



def main():
    file_name: str = 'file.txt'
    file_lst = read_file(file_name)
    print(f'Позиции для произведения: {file_lst}')
    n = int(input('Введите натуральное число N: '))
    n_lst = create_random_list(n)
    print(f'Созданный список: {n_lst}')
    prod = product_list(n_lst, file_lst)
    print(f'Произведение элементов списка на указанных позициях: {prod}')



main()