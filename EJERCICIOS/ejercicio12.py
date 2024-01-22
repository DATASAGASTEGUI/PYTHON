import os
os.system('cls')
matriz = [
              [3, 4, 5],
              [7, 8, 9]
         ]

nf = len(matriz)
nc = len(matriz[0])

lista = []
for i in range(nf):
    for j in range(nc):
        tupla = i, j # (i,j)
        lista.append(tupla)
    print()

print(lista); print(type(lista))
print(tuple(lista))
print(type(tuple(lista)))

