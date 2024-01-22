import os
os.system('cls')

lista_a = [1, 2, 3, 4]
lista_b = [1, 2, 5, 6]
interseccion = []

for x in lista_a:
    if x in lista_b:
       interseccion.append(x)

print('INTERSECCION: ', interseccion)