from import_data import *
from export_data import *
from print_data import *


def ask_about_data():
    print('\nЧто Вы хотите сделать?')
    print('1 - Импорт данных')
    print('2 - Экспорт данных')
    print('3 - Печать данных')
    print('Q - Закончить работу')
    answ = input()
    if answ not in ('1', '2', '3', 'Q', 'q'):
        print('Ошибка ввода!')
        answ = None
    print()
    return answ


def work_with_data():
    answ, text = ask_about_data(), None
    while answ not in ('Q', 'q'):
        match answ:
            case '1':
                file_name = input('Введите имя импортируемуго файла: ') 
                text = import_data(file_name)
            case '2': 
                file_name = input('Введите имя экспортируемого файла: ')
                export_data(text, file_name)
            case '3': print_data(text)
        answ = ask_about_data()


work_with_data()