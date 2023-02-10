# Задайте список из n чисел последовательности $(1+\frac 1 n)^n$
# и выведите на экран их сумму.

def seq_el(n):
    return (1+1/n)**n


n = int(input('Введите натуральное число N: '))
seq_list, sum = list(), 0
for i in range(1, n+1):
    el = round(seq_el(i), 2)
    seq_list.append(el)
    sum += el
print(seq_list, f'Сумма: {sum}', sep='\n')
