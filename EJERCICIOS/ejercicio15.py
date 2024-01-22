import os
os.system('cls')

def solucion():
    cadena1 = 'Amor'.lower()
    cadena2 = 'Roma'.lower()
    conjunto1 = set(cadena1)
    conjunto2 = set(cadena2)
    print(conjunto1)
    print(conjunto2)
    if conjunto1 == conjunto2:
       print('ES ANAGRAMA')
    else:
       print('NO ES ANAGRAMA')

solucion()



