"""
    Записать в императивном стиле процедуру сортировки чисел в порядке убывания
"""

import random


def sort_list(numbers):
    for i in range(len(numbers)):
        for j in range(i+1, len(numbers)):
            if numbers[j] > numbers[i]:
                numbers[i], numbers[j] = numbers[j], numbers[i]
    return numbers


numbers = [random.randint(-10, 10) for i in range(10)]
print(numbers, sort_list(numbers))
