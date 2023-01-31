from import_data import import_data
from export_data import export_data
from print_data import print_data
from logging_data import log_data
from edit_data import *
from another_work import *


def main_ask_about_data():
    print('\nЧто Вы хотите сделать?')
    print('1 - Импорт данных')
    print('2 - Экспорт данных')
    print('3 - Печать данных')
    print('4 - Очистка данных')
    print('5 - Добавить строку')
    print('6 - Отредактировать строку')
    print('7 - Удалить строку')
    print('0 - Прочее')
    print('Q - Закончить работу')
    answ = input()
    if answ not in ('1', '2', '3', '4', '5', '6', '7', '0', 'Q', 'q'):
        print('Ошибка ввода!')
        answ = None
    print()
    return answ


def work_with_data():
    info_log = f"Начало работы программы"
    log_data(info_log)
    answ, data = main_ask_about_data(), None
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
                info_log = f'Добавлена строка'
            case '6': 
                data = change_data(data)
                info_log = f'Отредактирована строка'
            case '7': 
                data = delete_data(data)
                info_log = f'Удалена строка'
            case '0': 
                data = another_work_with_data(data)
        log_data(info_log)
        answ = main_ask_about_data()
    else: log_data("Завершение работы программы\n"+"-"*50)
