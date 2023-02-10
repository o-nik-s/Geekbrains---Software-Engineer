# Задайте последовательность чисел. 
# Напишите программу, которая выведет список неповторяющихся элементов исходной последовательности.


def input_numbers():
    inpt = input(f'Введите числа через запятую или пробел: ')
    inpt = map(int, inpt.split(',') if ',' in inpt else inpt.split())
    return list(inpt)


def count_elements(nums:list):
    dct_el = dict()
    for el in nums:
        dct_el[el] = dct_el.get(el, 0) + 1
    return dct_el


nonrepeat_elements = lambda x: [key for key, values in x.items() if values==1] 
            

def main():
    nums = input_numbers()
    cnt_el = count_elements(nums)
    print('Неповторяющиеся элементы среди них: ', *nonrepeat_elements(cnt_el))


main()