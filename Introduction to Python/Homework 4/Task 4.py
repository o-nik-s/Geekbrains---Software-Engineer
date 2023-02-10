# Задана натуральная степень k. 
# Сформировать случайным образом список коэффициентов (значения от 0 до 100) многочлена 
# и записать в файл многочлен степени k.


import random


min_b, max_b = 0, 100


def polinom_bluid(power:int):
    polynom = ''
    for i in range(power, -1, -1):
        if random.randint(0, 5)>0:
            b = random.randint(min_b, max_b)
            if b!=0:
                if len(polynom)>0: polynom += ' + '
                if i==0: polynom += f'{b}'
                else: polynom += f'{b}*x^{i}'
    polynom += ' = 0'
    return polynom
        

def main():
    power = int(input('Введите степень k: '))
    polinom = polinom_bluid(power)
    with open('file 4.txt', 'w') as file:
        file.write(polinom)
    print(polinom)


main()