def print_data(data:list=None):
    if data==None: print('Ошибка! Нет данных для печати.')
    try: print('\n'.join(map(lambda x: ' '.join(x), data)))
    except: print('Ошибка печати.')