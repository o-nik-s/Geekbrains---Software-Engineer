# Задайте число. Составьте список чисел Фибоначчи, в том числе для отрицательных индексов.


def Fibb(n:int):
    if n == 1 or n == 2: return 1
    else: return Fibb(n-1) + Fibb(n-2)


def NegaFibb(n:int):
    if n == -1: return 1
    elif n == -2: return -1
    else: return NegaFibb(n+2) - NegaFibb(n+1)


def NegaFibbList(n):
    lst = list()
    for i in range(-1, -n, -1): lst.append(NegaFibb(i))
    return lst



def main():
    cnt_f = int(input('Введите количество требуемых чисел негафибоначчи: '))

    print(f'Искомая последовательность чисел негафибоначчи:', *NegaFibbList(cnt_f+1))

    nflst = [NegaFibb(i) for i in range(-1, -cnt_f-1, -1)]
    print(f'Искомая последовательность чисел негафибоначчи:', *nflst)


main()