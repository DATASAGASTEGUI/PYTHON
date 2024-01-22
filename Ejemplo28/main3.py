import os

def llenar_lista(lista):
    lista.append(4)
    lista.append(5)
    lista.append(6)
 

def mostrar_lista(lista):
    print(lista)

if __name__ == "__main__":
   lista = []
   print('LISTA 1:', lista)
   llenar_lista(lista)
   print('LISTA 2:', lista)
   mostrar_lista(lista)