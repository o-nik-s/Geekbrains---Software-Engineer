# Напишите программу, которая по заданному номеру четверти 
# показывает диапазон возможных координат точек в этой четверти (x и y).


def input_quarter():
    print('Введите номер четверти:')
    nquart = int(input())
    return nquart

def print_range(nquart:int):
    if nquart == 1:
        text = '(0, +inf; 0, +inf)'
    elif nquart == 2:
        text = '(-inf, 0; 0, +inf)'
    elif nquart == 3:
        text = '(-inf, 0; -inf, 0)'
    elif nquart == 4:
        text = '(0, +inf; -inf, 0)'
    else: 
        print('Ошибка ввода')
        return
    print('Возможный диапазон координат точек: ' + text)


def main():
    num_quarter = input_quarter()
    print_range(num_quarter)

main()