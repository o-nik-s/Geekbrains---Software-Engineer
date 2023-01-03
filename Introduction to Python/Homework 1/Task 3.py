# Напишите программу, которая принимает на вход координаты точки (X и Y), 
# причём X ≠ 0 и Y ≠ 0, и выдаёт номер четверти плоскости, 
# в которой находится эта точка (или на какой оси она находится).

def inputXY():
    print('Введите координаты X точки:')
    x = float(input())
    print('Введите координаты Y точки:')
    y = float(input())
    return (x, y)

def quarterPrint(x:float, y:float):
    null_text = 'Точка расположена в начале координат'
    axis_text = 'Точка расположена на оси '
    quarter_text = 'Точка расположена в четверти '
    if (x == 0) & (y == 0):
        text = null_text
    elif x == 0:
        text = axis_text + 'Y'
    elif y == 0:
        text = axis_text + 'X'
    elif (x > 0) & (y > 0):
        text = quarter_text + '1'
    elif (x < 0) & (y > 0):
        text = quarter_text + '2'
    elif (x < 0) & (y < 0):
        text = quarter_text + '3'
    elif (x > 0) & (y < 0):
        text = quarter_text + '4'
    print(text)

def main():
    x, y = inputXY()
    quarterPrint(x, y)

main()