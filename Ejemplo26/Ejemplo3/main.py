import os
from mimodulo import Circulo

def ejemplo1():
    radio = float(input('Ingrese radio? '))
    c = Circulo(radio)
    print("Perimetro: ", round(c.perimetro(),2))
    print("Area     : ", round(c.area(),2))

def ejemplo2():
    radio = float(input('Ingrese radio? '))
    c = Circulo(radio)
    print(c)

def ejemplo3():
    radio = float(input('Ingrese radio? '))
    c = Circulo(radio)
    print("Radio: ", c.radio)
    c.radio = 12
    print("Radio: ", c.radio)


if __name__ == "__main__":
   ejemplo3()