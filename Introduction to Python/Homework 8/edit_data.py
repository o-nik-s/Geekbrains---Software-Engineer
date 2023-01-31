fields:list = ['Фамилия', 'Имя', 'Отчество', 'Номер телефона', 'Описание']

def add_data(data:list=None):
    if data is None:
        answ = input('Отсутствует открытая база данных. Продолжить (Y/Any)? ')
        if answ not in ('Y', 'y'): return data
        else: data = [['ID'] + fields]
    lst = [str(len(data))]
    for name in fields:
        lst.append(input(f'Введите {name}: '))
    data.append(lst)
    return data


def delete_data(data:list=None):
        if data is None:
            print('Отсутствует5 открытая база данных!')
        else: 
            answ = input('Введите идентификатор удаляемой строки: ')
            if (not answ.isdigit()) or (answ == '0'): return data
            indx = {d[0]:i for i, d in enumerate(data)}
            try: data.pop(indx[answ])
            except: print('Ошибка удаления!')
        return data


# def change_data(data:list=None):
#         if data is None:
#             print('Отсутствует5 открытая база данных!')
#         else: 
#             answ = input('Введите идентификатор удаляемой строки: ')
#             if (not answ.isdigit()) or (answ == '0'): return data
#             indx = {d[0]:i for i, d in enumerate(data)}
#             try: data.pop(indx[answ])
#             except: 
#                 print('Ошибка редактирования!')
#         return data
            
