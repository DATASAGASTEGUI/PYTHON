import os, math
from mimodulo import area, perimetro, salida

os.system('cls')

# ENTRADA
radio = float(input('INGRESAR RADIO? '))
# PROCESO
area = area(radio)
perimetro = perimetro(radio)
# SALIDA
salida(area, perimetro)

os.system('pause')
