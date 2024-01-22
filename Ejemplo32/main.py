import os

def miwhile():
    suma = 0
    numero = int(input('Ingresar número entero? '))
    while numero != 0:
          suma = suma + numero
          numero = int(input('Ingresar número entero? '))
    print("Suma: ", suma)

def simular_do_while():
    suma = 0
    while True:
          numero = int(input('Ingresar número entero? '))
          suma = suma + numero
          if numero == 0:
             break
    print("Suma: ", suma)


def mifor():
    suma = 0
    for _ in range(999999999999):
        print("Ingresar número entero? ")
        entero = int(input())
        suma += entero
        if entero == 0:
           break

    print("Suma:", suma)

mifor()

