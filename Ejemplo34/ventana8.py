import sys
from PyQt5.QtWidgets import (
    QApplication, QMainWindow, QWidget, 
    QLineEdit, QPushButton, QListView, QMessageBox
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
           
          self.txtSerie = QLineEdit(self.pnlPrincipal)
          self.txtSerie.setGeometry(190, 40, 100, 20)
          self.txtSerie.setFont(QFont("Courier New", 9))
          self.txtSerie.setAlignment(Qt.AlignCenter)
          self.txtSerie.setStyleSheet("color: blue;") 

          self.botSerie = QPushButton("SERIE", self.pnlPrincipal)
          self.botSerie.setFont(QFont("Courier New", 8))
          self.botSerie.setStyleSheet("background-color: black; color: white;")
          self.botSerie.setGeometry(140, 70, 100, 20)
          self.botSerie.clicked.connect(self.botSerieClic)

          self.botReiniciar = QPushButton("REINICIAR", self.pnlPrincipal)
          self.botReiniciar.setFont(QFont("Courier New", 8))
          self.botReiniciar.setStyleSheet("background-color: black; color: white;")
          self.botReiniciar.setGeometry(250, 70, 100, 20)
          self.botReiniciar.clicked.connect(self.botReiniciarClic)             

          self.lstSerie = QListView(self.pnlPrincipal)
          self.dlm = QStandardItemModel()
          self.lstSerie.setModel(self.dlm)
          self.lstSerie.setGeometry(190,100, 100, 200)  

      def botSerieClic(self):
          try:
                self.dlm.clear()
                n = int(self.txtSerie.text())
                for x in range(1,(n+1)):
                    self.dlm.appendRow(QStandardItem(str(x))) 
          except:
                QMessageBox.critical(self,"ERROR","ENTRADA INCORRECTA")
                 
      def botReiniciarClic(self):
          self.txtSerie.clear()
          self.dlm.clear()
     

if __name__ == '__main__':       # METODO PRINCIPAL
    app = QApplication(sys.argv) # ABRIR APLICACION
    ventana = VentanaPython()    # Objeto de la ventana
    ventana.show()               # Muestra la ventana
    sys.exit(app.exec_())        # CERRAR APLICACION