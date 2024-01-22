import sys, os
from PyQt5.QtWidgets import (
    QApplication, QMainWindow, QWidget, QAction
)
from PyQt5.QtGui import QIcon

import ventana11, ventana12, ventana13

class Ventana(QMainWindow):# HERECIA 
      def __init__(self): # CONSTRUCTOR
          super().__init__()
          self.pesonalizarVentana()
          self.personalizarComponentes()

      def pesonalizarVentana(self):
          self.setWindowTitle("VENTANA PYQT5")  # Crear una ventana y poner un título
          self.setFixedSize(480, 330) # Poner un ancho y altura a la ventana y no redimensiona
          self.setStyleSheet("background-color: lightgray;") # Color de fondo

          # Cambiar el icono de la ventana con una ruta absoluta que se crea a partir de una relativa
          ruta_relativa = "Ejemplo34/cross1.png"
          ruta_absoluta = os.path.abspath(ruta_relativa)
          print(ruta_absoluta) # F:\CURSOS\TRABAJANDO\PROJECTS___PYTHON\PYTHON_TEXTO\PYTHON\PYTHON_0033\cross1.png
          self.setWindowIcon(QIcon(ruta_absoluta))

          # Centrar la ventana en la pantalla
          self.pnlPrincipal = QWidget() # Crear un contenedor principal
          self.setCentralWidget(self.pnlPrincipal) # Establecer el contenedor principal para nuestra ventana
     
      def personalizarComponentes(self):
          menu_bar = self.menuBar() # Crear una barra de menú
          
          aplicacion_menu = menu_bar.addMenu('APLICACION') # Crear el menú aplicación
          file_menu = menu_bar.addMenu('FILE')

          accion11 = QAction("Aplicacion Ventana 11", self)
          accion11.triggered.connect(self.abrirVentana11)

          accion12 = QAction("Aplicacion Ventana 12", self)
          accion12.triggered.connect(self.abrirVentana12)  

          accion13 = QAction("Aplicacion Ventana 13", self)
          accion13.triggered.connect(self.abrirVentana13) 

          accion = QAction("Exit",self) 
          accion.triggered.connect(self.cerrarAplicacion)                   
          
          aplicacion_menu.addAction(accion11)
          aplicacion_menu.addAction(accion12)
          aplicacion_menu.addAction(accion13)

          file_menu.addAction(accion)

      def cerrarAplicacion(self):
          sys.exit()

      def abrirVentana11(self):
          self.objeto_ventana11 = ventana11.Ventana()
          self.objeto_ventana11.show() 

      def abrirVentana12(self):
          self.objeto_ventana12 = ventana12.Ventana()
          self.objeto_ventana12.show() 
      
      def abrirVentana13(self):
          self.objeto_ventana13 = ventana13.Ventana()
          self.objeto_ventana13.show() 

if __name__ == '__main__':       # METODO PRINCIPAL
    app = QApplication(sys.argv) # ABRIR APLICACION
    ventana = Ventana()    # Objeto de la ventana
    ventana.show()               # Muestra la ventana
    sys.exit(app.exec_())        # CERRAR APLICACION