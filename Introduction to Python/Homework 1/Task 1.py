# Напишите программу, которая принимает на вход цифру, обозначающую день недели, 
# и проверяет, является ли этот день выходным.

def isDayOf(nmbr_day: int): 
    return nmbr_day>5

def main():
    print('Введите номер дня недели: ')
    number_day = int(input())
    day_of = isDayOf(number_day)
    print(day_of*"Да"+(1-day_of)*"Нет")

main()