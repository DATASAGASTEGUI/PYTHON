import os, re

def principal():
    os.system("cls")                         # 0123456789 10 11
    oracion = input("Ingrese una oración? ") # En un puerto
    patron = "[aeiouAEIOUáéíóú]" # 
    c = 0
    for i in range(len(oracion)):
        pertenece = re.fullmatch(patron,oracion[i])
        if pertenece:
           c = c + 1

    print("Cantidad Vocales: ", c)

    print(os.getcwd())
    print(os.path.abspath("Ejemplo34/main.py"))
    os.system("pause")

if __name__ == "__main__":
   principal()
