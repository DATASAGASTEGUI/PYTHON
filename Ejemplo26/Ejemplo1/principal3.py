import os, csv

import Trabajador

def principal():
    os.system('cls')
    nra = 'C:\\CERTIFICADO\\PYTHON\\Ejemplo25\\trabajador.csv'
    with open(nra, 'r') as f:
         resultado = csv.reader(f,delimiter=';')
         resultado_lst_lst = list(resultado)
         trabajadores_lst = []
         for resultado_lst in resultado_lst_lst:
             t = Trabajador.Trabajador(resultado_lst[0],
                                       resultado_lst[1],
                                       resultado_lst[2],
                                       resultado_lst[3],
                                       resultado_lst[4])
             trabajadores_lst.append(t)
         # RECORRER LA LISTA DE TRABAJADORES
         for trabajador in trabajadores_lst:
             print(trabajador)




if __name__ == "__main__":
   principal()