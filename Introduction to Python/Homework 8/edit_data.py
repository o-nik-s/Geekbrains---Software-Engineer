import constants as cnst


def add_data(data:list=None):
    if data is None:
        answ = input('Отсутствует открытая база данных. Продолжить (Y/Any)? ')
        if answ not in ('Y', 'y'): return data, None
        else: data = [cnst.FIELDS_RU]
    lst = [str(len(data))]
    for name_field in cnst.FIELDS_RU[1:]: lst.append(input(f'Введите {name_field}: '))
    data.append(lst)
    return data, lst[0]


def change_data(data:list=None):
        if data is None: print('Отсутствует открытая база данных!')
        else: 
            answ = input('Введите идентификатор редактируемой строки: ')
            if not answ.isdigit() or answ == '0': return data, None
            indx = {d[0]:i for i, d in enumerate(data)}
            try: lst, values = [answ], data[indx[answ]]
            except: 
                print('Ошибка редактирования!')
                return data, None
            for i in range(1, len(cnst.FIELDS_RU)):
                lst.append(input(f'Введите новое значение {cnst.FIELDS_RU[i]} ({values[i]}): '))
            data[indx[answ]] = lst
        return data, answ
    

def delete_data(data:list=None):
        if data is None: print('Отсутствует5 открытая база данных!')
        else: 
            answ = input('Введите идентификатор удаляемой строки: ')
            if not answ.isdigit() or answ == '0': return data, None
            indx = {d[0]:i for i, d in enumerate(data)}
            try: data.pop(indx[answ])
            except: print('Ошибка удаления!')
        return data, answ
