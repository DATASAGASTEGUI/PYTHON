import os, re

español_dic = {
                '+': 'SUMAR',
                '-': 'RESTAR',
                '*': 'MULTIPLICAR',
                '/': 'DIVIDIR',
                '**': 'POTENCIA'
              }

ingles_dic = {
                '+': 'ADD',
                '-': 'SUBSTRACT',
                '*': 'MULTIPLY',
                '/': 'DIVIDE',
                '**': 'POWER'
             }
def validar_entrada(idioma):
    patron = '(ESPAÑOL|INGLES|español|inglés|ingles)'
    correcto = re.fullmatch(patron,idioma)
    if correcto:
       return True
    else:
       return False

def principal():
    os.system('cls')
    idioma = input('INGRESE IDIOMA (ESPAÑOL O INGLES)? ')
    if validar_entrada(idioma):
        print('MENU')
        print('----')
        if idioma == 'ESPAÑOL':
           idioma_dic = español_dic.copy()
        else:
           idioma_dic = ingles_dic.copy()
        for tupla in list(idioma_dic.items()): # [(e1,e2)(e3,e4)]
            print("%-4s %-10s" % (tupla[0],tupla[1]))
    else:
        print('ENTRADA INCORRECTA')

principal()