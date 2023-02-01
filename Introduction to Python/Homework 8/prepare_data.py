def define_format(file_name:str):
    format = file_name.split('.')[-1]
    if format not in ('csv', 'txt', 'xml'): print('Ошибка! Формат файла не распознан!')
    else: return format


def prepare_data_to_xml(data:list=None):
    fields = ['ID', 'firstName', 'lastName', 'patronymicName', 'phoneNumber', 'describe']
    text = ''
    for person in data:
        text += '<person>\n'
        for i, info in enumerate(person): text += f'    <{fields[i]}>{info}</{fields[i]}>\n'
        text += '</person>\n'
    return text


def prepare_data(lst:list, format:str):
    format = define_format(format)
    if format is None: return
    if format == 'csv': data = list(map(lambda x: ';'.join(x)+'\n', lst))
    elif format == 'txt': data = list(map(lambda x: '\n'.join(x)+'\n\n', lst))
    elif format == 'xml': data = prepare_data_to_xml(lst)
    return data