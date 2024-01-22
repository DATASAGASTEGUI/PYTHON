import os
from mimodulo import area, perimetro

def ejemplo1():
    radio = float(input('Ingrese radio? '))
    print("Perimetro: ", round(perimetro(radio),2))
    print("Area     : ", round(area(radio),2))

if __name__ == "__main__":
   ejemplo1()