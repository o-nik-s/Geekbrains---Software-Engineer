import random

cnt, mn, mx = 10, -10, 10

X = [random.randint(mn, mx) for _ in range(cnt)]
Y = [random.randint(mn, mx) for _ in range(cnt)]

Mx, My, ln = sum(X)/len(X), sum(Y)/len(Y), len(X)

r = sum((X[i] - Mx)*(Y[i] - My) for i in range(ln)) / (sum((X[i] - Mx)**2 for i in range(ln)) * sum((Y[i] - My)**2 for i in range(ln)))**(1/2)

print(f'Количество элементов: {cnt}, X={X}, Y={Y}', f'r={r}', sep='\n')