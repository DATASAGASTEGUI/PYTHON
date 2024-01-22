import os, random

def ejemplo1(lista): # Retorne el mayor de una lista de números
    lista[0] = 20
    print(lista)
    return max(lista)

def ejemplo2(x):
    print('N1:',x) # 5
    x = x + 1
    print('N2:',x) # 6


if __name__ == "__main__":
   
   '''
   x = 5
   ejemplo2(x) #
   print('N3:',x) # 6
   '''

   '''
   #lista = [random.randint(1,6) for i in range(10)]
   lista = [1,7,8,9]
   print('LISTA: ', lista)
   print('EL MAYOR DE LA LISTA: ', ejemplo1(lista))
   print('NUEVA LISSTA: ', lista)
   '''

