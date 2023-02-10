# Реализуйте алгоритм перемешивания списка

import random


def create_random_list(n: int):
    lst = list()
    for i in range(n):
        lst.append(random.randint(-n, n))
    return lst

def shuffle(lst:list):
    len_lst = len(lst)
    for i in range(len_lst):
        j = random.randint(0, len_lst-1)
        el = lst[j]
        lst[j] = lst[i]
        lst[i] = el
    return lst

def main():
    n = int(input('Введите натуральное число N: '))
    lst = create_random_list(n)
    print(f'Созданный список: {lst}')
    shuffle_lst = shuffle(lst)
    print(f'Перемешанный список:{shuffle_lst}')


main()