n = int(input('Введите число: '))
for i in range(n+1):
    for j in range(n+1):
        print(f'{i} x {j} = {i*j}', end='\t')
    print()
