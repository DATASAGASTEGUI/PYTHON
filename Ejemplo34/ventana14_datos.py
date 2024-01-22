id = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
nombre = ["Luis", "Miguel", "Carlos", "Javier", "Carmen", "Maria", "Lucia", "Carmen", "Arturo", "Ismael", "Delly", "Vanessa", "Melissa", "Raul", "Arturo"]
estatura = [1.72, 1.73, 1.74, 1.75, 1.76, 1.60, 1.61, 1.62, 1.63, 1.64, 1.65, 1.56, 1.64, 1.67, 1.61]
sexo = ['H','H','H','H','M','M','M','M','H','H','M','M','M','H','H']
password = ["luis", "miguel", "carlos", "javier", "carmen1", "maria", "lucia", "carmen2", "arturo1", "ismael", "delly", "vanessa", "melissa", "raul", "arturo2"]

def verificar_usuario(login, password1):
    bandera = False
    for i in range(len(id)):
        if nombre[i] == login and password[i] == password1:
           bandera = True
           break
    return bandera