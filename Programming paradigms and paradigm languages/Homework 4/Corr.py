import random

cnt = 10
mn = -10
mx = 10

X = [random.randint(-10, 10) for _ in range(cnt)]
Y = [random.randint(-10, 10) for _ in range(cnt)]

Mx, My, ln = sum(X)/len(X), sum(Y)/len(Y), len(X)

r = sum((X[i] - Mx)*(Y[i] - My) for i in range(len(X))) / (sum((X[i] - Mx)**2 for i in range(len(X))) * sum((Y[i] - My)**2 for i in range(len(Y))))**(1/2)

print(f'Количество элементов: {cnt}, X={X}, Y={Y}', f'r={r}', sep='\n')