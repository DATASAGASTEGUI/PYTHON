import os, json
os.system('cls')

def ejemplo1():
    nra = 'C:\\CERTIFICADO\\PYTHON\Ejemplo21\\archivojson\\datos.json'
    with open(nra,'r') as f:
         filas = json.load(f)
         print(filas)

def ejemplo2():
    nra = 'C:\\CERTIFICADO\\PYTHON\Ejemplo21\\archivojson\\datos.json'
    with open(nra,'r') as f:
         filas = json.load(f)
         for fila in filas:
             print(fila)

def ejemplo3():
    nra = 'C:\\CERTIFICADO\\PYTHON\Ejemplo21\\archivojson\\datos.json'
    with open(nra,'r') as f:
         filas_lst_dic = json.load(f)
         cabecera()
         for fila_dic in filas_lst_dic:
             nombre = fila_dic['nombre']
             edad = fila_dic['edad']
             curso = fila_dic['curso']
             cuerpo(nombre,edad,curso)

def cabecera():
    print('%-14s %4s %-12s' % ('NOMBRE','EDAD','CURSO'))
    print('%-14s %4s %-12s' % ('------','----','-----'))

def cuerpo(nombre,edad,curso):
    print('%-14s %4s %-12s' % (nombre, edad, curso))

ejemplo3()
