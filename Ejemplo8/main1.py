# EVALUAR UNA NOTA APROBADO O DESAPROBADO
import os
os.system('cls')
# ENTRADA
nota = int(input('INGRESAR NOTA? '))# 4
# PROCESAR
if nota < 5:
   mensaje = 'DESAPROBADO'
else:
   mensaje = 'APROBADO'
# SALIDA
print(mensaje)