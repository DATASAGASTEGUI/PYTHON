import os,csv

# LECTURA DEL ARCHIVO CSV
def ejemplo1():
    nra = os.getcwd() + "\\" + "Transaccion.csv"
    print(nra)
    try:
        with open(nra, 'r') as f:
             filas = csv.reader(f,delimiter=';')
             filas_lst_lst = list(filas)
             for transaccion_lst in filas_lst_lst:
                 print(transaccion_lst)
    except:
        print('ERROR: LECTURA')

if __name__ == "__main__":
   ejemplo1()