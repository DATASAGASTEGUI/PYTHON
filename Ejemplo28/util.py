def resta(a,b): # Parametros posición
    return a - b

def suma(a=0,b=0): # Parametros por defecto
    return a + b

def multiplicacion(a=None,b=None): # Parametros por defecto
    if a!=None and b!=None:
       return a*b
    else:
       return 'DEBES ENVIAR VALORES EN LA FUNCION'
    
def indeterminado_por_posicion(*args): # Parametros indeterminados por posición
    print(args)
    for arg in args:
        if isinstance(arg,int):
           print('Es un entero: ', arg)
        
        if isinstance(arg,str):
           print('Es una cadena: ', arg)

        if isinstance(arg,list):
           print('Es una lista: ', arg)

        if isinstance(arg,dict):
           print('Es un diccionario: ', arg)

def indeterminado_por_nombre(**diccionario):
    print(diccionario)
    for clave in diccionario:
        print(clave, "=>", diccionario[clave])




