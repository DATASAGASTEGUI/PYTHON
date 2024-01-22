import os
os.system('cls')

def ejemplo1():
    cadena = 'En un puerto italiano al pie de la montaña'
    #RECORRER POR ELEMENTO
    for e in cadena:
        print(e, end='  ')
    print()
    #RECORRER POR INDICE
    for i in range(len(cadena)):
        print(cadena[i], end=',')
    print()
    #RECORRER POR NUMERACION
    for e in enumerate(cadena):
        print(e[0],' ',e[1])

def ejemplo2():
    # NOTACION REBANADO
    cadena = 'En un puerto italiano'
    print('Subcadena i=6 f=11: ', cadena[6:12:1] ) # [inicio:fin:paso]
    print("Invertir: ", cadena[::-1])
    print('Puerto Invertido: ', cadena[11:5:-1])
    posicionfinal = len(cadena)-1
    print('Italiano Invertido: ', cadena[posicionfinal:posicionfinal-8:-1])
    print('Sacar 3 letras a partir de una posicion: ', cadena[6:9])

def ejemplo3():
    #MOSTRAR LA PALABRA "COMPUADORA" ESCALONADAMENTE
    cadena = 'COMPUTADORA'
    for i in range(len(cadena)): #0 1 2 3 4 5 6 7 8 9 10
        #print(cadena[0:i+1])# 0:1,0:2, 0:3
        print(cadena[i:i+1], end=' ') #0:1, 1:2, 2:3

ejemplo3()