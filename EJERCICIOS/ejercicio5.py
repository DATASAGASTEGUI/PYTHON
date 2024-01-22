import os
os.system('cls')

lista = [4, 5, 2, 1, 0, 8, 9, 2, 1]
otra = []
for x in lista:
    if x not in otra:
       otra.append(x)

print(lista)
print(otra)