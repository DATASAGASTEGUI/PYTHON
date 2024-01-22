import os, math, mimodulo as m

os.system('cls')

# ENTRADA
radio = float(input('INGRESAR RADIO? '))
# PROCESO
area = m.area(radio)
perimetro = m.perimetro(radio)
# SALIDA
m.salida(area, perimetro)

os.system('pause')