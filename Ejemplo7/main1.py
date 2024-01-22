# CALCULAR EL AREA Y PERIMETRO DE UN CIRCULO
import os, math

os.system('cls')

# ENTRADA
radio = float(input('INGRESAR RADIO? '))
# PROCESO
area = math.pi * (radio ** 2)
perimetro = 2 * math.pi * radio
# SALIDA
print("Area Circulo     : ", area(radio))
print("Perimetro Circulo: ", round(perimetro,2))

os.system('pause')