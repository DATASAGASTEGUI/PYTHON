import os, math

def principal():
    numero = 1.80
    print(mostrar(numero)) # 1.60

def mostrar(numero):
    entero = int(numero)
    decimal = round((numero - entero)*100) # 60
    if decimal % 10 == 0:
       cadena = str(entero) + "." + str(decimal)
    else:
       cadena = str(numero)
    return cadena

def mostrar1(numero):
    entero = int(numero)
    decimal = round((numero - entero)*100) # 60
    if decimal % 10 == 0:
       cadena = str(numero) + ":" + "SI"
    else:
       cadena = str(numero) + ":" + "NO"
    return cadena


if __name__ == "__main__":
   os.system("cls")
   principal()
   os.system("pause")