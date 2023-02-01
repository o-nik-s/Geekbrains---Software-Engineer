from prepare_data import *


def import_data_from_xml(text:str=None):
    data = text.strip().split('\n')
    lst, person_lst = list(), list()
    for info in map(lambda x: x.strip(), data):
        if info == '<person>': person_lst = list()
        elif info == '</person>': lst.append(person_lst)
        else: person_lst.append(info[info.find('>')+1:info.find('</')])
    return lst
    

def import_data(file_name:str, encoding:str='UTF-8'):
    format = define_format(file_name)
    if format is None: return
    with open(file_name, 'r', encoding=encoding) as file: text = file.read()
    if format == 'csv': data = list(map(lambda x: x.split(';'), text.split('\n')))
    elif format == 'txt': data = list(map(lambda x: x.split('\n'), text.split('\n\n')))
    elif format == 'xml': data = import_data_from_xml(text)
    while data[-1] == ['']: data = data[:-1]
    print('Импорт данных выполнен!')
    return data