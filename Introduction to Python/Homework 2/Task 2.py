# Напишите программу, которая принимает на вход число N
# и выдает набор произведений чисел от 1 до N.

n = int(input('Введите натуральное число N: '))
lst_prod, prod = list(),  1
for i in range(1, n+1):
    prod *= i
    lst_prod.append(prod)
print(lst_prod)
