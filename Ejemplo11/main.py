from os import system
system('cls')

def ejemplo1():
    # CREAR UNA LISTA Y LA INICIALIZAN AL MISMO TIEMPO
    lista = [0] * 3
    print(lista)
    # AÑADIR ELEMENTOS A LA LISTA
    lista.append(7)
    lista.append('Hola')
    lista.append(True)
    lista.append(1.5)
    print(lista)
    # LIMPIAR LA LISTA
    lista.clear()
    print(lista)
    lista.append(3) # volvemos añadir elmentos
    print(lista)

def ejemplo2():
    # DADO UNA LISTA DE NUMEROS ENTEROS MOSTRAR SOLO LOS PARES
    lista = [5,8,9,10,2,1]
    lista.append([2,3]) # Añadir una lista dentro de otra lista
    lista.append('hola')
    # print(lista)
    for e in lista:
        # print(e, end='  ')
        if isinstance(e,int):
           if e % 2 == 0:
              print(e)
        else:
           print('No es número: ', e)

def ejemplo3():
    lista_nombres = ['Luis','Miguel','Carlos','María']
    #RECORRER POR ELEMENTO
    for nombre in lista_nombres:
        print(nombre, end='  ')
    print()
    #RECORRER POR INDICE
    for i in range(len(lista_nombres)):#0 1 2 3 = 4
        print(lista_nombres[i], end='  ')

def ejemplo4():
    # LISTA UNIDIMENSIONAL DINAMICA
    n = int(input('INGRESE TAMAÑO DE LA LISTA? '))
    lista = []
    for i in range(n):
        numero = int(input('INGRESE ELEMENTO LISTA? '))
        lista.append(numero)
    print(lista)


ejemplo4()