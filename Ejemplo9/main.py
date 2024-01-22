# EVALUAR UNA NOTA
# 0  DESAPROBADO 5 SUFICIENTE 7 NOTABLE 9 SOBRESALIENTE 10
import os
os.system('cls')
# PROCESO
while True:
    nota = float(input('INGRESE SU NOTA? '))
    if nota >= 0:
        if nota >= 0 and nota < 5:
           mensaje = 'DESAPROBADO'
        elif nota < 7:
           mensaje = 'SUFICIENTE'
        elif nota < 9:
           mensaje = 'NOTABLE'
        elif nota <= 10:
           mensaje = 'SOBRESALIENTE'
        else:
           mensaje = 'NOTA NO VALIDA'
        # SALIDA
        print(mensaje)
    else:
        print('DEBE INGRESAR UNA NOTA POSITIVA')




