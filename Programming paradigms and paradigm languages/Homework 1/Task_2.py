"""
    Записать в декларативном стиле процедуру сортировки чисел в порядке убывания
"""

import random


def sort_list(numbers):
    return sorted(numbers, reverse=True)


numbers = [random.randint(-10, 10) for i in range(10)]
print(numbers, sort_list(numbers))
