from import_data import import_data
from export_data import export_data
from print_data import print_data
from logging_data import log_data
from edit_data import *


def ask_about_data():
    print('\nЧто Вы хотите сделать?')
    print('1 - Импорт данных')
    print('2 - Экспорт данных')
    print('3 - Печать данных')
    print('4 - Очистка данных')
    print('5 - Добавить строку')
    print('7 - Удалить строку')
    print('Q - Закончить работу')
    answ = input()
    if answ not in ('1', '2', '3', '4', '5', '7', 'Q', 'q'):
        print('Ошибка ввода!')
        answ = None
    print()
    return answ


def work_with_data():
    info_log = f"Начало работы программы"
    log_data(info_log)
    answ, data = ask_about_data(), None
    while answ not in ('Q', 'q'):
        match answ:
            case '1':
                file_name = input('Введите имя импортируемуго файла: ') 
                data = import_data(file_name)
                info_log = f'Импорт данных из {file_name}'
            case '2': 
                file_name = input('Введите имя экспортируемого файла: ')
                export_data(data, file_name)
                info_log = f'Экспорт данных в {file_name}'
            case '3': 
                print_data(data)
                info_log = f'Печать данных на экран'
            case '4':
                data.clear()
                info_log = f'Очистка данных в программе'
            case '5': 
                data = add_data(data)
                info_log = f'Добавлена строка в базу'
            case '7': 
                data = delete_data(data)
                info_log = f'Добавлена строка в базу'
        log_data(info_log)
        answ = ask_about_data()
    else: log_data("Завершение работы программы\n"+"-"*50)


# work_with_data()