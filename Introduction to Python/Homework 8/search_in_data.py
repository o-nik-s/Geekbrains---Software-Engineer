import constants as cnst
from print_data import print_data


def search_in_data(data:list=None):
    print('\n'.join(map(lambda x: f'{x[0]+1} - {x[1]}', enumerate(cnst.FIELDS_RU))))
    answ = input('В каком поле Вы хотите искать? ')
    if answ not in map(lambda x: str(x), range(1, len(cnst.FIELDS_RU)+1)): return
    what = input('Введите запрос: ').strip().lower()
    found_lst = filter(lambda el: what in el[1], enumerate(map(lambda x: x[int(answ)].lower(), data[1:])))
    data = [data[i] for i in map(lambda x: x[0]+1, found_lst)]
    if len(data) == 0: print('Данные не найдены!')
    else: print_data(data)