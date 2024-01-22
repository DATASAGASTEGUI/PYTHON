import os
os.system('cls')
# ENTRADA
nota = int(input('INGRESAR NOTA? '))# 4
# PROCESAR
mensaje = 'APROBADO'
if nota < 5:
   mensaje = 'DESAPROBADO'
# SALIDA
print(mensaje)