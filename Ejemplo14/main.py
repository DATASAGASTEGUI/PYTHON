import os, random
os.system('cls')

def ejemplo1():
    # CREAR UNA MATRIZ ESTATICA 2x3 (FILAS X COLUMNAS)
    matriz = [
              [3, 4, 5],
              [7, 8, 9]
             ]
    nf = len(matriz) # 2
    nc = len(matriz[0]) #3
    print("DIMENSION DE LA MATRIZ")
    print('----------------------')
    print("Cantidad Filas   : ", nf)
    print("Cantiada Columnas: ", nc)
    print('RECORRER POR FILA')
    print('-----------------')
    for fila in matriz:
        print(fila)
    print('RECORRER POR ELEMENTO')
    print('---------------------')
    for fila in matriz:
        for elemento in fila:
            print(elemento, end='  ')
        print()
    print('RECORRER POR INDICE')
    print('-------------------')
    for i in range(nf):
        for j in range(nc):
            print(matriz[i][j], end='  ')
        print()
    print('MOSTRAR LA MATRIZ COMPLETA')
    print('--------------------------')
    print(matriz)

def ejemplo2():
    # CREAR UNA MATRIZ DINAMICA 2x3 (FILAS X COLUMNAS)
    nf = int(input('INGRESAR CANTIDAD FILAS? '))
    nc = int(input('INGRESAR CANTIDAD COLUMNAS? '))
    matriz = []
    for i in range(nf):
        fila = []
        for j in range(nc):
            fila.append(random.randint(1,6))
        matriz.append(fila)
    print('MOSTRAR MATRIZ: ', matriz)
    print('SUMA DE TODOS LOS ELEMENTOS DE LA MATRIZ')
    print('----------------------------------------')
    s = 0
    for fila in matriz:
        for numero in fila:
            s = s + numero

    for fila in matriz:
        print(fila)
    
    print("\nSUMA: ", s)
    print('MOSTRAR LA POSICION EN LA MATRIZ DE LOS PARES')
    print('---------------------------------------------')
    for i in range(nf):
        for j in range(nc):
            if matriz[i][j] % 2 == 0:
               print('(',i,',',j,')','   ',matriz[i][j])

def ejemplo4():
    # RECORRER POR COLUMNAS
    matriz = [
                [1, 3, 4, 2],
                [5, 8, 9, 1],
                [4, 7, 6, 0]
             ]
    nf = len(matriz)
    nc = len(matriz[0])

    for fila in matriz:
        print(fila)
    
    for j in range(nc):
        for i in range(nf):
            print(matriz[i][j], end='  ')
        print()

def ejemplo5():
    # UNA MATRIZ PUEDE GUARDAR CUALQUIER TIPO DE DATO
    matriz = [
               [1,     1.4,  2.5],
               ['Hola',[4],'X' ],
               [8     ,9,    [1, 5]]
             ]
    print('SUMAR SOLO LOS ENTEROS DE LA MATRIZ')
    print('-----------------------------------')
    s1 = 0
    s2 = 0
    for fila in matriz:
        for elemento in fila:
            if isinstance(elemento,int):
               s1 = s1 + elemento
            if isinstance(elemento,list):
               for x in elemento:
                   s2 = s2 + x
    print("SUMA TODOS NUMEROS ENTEROS: ",(s1+s2))

ejemplo5()