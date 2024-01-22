import os

os.system('cls')

while True:
    # ENTRADA
    cadena = input('INGRESE CADENA? ').upper().strip()
    if cadena == 'FIN':
       break
    partes = cadena.split() #Devuelve una lista de palabras
    if len(partes) == 1:
        # PROCESO
        cadena_invertida = cadena[::-1]
        if cadena == cadena_invertida:
           mensaje = "PALIDROMO"
        else:
           mensaje = "NO PALIDROMO"
        # SALIDA
        print('CADENA ORIGINAL : ', cadena.lower())
        print('CADENA INVERTIDA: ', cadena_invertida.lower())
        print('EVALUAR: ', mensaje)
    else:
        print('DEBE INGRESAR SOLO UNA PALABRA')
