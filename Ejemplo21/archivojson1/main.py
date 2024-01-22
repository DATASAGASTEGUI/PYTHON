import os, json
os.system('cls')

def ejemplo1():
    nra = 'C:\\CERTIFICADO\\PYTHON\\Ejemplo21\\archivojson1\\datos.json'
    with open(nra, 'r') as f:
         filas_lst_dic = json.load(f) 
         for fila_dic in filas_lst_dic:
             idTrabajador = fila_dic['idTrabajador']
             nombre = fila_dic['nombre']
             apaterno = fila_dic['apaterno']
             tipoTrabajador = fila_dic['tipoTrabajador']
             parametrosSueldo_lst = fila_dic['parametrossueldo_lst']
             print(idTrabajador)
             print(nombre)
             print(apaterno)
             print(tipoTrabajador)
             print(parametrosSueldo_lst)

def cabecera():
    print('%-12s %-12s %-12s %16s %-12s' % ('IDTRABAJADOR','NOMBRE','APATERNO','TIPO-TRABAJADOR','PARA-SUELDO'))
    print('%-12s %-12s %-12s %16s %-12s' % ('------------','------','--------','---------------','-----------'))

def cuerpo(idTrabajador,nombre,apaterno,tipoTrabajador,parametrosSueldo):
    print('%-12s %-12s %-12s %16s %-12s' % (idTrabajador,nombre,apaterno,tipoTrabajador,parametrosSueldo))

def ejemplo2():
    nra = 'C:\\CERTIFICADO\\PYTHON\\Ejemplo21\\archivojson1\\datos.json'
    with open(nra, 'r') as f:
         filas_lst_dic = json.load(f) 
         cabecera()
         for fila_dic in filas_lst_dic:
             idTrabajador = fila_dic['idTrabajador']
             nombre = fila_dic['nombre']
             apaterno = fila_dic['apaterno']
             tipoTrabajador = fila_dic['tipoTrabajador']
             parametrosSueldo_lst = fila_dic['parametrossueldo_lst']
             cuerpo(idTrabajador,nombre,apaterno,tipoTrabajador,parametrosSueldo_lst)

def cabecera3():
    print('%-12s %-12s %-12s %16s %-12s %10s' % ('IDTRABAJADOR','NOMBRE','APATERNO','TIPO-TRABAJADOR','PARA-SUELDO','SUELDO'))
    print('%-12s %-12s %-12s %16s %-12s %10s' % ('------------','------','--------','---------------','-----------','------'))

def cuerpo3(idTrabajador,nombre,apaterno,tipoTrabajador,parametrosSueldo,sueldo):
    print('%-12s %-12s %-12s %16s %-12s %10s' % (idTrabajador,nombre,apaterno,tipoTrabajador,parametrosSueldo,sueldo))

def calculo_sueldo(tipoTrabajador, parametrosSueldo_lst):
    sueldo = 0
    if tipoTrabajador == 1:
       sueldo = parametrosSueldo_lst[0] * 4
    if tipoTrabajador == 4:
       sueldo = parametrosSueldo_lst[0] * 15 + parametrosSueldo_lst[1] * 20
    return sueldo

def ejemplo3():
    nra = 'C:\\CERTIFICADO\\PYTHON\\Ejemplo21\\archivojson1\\datos.json'
    with open(nra, 'r') as f:
         filas_lst_dic = json.load(f) 
         cabecera3()
         for fila_dic in filas_lst_dic:
             idTrabajador = fila_dic['idTrabajador']
             nombre = fila_dic['nombre']
             apaterno = fila_dic['apaterno']
             tipoTrabajador = fila_dic['tipoTrabajador']
             parametrosSueldo_lst = fila_dic['parametrossueldo_lst']
             sueldo = calculo_sueldo(tipoTrabajador, parametrosSueldo_lst)
             cuerpo3(idTrabajador,nombre,apaterno,tipoTrabajador,parametrosSueldo_lst,sueldo)

ejemplo3()

'''
TRABAJADOR TIPO 1
return this.salarioSemanalFijo * 4;

TRABAJADOR TIPO 4 (15=PHT, 20=PHTE)
        return this.numeroHorasTrabajadas * Constante.PHT +
               this.numeroHorasExtras * Constante.PHTE;
'''