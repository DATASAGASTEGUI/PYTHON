import os, random


os.system('cls')

def ejemplo1():
    # No permite tener como elementos otros colecciones(listas,dicccionarios,tuplas)
    # No permite duplicados
    # NO ORDEN
    # ES MUTABLE (ELIMINAR, AÑADIR)
    # NO SE PUEDEN RECORRER PO INDICE
    conjunto = {1,1.72,'Hola','Hola',1,1,1,1,1,1,1,1,1} # TreeSet
    print(conjunto)

def ejemplo2():
    print('CREAR UN CONJUNTO USANDO LLAVES')
    print('-------------------------------')
    #
    conjunto = {}
    print('CONJUNTO: ', conjunto)
    print('LONGITUD: ', len(conjunto))
    #
    conjunto = {'Manzana','Pera','Manzana'}
    print('CONJUNTO: ', conjunto)
    print('LONGITUD: ', len(conjunto))
    print('CREAR UN CONJUNTO USANDO LA FUNCION SET')
    print('---------------------------------------')
    #
    lista = [1, 2, 3, 4, 'hola']
    conjunto = set(lista)
    print('CONJUNTO: ', conjunto)
    print('LONGITUD: ', len(conjunto))
    #
    cadena = 'Hola Mundo'
    conjunto = set(cadena)
    print('CONJUNTO: ', conjunto)
    print('LONGITUD: ', len(conjunto))
    #
    diccionario = {'nombre':'Miguel','edad':30, 'edad': 31}
    conjunto = set(diccionario)
    print('CONJUNTO: ', conjunto)
    print('LONGITUD: ', len(conjunto))
    print('VALORES DEL DICCIONARIO: ', list(diccionario.values()))

def ejemplo3():
    print('RECORRER UN CONJUNTO')
    print('--------------------')
    conjunto = {2, 'hola', 1.72}
    for e in conjunto:
        print(e, end='   ')

def ejemplo4():
    print('AGREGAR ELEMENTOS A UN CONJUNTO')
    print('-------------------------------')
    conjunto = {1}
    for i in range(5):
        conjunto.add(random.randint(1,6))
    print('CONJUNTO: ', conjunto)
    print('LONGITUD: ', len(conjunto))

def ejemplo5():
    print('ELIMINAR ELEMENTOS DE UN CONJUNTO')
    print('---------------------------------')
    # USANDO LA FUNCION REMOVE
    conjunto = {1, 2, 3}
    conjunto.remove(1) # Si no existe lanza un error tene cuidado
    print('CONJUNTO: ', conjunto)
    print('LONGITUD: ', len(conjunto))
    # USANDO LA FUNCION DISCARD
    conjunto = {1, 2, 3}
    conjunto.discard(4) # No genera el error si no existe
    print('CONJUNTO: ', conjunto)
    print('LONGITUD: ', len(conjunto))

def ejemplo6():
    print('OPERACIONES CON CONJUNTOS(ARIMETICA)')
    print('------------------------------------')
    conjunto1 = {1, 2, 3, 4, 5}
    conjunto2 = {4, 5, 6, 7, 8}
    # UNION DE CONJUNTOS
    cojunto_union = conjunto1.union(conjunto2)
    print(cojunto_union)
    # INTERSECCION DE CONJUNTOS
    cojunto_interseccion = conjunto1.intersection(conjunto2)
    print(cojunto_interseccion)
    # DIFERENCIA DE CONJUNTOS
    conjunto_diferencia = conjunto1.difference(conjunto2)
    print(conjunto_diferencia)
    # OPERADOR DE PERTENENCIA (IN)(NOT IN)
    correcto = 9 in conjunto1
    print(correcto)

ejemplo6()

