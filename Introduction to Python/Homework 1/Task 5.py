# Напишите программу, которая принимает на вход координаты двух точек 
# и находит расстояние между ними в 2D пространстве.

def InputPoint(txt_num: str):
    print(f'Введите координаты {txt_num} точки через запятую:')
    return list(map(float, input().split(',')))

def Distance(p1, p2):
    return round(((p1[0] - p2[0])**2 + (p1[1] - p2[1])**2)**(1/2), 2)

def main():
    P1 = InputPoint('первой')
    P2 = InputPoint('второй')
    dist = Distance(P1, P2)
    print(f'Расстояние между точками равно {dist}')

main()