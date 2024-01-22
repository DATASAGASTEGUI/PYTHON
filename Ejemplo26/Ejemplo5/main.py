import os
class Alumno:
      #VARIABLES DE CLASE
      centro_estudio = "CampusFP"

      #CONSTRUCTOR
      def __init__(self, idAlumno, nombre):
          #VARIABLES DE INSTANCIA U OBJETO
          self.idAlumno = idAlumno
          self.nombre = nombre
     
      #METODO DE CLASE
      @classmethod
      def institucion(cls):
          return cls.centro_estudio
      
      #METODO STATIC
      @staticmethod
      def cabecera():
          print("%-8s %8s" % ('IDALUMNO','NOMBRE'))
          print("%-8s %8s" % ('--------','------'))

      #METODO DE INSTANCIA
      def __str__(self):
          return f'idAlumno: {self.idAlumno}, nombre: {self.nombre}'      

      #METODO DE INSTANCIA
      def cuerpo(self):    
          print("%-8s %8s" % (self.idAlumno,self.nombre))

if __name__ == "__main__":
   os.system('cls')
   a1 = Alumno('A1', 'Miguel')
   a2 = Alumno('A2', 'Carmen')
   a3 = Alumno('A3', 'Arturo')
   print("Centro Estudio: ", Alumno.institucion()) #Método Clase
   Alumno.cabecera() #Método Static
   a1.cuerpo() #Método Instancia
   a2.cuerpo() #Método Instancia
   a3.cuerpo() #Método Instancia


