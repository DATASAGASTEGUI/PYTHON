import os, mysql.connector, csv

def main():
    # PARAMETROS DE LA CONEXION
    os.system('cls')
    conexion = mysql.connector.connect(
    host="localhost",
    port="3307",
    user="root",
    password="12345678")

    # CREAR CURSOR
    cursor = conexion.cursor()

    # QUERY CREAR Y SELECCIONAR LA BASE DE DATOS
    queryA = "DROP DATABASE IF EXISTS TIENDA"
    queryB = "CREATE DATABASE IF NOT EXISTS TIENDA"
    queryC = "USE TIENDA"

    cursor.execute(queryA)
    cursor.execute(queryB)
    cursor.execute(queryC)

    print('OK: CREATE Y SELECCIONAR DATABASE')

    # QUERY CREAR TABLA TRABAJADOR
    query1 = '''CREATE TABLE IF NOT EXISTS Trabajador(
                 id_trabajador     VARCHAR(6)  NOT NULL PRIMARY KEY,
                 nombre            VARCHAR(20) NOT NULL,
                 apaterno          VARCHAR(30) NOT NULL,
                 tipo_trabajador   INT         NOT NULL,
                 parametros_sueldo VARCHAR(15) NOT NULL
               )'''
    cursor.execute(query1)
    print('OK: CREATE TABLE')
    # LEER ARCHIVO CSV Y LUEGO INSERTAR EN LA TABLA TRABAJADOR
    nra = 'C:\\CERTIFICADO\\PYTHON\Ejemplo24\\Ejemplo3\\trabajador.csv'
    query2 = '''INSERT INTO Trabajador(id_trabajador,nombre,apaterno,tipo_trabajador,parametros_sueldo)
               VALUES(%s,%s,%s,%s,%s)'''
    with open(nra, 'r') as f:
         resultado = csv.reader(f,delimiter=';')
         filas_lst_lst = list(resultado)
         for lista in filas_lst_lst:
             valores = (lista[0],lista[1],lista[2],lista[3],lista[4])
             cursor.execute(query2,valores)
         conexion.commit()
    print('OK: INSERT')

    # MOSTRAR TODOS LOS REGISTROS DE LA TABLA TRABAJADOR
    query3 = 'SELECT * FROM Trabajador'
    cursor.execute(query3)
    resultado_lst_tup = cursor.fetchall()
    for resultado_tup in resultado_lst_tup:
        print(resultado_tup)
    print('OK: SELECT')

    # ACTUALIZAR UN REGISTRO
    nombre_nuevo = 'Arturo'
    id_trabajador_actualizar = 'T2'
    query4 = query = F"UPDATE Trabajador SET nombre = '{nombre_nuevo}' WHERE id_trabajador = '{id_trabajador_actualizar}'"
    cursor.execute(query4)
    conexion.commit()
    print('OK: UPDATE')

    # BUSCAR UN REGISTRO
    id_trabajador_buscar = 'T2'
    query5 = F"SELECT * FROM Trabajador WHERE id_trabajador =  '{id_trabajador_buscar}'"
    cursor.execute(query5)
    resultado_lst_tup = cursor.fetchall()
    for resultado_tup in resultado_lst_tup:
        print(resultado_tup)
    print('OK: SELECT BUSCAR')

    # ELIMINAR UN REGISTRO DADO ID_TRABAJADOR
    id_trabajador_eliminar ='T2' 
    query6 = F"DELETE FROM Trabajador WHERE id_trabajador = '{id_trabajador_eliminar}'"
    cursor.execute(query6)
    conexion.commit()
    if cursor.rowcount == 1:
       print('OK: DELETE')
    else:
       print(F'ERROR: ID_TRABAJADOR {id_trabajador_eliminar} NO EXISTE')

    # ELIMINAR MUCHOS REGISTRO DADO TIPO_TRABAJADOR
    tipo_trabajador = 1
    query7 = F"DELETE FROM Trabajador WHERE tipo_trabajador = {tipo_trabajador}"
    cursor.execute(query7) 
    conexion.commit()
    print('CANTIDAD REGISTROS ELIMINADOS: ',cursor.rowcount)
    if cursor.rowcount != 0:
       print(F'OK: DELETE TIPO_TRABAJADOR {tipo_trabajador}')
    else:
       print(F'ERROR: TIPO_TRABAJADOR {tipo_trabajador} NO EXISTE')  

    # MOSTRAR LA CANTIDAD TOTAL DE REGISTROS EN LA TABLA TRABAJADOR
    query8 = 'SELECT COUNT(*) FROM Trabajador'
    cursor.execute(query8)  
    resultado_lst_tup = cursor.fetchall()  
    for resultado_tup in resultado_lst_tup:
        print('TOTAL REGISTROS QUEDAN: ',resultado_tup[0])
    print('OK: SELECT COUNT')

    # MOSTRAR LA CANTIDAD DE TRABAJADORES POR CADA TIPO_TRABAJADOR Y ORDENADO POR TIPO DE TRABAJADOR
    query9 = '''SELECT tipo_trabajador, COUNT(*)
                FROM Trabajador
                GROUP BY tipo_trabajador
                ORDER BY tipo_trabajador
                '''
    cursor.execute(query9)
    resultado_lst_tup = cursor.fetchall()
    print('ORDENADO POR TIPO_TRABAJADOR')
    for resultado_tup in resultado_lst_tup:
        print('%5s %7s'  % (resultado_tup[0],resultado_tup[1]))

    # MOSTRAR LA CANTIDAD DE TRABAJADORES POR CADA TIPO_TRABAJADOR Y ORDENADO POR CANTIDAD
    query10 = '''SELECT tipo_trabajador, COUNT(*) AS CANTIDAD
                 FROM Trabajador
                 GROUP BY tipo_trabajador
                 ORDER BY CANTIDAD'''
    cursor.execute(query10)
    resultado_lst_tup = cursor.fetchall()
    print('ORDENADO POR LA CANTIDAD')
    for resultado_tup in resultado_lst_tup:
        print('%5s %7s'  % (resultado_tup[0],resultado_tup[1]))

if __name__ == "__main__":
   main()