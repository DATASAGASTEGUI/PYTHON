# pip install pymongo

import os, pymongo

def BaseDatosMongodb():
    conexion = None
    try:
        conexion = pymongo.MongoClient("mongodb://localhost:27017/")
        lista = conexion.list_database_names()
    except:
        conexion = None
    return conexion

def probar_conexion():
    conexion = BaseDatosMongodb()
    if conexion != None:
       print('OK: CONEXION')
    else:
       print('ERROR: CONEXION')

def principal1():
    conexion = pymongo.MongoClient("mongodb://localhost:27017/")
    db = conexion['01_tienda'] # Seleccionar la base de datos
    coleccion = db['producto']
    # MOSTRAR TODAS LAS BASE DE DATOS DEL SISTEMA
    nombresdb_lst = conexion.list_database_names()
    print(nombresdb_lst)
    # MOSTRAR TODOS LOS DOCUMENTOS DE LA COLECCION PRODUCTO CUYO PRECIO 800
    documentos_lst_dic = coleccion.find({'precio': 800})
    for documento_dic in documentos_lst_dic:
        print(documento_dic['_id'], ' ', documento_dic['nombre'])

# CUSTRUIR UNA TABLA CON LOS CAMPOS _ID, NOMBRE, PRECIO
def principal2():
    conexion = pymongo.MongoClient("mongodb://localhost:27017/")
    db = conexion['01_tienda']
    coleccion = db['producto']
    documentos_lst_dic = coleccion.find().sort("_id", -1) # pymongo.ASCENDING = 1
                      #db.producto.find().sort({_id: 1});      ASC
    print('%2s %-50s %6s' % ('ID','NOMBRE','PRECIO'))
    print('%2s %-50s %6s' % ('--','------','------'))
    s = 0
    for documento_dic in documentos_lst_dic:
        print('%2s %-50s %6s' % (documento_dic['_id'],documento_dic['nombre'],documento_dic.get('precio',0)))
        s = s + documento_dic.get('precio',0)
    print('SUMA TOTAL: ', s)

# ELIMINAR EL DOCUMENTO CON _ID 49
def principal3():
    conexion = pymongo.MongoClient("mongodb://localhost:27017/")
    db = conexion['01_tienda']
    coleccion = db['producto']
    filtro = {'_id': 49}
    resultado = coleccion.delete_one(filtro)
             #db.producto.deleteOne({_id: 50})
    if resultado.deleted_count == 1:
       print('OK: ELIMINAR')
    else:
       print('ERROR: ELIMINAR')

# INSERTAR UN DOCUMENTO
def principal4():
    conexion = pymongo.MongoClient("mongodb://localhost:27017/")
    db = conexion['01_tienda']
    coleccion = db['producto']
    documento = {
        '_id': 50,
        'nombre': "Televisión",
        'categorias': ['electrodomestico']
    }
    resultado = coleccion.insert_one(documento)
    print('RESULTADO: ', resultado)

# ACTUALIZAR EL PRECIO DEL DOCUMENTO _ID 1 A 0 EUROS
def principal5():
    conexion = pymongo.MongoClient("mongodb://localhost:27017/")
    db = conexion['01_tienda']
    coleccion = db['producto']
    filtro = {'_id': 1}
    nuevos_datos = {"$set": {"precio": 0}}
    resultado = coleccion.update_one(filtro,nuevos_datos)
    if resultado.matched_count == 1:
       print('OK: ACTUALIZAR')
    else:
       print('ERROR: ACTUALIZAR')

    #resultado = coleccion.update_one(filtro, nuevos_datos)
    #nuevos_datos = {"$set": {"edad": 40, "ciudad": "Nueva Ciudad"}}

    # db.coleccion.updateOne(filtro,opcion)
    # db.coleccion.updateOne({_id: 1},{$set {precio: 0}})

# CREAR UNA BASE DE DATOS
def principal6():
    conexion = BaseDatosMongodb()
    if conexion != None:
       print('OK: CONEXION')
       db = conexion['mercadona'] # Crear la base de datos en RAM
       db.create_collection("empleado") # Crear una coleccion(Guarde en disco duro) 
       print('OK: CREAR BASE DE DATOS')
    else:
       print('ERROR: CONEXION')

def principal7():
    conexion = BaseDatosMongodb()
    if conexion != None:
       print('OK: CONEXION')
       db = conexion['plazavea'] # Crear la base de datos en RAM
       coleccion = db["empleado"] # Crear una coleccion 
       db.coleccion.insert_one({}) # Insertar documento en la coleccion (Guarda en disco)
       print('OK: CREAR BASE DE DATOS')
    else:
       print('ERROR: CONEXION') 

# ELIMINAR UNA BASE DE DATOS
def principal8():   
    conexion = BaseDatosMongodb()
    if conexion != None:
       print('OK: CONEXION')
       db = conexion['mercadona'] # Seleccionar la base de datos
       conexion.drop_database('mercadona') # Eliminar base datos
       print('OK: ELIMINAR BASE DATOS')
    else:
       print('ERROR: CONEXION') 

# ELIMINAR UNA COLECCION
def principal9():
    conexion = BaseDatosMongodb()
    if conexion != None:
       print('OK: CONEXION')
       db = conexion['mercadona'] # Seleccionar la base de datos
       coleccion = 'vendedor'
       lista_colecciones = db.list_collection_names()
       if coleccion in lista_colecciones:
          db.drop_collection(coleccion)
          print('OK: ELIMINO COLECCION')
       else:
          print('ERROR: COLECCION NO EXISTE')
    else:
       print('ERROR: CONEXION') 

def principal10():
    conexion = BaseDatosMongodb()
    lista_colecciones = ['vendedor','marketing','factura','cliente']
    if conexion != None:
       print('OK: CONEXION')
       db = conexion['mercadona'] # Seleccionar la base de datos
       lista_colecciones_bd = db.list_collection_names()
       print(lista_colecciones)
       for coleccion in lista_colecciones:
           if coleccion not in lista_colecciones_bd:
              db.create_collection(coleccion)
              print('OK: CREACION COLECCION')
           else:
              print('COLECCION YA EXISTE')
    else:
       print('ERROR: CONEXION') 


if __name__ == "__main__":
   principal10()

