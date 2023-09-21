def main():
    n = int(input('Введите число: '))


def mult(n):
    for i in range(1, 10):
        for j in range(1, n+1):
            print(f'{i} x {j} = {i*j}', end='\t')
        print()


if __name__ == "__main__":
    main()
