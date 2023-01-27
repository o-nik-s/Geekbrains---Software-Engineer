from prepare_data import *

def export_data(data:list, file_name:str, encoding:str='UTF-8'):
    format = define_format(file_name)
    if format is None: return
    with open(file_name, 'w', encoding=encoding) as file:
        data = prepare_data(data, format)
        file.writelines(data)
    print('Экспорт данных выполнен!')