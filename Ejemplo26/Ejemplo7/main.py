import os, csv

class CuentaBancaria:
      
      def __init__(self, titular, saldo, tipo):
          self.titular = titular
          self.saldo = saldo
          self.tipo = tipo

      #METODO DE INSTANCIA
      def depositar(self, monto):
          self.saldo = self.saldo + monto
          print("Se depositaron: ", monto)

      #METODO DE INSTANCIA
      def retirar(self, monto):
          if self.saldo >= monto:
             self.saldo = self.saldo - monto
             print("Se retiraron: ", monto)
          else:
             print("No Hay Fondos")

      #METODO DE INSTANCIA
      def transferencia(self, otra_cuenta, monto):
          if self.saldo >= monto:
             self.saldo = self.saldo - monto
             otra_cuenta.depositar(monto)
             print("Transferencia exitosa de ", monto)
          else:
             print("Sin Fondos Necesarios para la Transferencia")

      #METODO DE INSTANCIA
      def imprimir_saldo(self):
          print("Saldo Actual de : ", self.titular, " es ", self.saldo)

def leerArchivoCsv():
    # LECTURA DEL ARCHIVO CSV
    nra = 'C:\\CERTIFICADO\\PYTHON\\Ejemplo26\\Ejemplo7\\datoscuentas.csv'
    listaCB = []
    try:
        with open(nra, 'r') as f:
             filas = csv.reader(f,delimiter=';')
             filas_lst_lst = list(filas)
             print(filas_lst_lst)
             
             for lista in filas_lst_lst:
                 print(lista[2])
                 '''
                 cb = CuentaBancaria(lista[1],                                   lista[1],
                                     lista[2],
                                     lista[3])
                 
                 
             for cb in listaCB:
                 print(cb.imprimir_saldo())
                 '''
                 
    except:
        print('ERROR: LECTURA')

if __name__ == "__main__":
   os.system('cls')
   c1 = CuentaBancaria("Jesulin",1000,"Tipo 1")
   c2 = CuentaBancaria("Melissa",500, "Tipo 2")

   # ESCENARIO 1
   c1.depositar(200)
   c1.imprimir_saldo()

   # ESCENARIO 2
   c1.retirar(100)
   c1.imprimir_saldo()

   # ESCENARIO 3
   c2.depositar(300)
   c2.imprimir_saldo()
   c2.transferencia(c1,200)


   c1.imprimir_saldo()
   c2.imprimir_saldo()

   leerArchivoCsv()
