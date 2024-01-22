import os
os.system('cls')

matriz = [
              [3, 4, 5],
              [7, 8, 9]
         ]

def calculomatriz(matriz):
    nf = len(matriz)
    nc = len(matriz[0])
    cantidadNumeros = nf * nc

    sumaNumeros = 0
    for fila in matriz:
        for numero in fila:
            sumaNumeros = sumaNumeros + numero

    return cantidadNumeros, sumaNumeros

x, y = calculomatriz(matriz)
print('Cantidad Números: ', x)
print('Suma Números    : ', y)

tupla = calculomatriz(matriz)
print('Cantidad Números: ', tupla[0])
print('Suma Números    : ', tupla[1])

print(tupla)