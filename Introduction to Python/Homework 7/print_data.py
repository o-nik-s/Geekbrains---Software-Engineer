def print_data(lst:list=None):
    if lst==None: print('Ошибка! Нет данных для печати.')
    try: print('\n'.join(map(lambda x: ' '.join(x), lst)))
    except: print('Ошибка печати.')