import cx_Oracle
# pip installa cx_Oracle

def get_conexion_oracle():
    conexion = None
    try:
        url = cx_Oracle.makedsn(host='localhost', port='1521', service_name='xepdb1')
        conexion = cx_Oracle.connect(user='dbinstituto', password='12345678', dsn=url)
    except:
        conexion = None
    return conexion

def ejemplo1():
    conexion = get_conexion_oracle()
    if(conexion != None):
       print("OK: CONEXION")
    else:
       print("ERROR: CONEXION")


def ejemplo2():
    conexion = get_conexion_oracle()
    if(conexion != None):
       try:
           query = '''SELECT d.nombre, COUNT(a.nombre) AS CANTIDAD
                      FROM Departamento d
                      INNER JOIN Alumno a ON d.id_departamento = a.id_departamento
                      GROUP BY d.nombre
                      ORDER BY d.nombre'''
           cursor = conexion.cursor()
           cursor.execute(query)

           resultado = cursor.fetchall()
           for fila in resultado:
               print(fila)

           
           for fila in cursor:
               nombre, CANTIDAD = fila
               print(nombre, '  ', CANTIDAD)
               

           cursor.close()
           conexion.close()
       except:
           print("ERROR: QUERY")
    else:
       print("ERROR: CONEXION")

ejemplo2()

