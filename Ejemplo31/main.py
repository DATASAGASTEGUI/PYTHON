import os
import psycopg2
# pip install psycopg2

def principal():
    # PARAMETROS DE CONEXION A LA BASE DE DATOS
    db_config = {
        'host': 'localhost',
        'database': 'academia',
        'user': 'postgres',
        'password': '12345678',
        'port': 5432
    }

    try: 
        conexion = psycopg2.connect(**db_config)
        cursor = conexion.cursor()
        query = "SELECT * FROM Alumno"
        cursor.execute(query)
        resultado = cursor.fetchall()
        for fila in resultado:
            print(fila)
        cursor.close()
        conexion.close()
    except:
        print("ERROR")

if __name__ == "__main__":
   principal()