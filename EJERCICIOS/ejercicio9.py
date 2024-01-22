import os

def validarNumero(numero):
    import re
    patron = '([0-9]+||[0-9]+\.[0-9]{1,2})'
    #patron = '[0-9]+'
    correcto = re.fullmatch(patron,numero)
    if correcto:
       return True
    else:
       return False

def sumar():
    print('SUMAR')
    print('-----')
    n1 = input('INGRESE NUMERO 1? ')
    n2 = input('INGRESE NUMERO 2? ')
    if validarNumero(n1) and validarNumero(n2):
       suma = float(n1) + float(n2)
       print('SUMA: ', suma)
    else:
       print('ENTRADA INCORRECTA')
       
def restar():
    print('RESTAR')
    print('------')
    n1 = input('INGRESE NUMERO 1? ')
    n2 = input('INGRESE NUMERO 2? ')
    if validarNumero(n1) and validarNumero(n2):
       resta = float(n1) - float(n2)
       print('RESTA: ', resta)
    else:
       print('ENTRADA INCORRECTA')

def multiplicar():
    print('MULTIPLICAR')
    print('-----------')
    n1 = input('INGRESE NUMERO 1? ')
    n2 = input('INGRESE NUMERO 2? ')
    if validarNumero(n1) and validarNumero(n2):
       multiplicacion = float(n1) * float(n2)
       print('MULTIPLICACION: ', multiplicacion)
    else:
       print('ENTRADA INCORRECTA')

def dividir():
    print('DIVIDIR')
    print('-------')
    n1 = input('INGRESE NUMERADOR? ')
    n2 = input('INGRESE DENOMINADOR? ')
    if validarNumero(n1) and validarNumero(n2) and float(n2) != 0:
       division = float(n1) / float(n2)
       print('DIVISION: ', division)
    else:
       print('ENTRADA INCORRECTA')

def potencia():
    print('POTENCIA')
    print('--------')
    n1 = input('INGRESE BASE? ')
    n2 = input('INGRESE EXPONENTE? ')
    if validarNumero(n1) and validarNumero(n2):
       potencia = float(n1) ** float(n2)
       print('POTENCIA: ', potencia)
    else:
       print('ENTRADA INCORRECTA')

def default():
    print('OPCION INCORRECTA')

switch_dic = {
    '+':  sumar,
    '-':  restar,
    '*':  multiplicar,
    '/':  dividir,
    '**': potencia
}

def principal():
    while True:
        os.system('cls')
        clave = input('INGRESE OPERACION (+ - * / ** FIN)? ')
        if clave.upper() == 'FIN':
           break
        funcion = switch_dic.get(clave,default)
        funcion(); os.system('pause')
    os.system('cls')
    print('GRACIAS POR SU VISITA')
principal()
