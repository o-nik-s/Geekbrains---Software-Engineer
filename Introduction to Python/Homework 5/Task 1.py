# Напишите программу, удаляющую из текста все слова, содержащие ""абв"".

name_file = 'Text 1.txt'
pttrn = 'абв'
with open(name_file, 'r+', encoding="utf-8") as file:
    text = file.read()
    file.seek(0)
    file.truncate()
    file.write(' '.join(list(filter(lambda w: pttrn not in w, text.split()))))