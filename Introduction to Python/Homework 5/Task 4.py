# Реализуйте RLE алгоритм: реализуйте модуль сжатия и восстановления данных.

def encode(text:str):
    code, curr_smbl, count = '', '', 0
    for chr in text:
        if chr == curr_smbl:
            count += 1
        else: 
            if count > 0: code += f'{count}{curr_smbl}'
            curr_smbl, count = chr, 1
    code += f'{count}{curr_smbl}'
    return code


def decode(text:str):
    decode, count = '', ''
    for chr in text:
        if chr.isdigit():
            count += chr
        elif chr.isalpha(): 
            decode += chr * int(count)
            count = ''
    return decode
    

name_file = 'Text 4.txt'

def main():
    with open(name_file, 'r+', encoding="utf-8") as file:
        text = file.read()
        file.seek(0)
        file.truncate()
        if len(text)==0: exit()
        if text[0].isalpha(): file.write(encode(text))
        elif text[0].isdigit(): file.write(decode(text))
        else: 
            print('Формат не разобран') 
            return
        print('Конвертация проведена.')

main()