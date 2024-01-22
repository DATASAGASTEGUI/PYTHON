import os
os.system('cls')
matriz = [
              [3, 4, 5],
              [7, 8, 9]
         ]

nf = len(matriz)
nc = len(matriz[0])

for i in range(nf):
    for j in range(nc):
        tupla = i, j # (i,j)
        print(tupla,'=',matriz[i][j], end='    ')
    print()

print(matriz[0][1])
x = 5, 7, 8
print(x)