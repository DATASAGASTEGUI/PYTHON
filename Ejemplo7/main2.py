# CALCULAR EL AREA Y PERIMETRO DE UN CIRCULO
import os, math, mimodulo

os.system('cls')

# ENTRADA
radio = float(input('INGRESAR RADIO? '))
# PROCESO
area = mimodulo.area(radio)
perimetro = mimodulo.perimetro(radio)
# SALIDA
mimodulo.salida(area, perimetro)

os.system('pause')