# Задайте число. Составьте список чисел Фибоначчи, в том числе для отрицательных индексов.


def Fibb(n:int):
    if n == 1 or n == 2: return 1
    else: return Fibb(n-1) + Fibb(n-2)


def NegaFibb(n:int):
    if n == 1: return 1
    elif n == 2: return -1
    else: return NegaFibb(n-2) - NegaFibb(n-1)


def FuncList(func, n):
    lst = list()
    for i in range(1, n+1): lst.append(func(i))
    return lst



def main():
    cnt_f = int(input('Введите количество требуемых чисел Фибоначчи: '))

    print(f'Искомая последовательность чисел Фибоначчи:', \
          *(FuncList(NegaFibb, cnt_f)[::-1] + [0] + FuncList(Fibb, cnt_f)))

    f_lst = [Fibb(i) for i in range(1, cnt_f+1)]
    nf_lst = [NegaFibb(i) for i in range(1, cnt_f+1)]
    print(f'Искомая последовательность чисел Фибоначчи:', *(nf_lst[::-1] + [0] + f_lst))


main()