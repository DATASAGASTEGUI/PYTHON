import os
os.system('cls')

matriz = [
              [3, 4, 5, 8],
              [7, 8, 9, 9]
         ]

diccionario = {}

nf = len(matriz)
nc = len(matriz[0])

c = 1
for i in range(nf):
    for j in range(nc):
        tupla = i, j # (i,j)
        diccionario[c] = tupla
        c = c + 1

print(diccionario)
print(diccionario.get(6))