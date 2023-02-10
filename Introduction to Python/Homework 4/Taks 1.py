# Вычислить число c заданной точностью d

def input_nums():
    num = float(input('Введите число: '))
    d = input('Введите число с требуемой точностью: ')
    return num, d

def accuracy(num:float)->int:
    num_splt = str(num).split('.')
    if len(num_splt)==1: return 0
    else: return len(num_splt[1])

def calculate(num, d):
    acc_d = accuracy(d)
    acc_num = accuracy(num)
    n = (num // 1) + num % 1 * 10**acc_d // 1 / 10**acc_d
    return n, acc_d


def print_result(num, acc_d, n):
    print(f'Число {num} с требуемой точностью {acc_d} равно {n} (или {round(num, acc_d)})')


def main():
    num, d = input_nums()
    n, acc_d = calculate(num, d)
    print_result(num, acc_d, n)

main()