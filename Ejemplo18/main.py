import os, re

def ejemplo1():
    os.system('cls')
    print("RECONCER NUMEROS ENTEROS")
    print("------------------------")
    patron = '\\d+' # 1, 5, 22343,  343434343
    # patron = '[0-9]+'
    while True:
          print('INGRESAR UN NUMERO ENTERO? ')
          numero = input()
          correcto = re.fullmatch(patron,numero)
          if correcto:
             print('ES UN NUMERO ENTERO')
          else:
             print('NO ES UN NUMERO ENTERO')

def ejemplo2():
    os.system('cls')
    print("RECONCER TODO LO QUE NO SEA DIGITO")
    print("----------------------------------")
    # patron = '[^0-9]+' # HOLA(SI) HOLA1(NO)
    patron = '\\D+'
    while True:
          print('INGRESAR CADENA? ')
          numero = input()
          correcto = re.fullmatch(patron,numero)
          if correcto:
             print('NO TIENE NINGUN DIGITO')
          else:
             print('SI TIENE UN DIGITO')

def ejemplo3():
    os.system('cls')
    print("RECONCER TODO LO OPUESTO A UNA VOCAL")
    print("------------------------------------")
    patron = '[^aeiouAEIOU]+' # HOLA(SI) HOLA1(NO)
    #patron = '\\D+'
    while True:
          print('INGRESAR CADENA? ')
          numero = input()
          correcto = re.fullmatch(patron,numero)
          if correcto:
             print('NO TIENE NINGUNA VOCAL')
          else:
             print('SI TIENE ALGUNA VOCAL')

def ejemplo4():
    os.system('cls')
    print("RECONCER ESPACIOS EN BLANCO")
    print("----------------------------")
    patron1 = '[^\s]+' #
    while True:
          print('INGRESAR ORACION? ')
          cadena = input()
          if cadena == 'FIN':
             break
          correcto1 = re.fullmatch(patron1,cadena)
          if correcto1:
             print('PALABRA')
          else:
             print('ORACION')

def ejemplo5():
    os.system('cls')
    print('EXPRESION REGULAR')
    print("-----------------")
    patron = '[a-zA-ZáéíóúñÑ]{4}'
    while True:
          cadena = input('INGRESAR CADENA? ')
          correcto = re.fullmatch(patron,cadena)
          if correcto:
             print('SI CUMPLE')
          else:
             print('NO CUMPLE')

def ejemplo6():
    os.system('cls')
    # RECUPERAR EN UNA LISTA TODAS LAS SECUENCIAS NUMERICAS
    cadena = 'Hola 1234 como estas 345  tengo 23'
    cadena1 = '''
                 hola maria@hotmail.com como estas
                 carlos@gmail.com
                 en un puerto
                 arturo@gmail.com
                 por lo anto jesus@hotmail.com
              '''
    #p = re.compile('[0-9]+')
    p = re.compile('([a-z]+@hotmail\.com|[a-z]+@gmail\.com)')

    #p = re.compile('([a-z]+@hotmail|gmail.com)')
    lista = p.findall(cadena1)
    print(lista)

ejemplo6()

'''
SI QUIERO RECONOCER CADENAS QUE INICIEN EN 'A' 
Y CONTINUEN CON UNO O NINGUN CARACTER
Patron = 'A?'    A1, A, Ax, A# 
'''

'''
RECONCER CADENAS QUE INICIAN CON LA LETRA A
Y LUEGO SOLO DOS CARACTERES MAS
 patron = 'A..' # A.{}
'''

'''
QUE INICIE CON LA CADENA 'AE' Y LUEGO
PUEDE VENIR CUALQUIER COSA O NADA
'''

'''
LA CADENA TIENE QUE TENER SI O SI 4 CARACTERES
ALFABETO ESPAÑOL
'''
