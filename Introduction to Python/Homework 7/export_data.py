from prepare_data import *

def export_data(data:list=None, file_name:str='', encoding:str='UTF-8'):
    if data==None: 
        print('Ошибка! Нет данных для экспорта.') 
        return
    format = define_format(file_name)
    if format is None: return
    with open(file_name, 'w', encoding=encoding) as file:
        data = prepare_data(data, format)
        file.writelines(data)
    print('Экспорт данных выполнен!')