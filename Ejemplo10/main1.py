import os
os.system('cls')
def ejemplo1():
    # SERIE NATURAL 0 ... 4 VERTICAL
    for i in range(5):
        print(i)

def ejemplo2():
    # SERIE NATURAL 0 ... 4 HORIZONTAL
    for i in range(5):
        print(i, end='  ')

def ejemplo3():
    # SERIE NATURAL 1 ... 9
    for i in range(1,10,1): #INICIO,FIN,PASO
        print(i, end='  ')

def ejemplo4():
    # SERIE NATURAL 9 ... 1 DECRECIENTE
    for i in range(9,0,-1):
        print(i, end = '  ')

def ejemplo5():
    # SUMAR LOS NUMEROS DE UNA SERIE 1...N
    n = int(input('INGRESE N? '))
    a = 0
    for x in range(1,n+1,1):
        print(x, end='  ')
        a = a + x
    print('\nSUMA SERIE: ', a)

ejemplo5()
