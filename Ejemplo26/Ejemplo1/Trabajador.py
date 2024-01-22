class Trabajador:
      # ATRIBUTOS O VARIABLES DE INSTANCIA DE LA CLASE
      def __init__(self, id_trabajador, nombre, apaterno, tipo_trabajador, parametros_sueldo):
          self.id_trabajador = id_trabajador
          self.nombre = nombre
          self.apaterno = apaterno 
          self.tipo_trabajador = tipo_trabajador
          self.parametros_sueldo = parametros_sueldo
 
      # MOSTRAR LOS ATRIBUTOS DEL OBJETO
      def __str__(self):
          return (self.id_trabajador + ' ' + self.nombre + ' ' + self.apaterno \
                 + ' ' + str(self.tipo_trabajador) + ' ' + self.parametros_sueldo)
       
      def mostrar_formato_csv(self):
          print(self.id_trabajador + ';' + self.nombre + ';' + self.apaterno \
                 + ';' + str(self.tipo_trabajador) + ';' + self.parametros_sueldo)

      def cabecera():
          print('%-15s %-15s %-15s %8s %-14s' % ('IDTRABAJADOR','NOMBRE','APATERNO','TIPO_T','PARAMETROS_S'))
          print('%-15s %-15s %-15s %8s %-14s' % ('------------','------','--------','------','------------'))
            
      def cuerpo(self):
          print('%-15s %-15s %-15s %8s %-14s' % (self.id_trabajador,
                                                 self.nombre,
                                                 self.apaterno,
                                                 self.tipo_trabajador,
                                                 self.parametros_sueldo))