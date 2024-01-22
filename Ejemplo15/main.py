import os, re
os.system('cls')

def ejemplo1():
    # RECONOCER NUMEROS ENTEROS
    patron = '[0-9]+' # 1, 38, 888834123, 3j(ERROR)
    entero = input('INGRESE NUMERO ENTERO? ')
    correcto = re.fullmatch(patron,entero)
    if correcto:
       print('VERDADERO')
    else:
       print('FALSO')

def ejemplo2():
    # SUMAR DOS NUMEROS ENTEROS
    n1 = input('INGRESE NUMERO ENTERO 1?')
    n2 = input('INGRESE NUMERO ENTERO 2?')
    patron = '[0-9]+'
    if re.fullmatch(patron,n1) and re.fullmatch(patron,n2):
       suma = int(n1) + int(n2)
       print('SUMA: ', suma)
    else:
       print('ENTRADA INCORRECTA')

def ejemplo3():
    # SUMAR DOS NUMEROS ENTEROS
    n1 = input('INGRESE NUMERO ENTERO 1?')
    n2 = input('INGRESE NUMERO ENTERO 2?')
    patron = '[0-9]+'
    if re.fullmatch(patron,n1) and re.fullmatch(patron,n2):
       suma = int(n1) + int(n2)
       print('SUMA: ', suma)
    else:
       print('ENTRADA INCORRECTA')  

def ejemplo4():
    # SE PIDE CONTAR LA CANTIDAD DE VOCALES Y CONSONANTES
    # DE UNA ORACION INGRESADA
    patronV = '[AEIOUÁÉÍÓÚaeiouáéíóúü]'
    patronAlfabeto = '[A-Za-zÑñÁÉÍÓÚáéíóúü]'
    '''
    if re.fullmatch(patronV,'Á'):
       print('VERDADERO')
    else:
       print('FALSO')
    '''
    oracion = input('INGRESE UNA ORACION? ')
    cv = 0; cc = 0
    for letra in oracion:
        if re.fullmatch(patronAlfabeto,letra):
            if re.fullmatch(patronV,letra):
               cv += 1 # cv = cv + 1
            else:
               cc += 1
    print('CANTIDAD VOCALES    : ', cv)
    print('CANTIDAD CONSONANTES: ', cc)



ejemplo4()