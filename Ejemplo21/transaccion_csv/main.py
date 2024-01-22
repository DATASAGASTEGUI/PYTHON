import os, csv
os.system('cls')

# LECTURA DEL ARCHIVO CSV
def ejemplo1():
    nra = '.\\Ejemplo21\\transaccion_csv\\Transaccion.csv'
    try:
        with open(nra, 'r') as f:
             filas = csv.reader(f,delimiter=';')
             filas_lst_lst = list(filas)
             for transaccion_lst in filas_lst_lst:
                 print(transaccion_lst)
    except:
        print('ERROR: LECTURA')

# CONVERTIR ARCHIVO CSV TO JSON
def ejemplo2():
    nra = '.\\Ejemplo21\\transaccion_csv\\Transaccion.csv'
    try:
        with open(nra, 'r') as f:
             filas = csv.reader(f,delimiter=';')
             filas_lst_lst = list(filas)
             filas_lst_dic = []
             for transaccion_lst in filas_lst_lst:
                 diccionario = {}
                 diccionario['idTransaccion'] = transaccion_lst[0]
                 diccionario['ciudad'] = transaccion_lst[1]
                 diccionario['zona'] = transaccion_lst[2]
                 diccionario['ventas'] = transaccion_lst[3]
                 diccionario['formaPago'] = transaccion_lst[4]
                 diccionario['categoria'] = transaccion_lst[5]
                 filas_lst_dic.append(diccionario)
             print(filas_lst_dic)
    except:
        print('ERROR: LECTURA')

'''
[
{
  'idTransaccion': 1,
  'ciudad': 'Santander',
  'zona': 'Norte',
  'ventas': 1235
  'formaPago': 'Contado'
  'categoria': 'Electrodomestico'
}
]
'''

ejemplo2()