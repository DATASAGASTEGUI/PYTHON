import os
import mysql.connector, csv

def BaseDatosMysql():
    conexion = None
    try:
        conexion = mysql.connector.connect(
        host="localhost",
        port="3307",
        user="root",
        password="12345678",
        database="ventadeproductos")
    except:
        conexion = None
    return conexion

# MOSTRAR LOS PRODUCTOS COMPRADOS POR CADA CLIENTE
def mostrar1():
    print('[1] MOSTRAR TODOS LOS REGISTROS: JOIN EXPLICITO')
    print('-----------------------------------------------')
    conexion = BaseDatosMysql()
    if  conexion != None:
        print('OK: CONEXION')
        try:
            query = '''SELECT C.NOMBRE AS CLIENTE, P.NOMBRE AS PRODUCTO
                       FROM CLIENTES_X_PRODUCTO CP
                       JOIN PRODUCTO P ON P.CODIGO = CP.CODIGO
                       JOIN CLIENTE C ON C.IDCLIENTE = CP.IDCLIENTE
                       ORDER BY C.NOMBRE;'''      # Crear la query
            cursor = conexion.cursor()            # Crear el cursor. Es el que ejecuta las query
            cursor.execute(query)                 # Ejecutar la query. El resultado se guarda en el cursor
            resultado_lst_tup = cursor.fetchall() # Recupear los datos del cursor
            for resultado_tup in resultado_lst_tup:
                print(resultado_tup)
            print('OK: SELECT')
        except:
            print('ERROR: SELECT')
    else:
        print('ERROR: CONEXION')

#MOSTRAR LOS PRODUCTOS COMPRADOS POR CADA CLIENTE
def mostrar2():
    print('[2] MOSTRAR TODOS LOS REGISTROS: JOIN IMPLICITO')
    print('-----------------------------------------------')
    conexion = BaseDatosMysql()
    if  conexion != None:
        print('OK: CONEXION')
        try:
            query = '''SELECT C.NOMBRE AS CLIENTE, P.NOMBRE AS PRODUCTO
                       FROM CLIENTES_X_PRODUCTO CP, PRODUCTO P, CLIENTE C 
                       WHERE P.CODIGO=CP.CODIGO AND C.IDCLIENTE=CP.IDCLIENTE
                       ORDER BY C.NOMBRE;'''      # Crear la query
            cursor = conexion.cursor()            # Crear el cursor. Es el que ejecuta las query
            cursor.execute(query)                 # Ejecutar la query. El resultado se guarda en el cursor
            resultado_lst_tup = cursor.fetchall() # Recupear los datos del cursor
            for resultado_tup in resultado_lst_tup:
                print(resultado_tup)
            print('OK: SELECT')
        except:
            print('ERROR: SELECT')
    else:
        print('ERROR: CONEXION')

if __name__ == "__main__":
   os.system('cls')
   mostrar1()
   mostrar2()