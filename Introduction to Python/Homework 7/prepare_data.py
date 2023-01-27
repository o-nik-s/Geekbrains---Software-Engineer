def define_format(file_name:str):
    format = file_name.split('.')[-1]
    if format not in ('csv', 'txt'): 
        print('Формат файла не распознан!')
    else: return format

def prepare_data(lst:list, format):
    format = define_format(format)
    if format is None: return
    if format == 'csv': data = list(map(lambda x: ';'.join(x)+'\n', lst))
    elif format == 'txt': data = list(map(lambda x: '\n'.join(x)+'\n\n', lst))
    return data