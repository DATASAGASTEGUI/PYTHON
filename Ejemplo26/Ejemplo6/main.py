import os

class Vehiculo:
    
      def __init__(self, marca, modelo, color):
          self.marca = marca
          self.modelo = modelo
          self.color = color

      #METODO DE INSTANCIA
      def informacion(self):
          print("Marca : ", self.marca)
          print("Modelo: ", self.modelo)
          print("Color : ", self.color)

      #METODO STATIC
      @staticmethod
      def cabecera():
          print("%-8s %-8s %-8s" % ('MARCA','MODELO','COLOR'))
          print("%-8s %-8s %-8s" % ('-----','------','-----'))
      
      #METODO INSTANCIA
      def cuerpo(self):
          print("%-8s %-8s %-8s" % (self.marca,self.modelo,self.color))

if __name__ == "__main__":
   os.system('cls')
   v1 = Vehiculo("Toyota","Corolla","Rojo")
   v2 = Vehiculo("Honda","Civic","Azul")
   v1.informacion()
   v2.informacion()
   Vehiculo.cabecera()
   v1.cuerpo()
   v2.cuerpo()
