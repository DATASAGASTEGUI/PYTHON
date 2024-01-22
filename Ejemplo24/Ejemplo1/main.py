import os, sys, mysql.connector, csv
from operacionesCRUD import BaseDatosMysql,crear_tabla,insertar,mostrar,actualizar,eliminar,buscar

def salir():
    os.system('cls')
    print('GRACIAS POR SU VISITA')
    sys.exit()

def default():
    pass

menu_dic = {
    '1': crear_tabla,
    '2': insertar,
    '3': mostrar,
    '4': actualizar,
    '5': eliminar,
    '6': buscar,
    '0': salir
}

def main():
    while True:
        os.system("cls")
        print('MENU')
        print('----')
        print('[1] CREAR TABLA TRABAJADOR')
        print('[2] INSERTAR REGISTROS')
        print('[3] MOSTRAR TODOS LOS REGISTROS')
        print('[4] ACTUALIZAR UN REGISTRO')
        print('[5] ELIMINAR UN REGISTRO')
        print('[6] BUSCAR POR ID DE TRABAJADOR')
        print('[0] SALIR')

        opcion = input('INGRES OPCION? ')
        funcion = menu_dic.get(opcion,default)
        os.system('cls');funcion()

if __name__ == "__main__":
   main()
 