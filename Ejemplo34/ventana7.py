import sys
from PyQt5.QtWidgets import (
    QApplication, QMainWindow, 
    QWidget, QCheckBox, QListView, QPushButton
)
from PyQt5.QtGui import QIcon, QFont, QStandardItemModel, QStandardItem
from PyQt5.QtCore import Qt

class VentanaPython(QMainWindow):# HERECIA 
      def __init__(self): # CONSTRUCTOR
          super().__init__()
          self.pesonalizarVentana()
          self.personalizarComponentes()

      def pesonalizarVentana(self):
          self.setWindowTitle("VENTANA PYQT5")  # Crear una ventana y poner un título
          self.setFixedSize(480, 330) # Poner un ancho y altura a la ventana y no redimensiona
          self.setStyleSheet("background-color: lightgray;") # Color de fondo

          # Cambiar el icono de la ventana
          icono = QIcon("F:/CURSOS/TRABAJANDO/PROJECTS___PYTHON/PYTHON_TEXTO/PYTHON/PYTHON_0033/cross1.png")
          self.setWindowIcon(icono) 

          # Centrar la ventana en la pantalla
          self.pnlPrincipal = QWidget() # Crear un contenedor principal
          self.setCentralWidget(self.pnlPrincipal) # Establecer el contenedor principal para nuestra ventana
     
      def personalizarComponentes(self):
          
          self.lstCiudad = QListView(self.pnlPrincipal)
          self.dlm = QStandardItemModel()
          self.lstCiudad.setModel(self.dlm)
          self.lstCiudad.setGeometry(190,50, 100, 100)

          self.chk1 = QCheckBox("SEVILLA", self.pnlPrincipal)
          self.chk1.setGeometry(20,180, 80, 20)
          self.chk1.setFont(QFont("Courier New", 8))

          self.chk2 = QCheckBox("GRANADA", self.pnlPrincipal)
          self.chk2.setGeometry(110,180, 80, 20)
          self.chk2.setFont(QFont("Courier New", 8)) 

          self.chk3 = QCheckBox("CORDOBA", self.pnlPrincipal)
          self.chk3.setGeometry(200,180, 80, 20)
          self.chk3.setFont(QFont("Courier New", 8))   

          self.chk4 = QCheckBox("JAEN", self.pnlPrincipal)
          self.chk4.setGeometry(290,180, 80, 20)
          self.chk4.setFont(QFont("Courier New", 8)) 

          self.chk5 = QCheckBox("CADIZ", self.pnlPrincipal)
          self.chk5.setGeometry(370,180, 80, 20)
          self.chk5.setFont(QFont("Courier New", 8))  

          self.botMostrar = QPushButton("MOSTRAR", self.pnlPrincipal)
          self.botMostrar.setFont(QFont("Courier New", 8))
          self.botMostrar.setStyleSheet("background-color: black; color: white;")
          self.botMostrar.setGeometry(190, 240, 100, 20)
          self.botMostrar.clicked.connect(self.mostrar)
         
      def mostrar(self):
          lista_checkbox = [self.chk1, self.chk2, self.chk3, self.chk4, self.chk5]
          lista_checkbox_aspa = []
          for x in lista_checkbox:
              if(x.isChecked()):
                 lista_checkbox_aspa.append(x)
          #AÑADIR A LOS CHECKBOX CON EL ASPA A LA LISTA
          self.dlm.clear()
          for x in lista_checkbox_aspa:
              self.dlm.appendRow(QStandardItem(x.text()))      
      
if __name__ == '__main__':       # METODO PRINCIPAL
    app = QApplication(sys.argv) # ABRIR APLICACION
    ventana = VentanaPython()    # Objeto de la ventana
    ventana.show()               # Muestra la ventana
    sys.exit(app.exec_())        # CERRAR APLICACION
