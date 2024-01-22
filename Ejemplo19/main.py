import os
os.system('cls')

def ejemplo1():
    # INMUTABLE(NO SE PUEDEN MODIFICAR-ORDEN)
    tupla = (1,2,3)
    # MUTABLE(SE PUEDE MODIFICAR-ORDEN)
    lista = [1,2,3]
    del lista[0]
    print(lista)

def ejemplo2():
    # FORMAS PARA CREAR UNA TUPLA
    # 1. USANDO PARENTESIS
    tupla = (1,2,'Hola',1.72,(2),[1,2,3],{'a':1,'b':4}); print(tupla)
    # 2. USANDO LA FUNCION TUPLE
    lista = [8,9,3]
    tupla = tuple(lista); print(tupla)
    diccionario = {'a':1,'b':2}
    tupla = tuple(diccionario); print(tupla)
    cadena = "HOLA MUNDO"
    tupla = tuple(cadena); print(tupla)
    # 3. USANDO LA TUPLA VACIA
    tupla1 = ()
    e = ('b',2)
    tupla1 = tupla1 + (e)
    print(tupla1)
    # 4. RETORNO DE UNA FUNCION
    tupla = divmod(20,3)
    print(tupla)
    # 5. EMPAQUETADO DE TUPLAS
    tupla = 8, 5, 'Hola'
    print(tupla)
    # 6. DESEMPAQUETAR TUPLAS
    a, b, c = 11, 12, 13
    tupla = a, b, c
    print(tupla)

def ejemplo3():
    diccionario = {'a':1, 'b':2}
    lista_tuplas = list(diccionario.items())
    print(lista_tuplas)
    for e in lista_tuplas:
        print(e)

def informacion():
    nombre = 'Miguel'
    edad = 23
    estatura = 1.72
    tupla = nombre, edad, estatura
    return tupla

def ejemplo4():
    estatura = informacion()[2]
    print(estatura)
    print(informacion()[1])
    print(informacion())

def ejemplo5():
    cadena = "HOLA MUNDO"
    tupla = tuple(cadena)
    # RECORRER POR ELEMENTO
    for e in tupla:
        print(e, end=' ')
    print()
    # RECORRER POR INDICE
    for i in range(len(tupla)): # range(10) 0   9
        print(tupla[i], end=' ')
    print()
    # TOMAR SEGMENTOS DE LA TUPLA
    print(tupla)
    print(tupla[0:4]) # indice inicio: indice inicio + cantidad de letras
    print(tupla[5:10])
    print(tupla[::-1]) # invertir tupla

def ejemplo6():
    

ejemplo5()