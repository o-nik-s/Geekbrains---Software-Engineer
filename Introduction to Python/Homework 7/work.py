from import_data import *
from export_data import *
from print_data import *


def work_with_data():
    text = import_data('data.txt')
    export_data(text, 'data.csv')
    print_data(text)