import os
os.system('cls')

empleado_dic = {
                     'nombre': 'Miguel', 
                     'edad': 23, 
                     'estatura': 1.72, 
                     'casado': True, 
                    'jobi_lst': ['Ajedrez','Cine'],
                    'direccion_dic': {
                                      'calle': 'Av. Ejercito 123',
                                      'ciudad': 'Madrid',
                                      'pais': 'España',
                                      'cp': 28933
                                     }
                   }

def ejemplo1():
    print('OBTENER LAS CLAVES DEL DICCIONARIO')
    print('----------------------------------')
    claves = empleado_dic.keys()
    print(claves)

def ejemplo2():
    print('OBTENER LOS VALORES DEL DICCIONARIO')
    print('-----------------------------------')
    valores = empleado_dic.values()
    print(valores)

def ejemplo3():
    print('OBTENER LOS ELEMENTOS(CLAVE-VALOR) DEL DICCIONARIO')
    print('--------------------------------------------------')
    tuplas = empleado_dic.items()
    #print(tuplas)
    #print(list(tuplas))
    
    for tupla in list(tuplas):
        print(tupla)

    print()

    for tupla in list(tuplas):
        print("%-16s %-50s" % (tupla[0], tupla[1]))

def ejemplo4():
    print('RECORRER DICCIONARIO POR LA CLAVE')
    print('---------------------------------')
    claves = empleado_dic.keys()
    for clave in list(claves):
        print(empleado_dic[clave], end='  ')
    print()
    # QUIERO SABER QUE VALOR GUARDA LA CLAVE NOMBRE
    print('NOMBRE: ', empleado_dic['nombre'])

def ejemplo5():
    print('BUSCAR POR UNA CLAVE')
    print('--------------------')
    print('Estatura: ', empleado_dic['estatura'])
    print("Apellido Materno: ", empleado_dic.get('amaterno','NO EXISTE CLAVE')) #None

def ejemplo6():
    print('AGREGAR ELEMENTOS(CLAVE-VALOR) AL DICCIONARIO')
    print('---------------------------------------------')
    empleado_dic['amaterno'] = 'Alva'
    print(empleado_dic)
    print('MODIFICAR ELEMENTOS(CLAVE-VALOR) AL DICCIONARIO')
    print('---------------------------------------------')
    empleado_dic['nombre'] = 'Arturo'
    print(empleado_dic)
    print('ELIMINAR ELEMENTOS(CLAVE-VALOR) AL DICCIONARIO')
    print('---------------------------------------------')
    del empleado_dic['amaterno']
    print(empleado_dic)

def ejemplo7():
    print('VERIFICAR SI UNA CLAVE EXISTE')
    print('-----------------------------')
    empleado_dic['amaterno'] = 'Alva'
    if 'amaterno' in empleado_dic:
       print('SI SE ENCUENTRA')
    else:
       print('NO SE ENCUENTRA')

def ejemplo8():
    print('GENERA UNA COPIA DEL DICCIONARIO')
    print('--------------------------------')
    copia_dic = empleado_dic.copy()
    empleado_dic['amaterno'] = 'Alva'
    print(copia_dic)
    print(empleado_dic)

def ejemplo9():
    print('GENERA UNA COPIA(FALSA) DEL DICCIONARIO')
    print('---------------------------------------')
    copia_dic = empleado_dic
    empleado_dic['amaterno'] = 'Alva'
    print(copia_dic)
    print(empleado_dic)

def ejemplo10():
    print('LIMPIAR EL DICCIONARIO')
    print('----------------------')
    empleado_dic.clear()
    print(empleado_dic)

def ejemplo11():
    print('ACTUALIZAR UN DICCIONARIO')
    print('-------------------------')
    aux_dic = {'estatura': 1.82, 'edad': 56, }
    empleado_dic.update(aux_dic)
    print(empleado_dic)

def saludo():
    return 'Hola Mundo'

def ejemplo12():
    print('LLAMAR UNA FUNCION CON UN DICCIONARIO')
    print('-------------------------------------')
    opciones_dic = {'1': saludo}
    print(opciones_dic['1']()) # saludo()

ejemplo12()
    




