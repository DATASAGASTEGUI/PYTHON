import os, jaydebeapi

from Ejemplo26.Ejemplo1.Trabajador import Trabajador


def BaseDatosHsqldb():
    driver = 'org.hsqldb.jdbcDriver'
    hsqldb_jar = 'C:\\CERTIFICADO\\PYTHON\\Ejemplo25\\hsqldb.jar'
    usuario = 'SA'
    contrasena = '12345678'
    url = 'jdbc:hsqldb:file:C:\\CERTIFICADO\\PYTHON\\Ejemplo25\\datos\\datos.hsqldb'
    conexion = None
    try:
        conexion = jaydebeapi.connect(driver,url,[usuario,contrasena],hsqldb_jar)
    except:
        conexion = None
    return conexion
       
def principal():
    os.system('cls')
    conexion = BaseDatosHsqldb()
    if conexion != None:
       print('OK: CONEXION')
       query = "SELECT * FROM Trabajador"
       cursor = conexion.cursor() # PreparedStatement ps = conexion.
       cursor.execute(query)
       resultado_lst_tup = cursor.fetchall()
       trabajadores_lst = []
       for trabajador_tup in resultado_lst_tup:
           trabajador = Trabajador(trabajador_tup[0],
                                   trabajador_tup[1],
                                   trabajador_tup[2],
                                   trabajador_tup[3],
                                   trabajador_tup[4]) 
           trabajadores_lst.append(trabajador)

       for trabajador in trabajadores_lst:
           trabajador.mostrar_formato_csv()
        
       Trabajador.cabecera()
       for trabajador in trabajadores_lst:
           trabajador.cuerpo()
           
    else:
       print('ERROR: CONEXION')

if __name__ == "__main__":
   principal()