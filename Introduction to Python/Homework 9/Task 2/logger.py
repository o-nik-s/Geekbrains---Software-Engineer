from datetime import datetime

def logging(info:str):
    with open('log.txt', 'a', encoding='utf-8') as log_file:
        log_file.write(f'{datetime.now().date()}, {datetime.now().time()}, {info}\n')