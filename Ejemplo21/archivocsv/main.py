import os, csv

os.system('cls')

def ejemplo1():
    nra = 'C:\\CERTIFICADO\\PYTHON\Ejemplo21\\archivocsv\\trabajador.csv'
    try:
         with open(nra, 'r') as f:
              filas = csv.reader(f,delimiter=';')
              filas_lst = list(filas)
              
              print(type(filas_lst))
              print(list(filas_lst))
    except:
        print('ERROR: LECTURA')

def ejemplo2():
    nra = 'C:\\CERTIFICADO\\PYTHON\Ejemplo21\\archivocsv\\trabajador.csv'
    try:
         with open(nra, 'r') as f:
              filas = csv.reader(f,delimiter=';')
              filas_lst = list(filas)
              for fila in filas_lst:
                  print(fila)
    except:
        print('ERROR: LECTURA')
     
def ejemplo3():
    nra = 'C:\\CERTIFICADO\\PYTHON\Ejemplo21\\archivocsv\\trabajador.csv'
    try:
         with open(nra, 'r') as f:
              filas = csv.reader(f,delimiter=';')
              filas_lst = list(filas)
              cabecera()
              for fila in filas_lst:
                  idTrabajador =  fila[0] 
                  nombre = fila[1] 
                  apaterno = fila[2]
                  tipoTrabajador = fila[3]
                  parametrosSueldo = fila[4]
                  cuerpo(idTrabajador,nombre,apaterno,tipoTrabajador,parametrosSueldo)
    except:
        print('ERROR: LECTURA')

def cabecera():
    print('%-12s %-12s %-12s %16s %-12s' % ('IDTRABAJADOR','NOMBRE','APATERNO','TIPO-TRABAJADOR','PARA-SUELDO'))
    print('%-12s %-12s %-12s %16s %-12s' % ('------------','------','--------','---------------','-----------'))

def cuerpo(idTrabajador,nombre,apaterno,tipoTrabajador,parametrosSueldo):
    print('%-12s %-12s %-12s %16s %-12s' % (idTrabajador,nombre,apaterno,tipoTrabajador,parametrosSueldo))

ejemplo2()