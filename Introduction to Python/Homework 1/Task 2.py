# Напишите программу для. проверки истинности утверждения 
# ¬(X ⋁ Y ⋁ Z) = ¬X ⋀ ¬Y ⋀ ¬Z для всех значений предикат.

def isCorrect(x, y, z):
    return not(x + y + z) == (not x) * (not y) * (not z)

def enum():
    val = [True, False]
    for x in val:
        for y in val:
            for z in val:
                print(f'{x}, {y}, {z} -> {isCorrect(x, y, z)}')

enum()