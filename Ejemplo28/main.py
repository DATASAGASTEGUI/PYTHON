import os
from util import resta, suma, multiplicacion, indeterminado_por_posicion, indeterminado_por_nombre

# ARGUMENTOS POR POSICION
def ejemplo1():
    print('RESTA: ', resta(5,3)) # Argumentos por posición

# ARGUMENTOS POR NOMBRE
def ejemplo2():
    print('RESTA: ', resta(b=3,a=5)) # Argumentos por nombre

# PARAMETROS POR DEFECTO
def ejemplo3():
    print('SUMA: ', suma(5,3))
    print('SUMA: ', suma())

# PARAMETROS POR DEFECTO
def ejemplo4():
    print('MULTIPLICACION: ', multiplicacion(5,3))
    print('MULTIPLICACION: ', multiplicacion())

# PARAMETROS INDETERMINADOS POR POSICION
def ejemplo5():
    indeterminado_por_posicion(5,"Hola Plone",[1,2,3,4,5],{'id':1,'nombre':'walter'})
    indeterminado_por_posicion()

# PARAMETROS INDETERMINADOS POR NOMBRE
def ejemplo6():
    indeterminado_por_nombre(n=5, c="Hola Plone", l=[1,2,3,4,5], d={'id':1,'nombre':'walter'})

if __name__ == "__main__":
   os.system('cls')
   ejemplo1()
   ejemplo2()
   ejemplo3()
   ejemplo4()
   ejemplo5()
   ejemplo6()
   os.system('pause')