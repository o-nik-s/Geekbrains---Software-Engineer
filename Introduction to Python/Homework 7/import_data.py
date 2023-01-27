from prepare_data import *

def import_data(file_name:str, encoding:str='UTF-8'):
    format = define_format(file_name)
    if format is None: return
    with open(file_name, 'r', encoding=encoding) as file:
        text = file.read()
    if format == 'csv': text = list(map(lambda x: x.split(';'), text.split('\n')))
    elif format == 'txt': text = list(map(lambda x: x.split('\n'), text.split('\n\n')))
    while text[-1] == ['']: text = text[:-1]
    print('Импорт данных выполнен!')
    return text