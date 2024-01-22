import math

def area(radio):
    return math.pi * (radio ** 2)

def perimetro(radio):
    return 2 * math.pi * radio

def redondear(x):
    return round(x,2)

def salida(area, perimetro):
    print("Area Circulo     : ", redondear(area))
    print("Perimetro Circulo: ", redondear(perimetro))