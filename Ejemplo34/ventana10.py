import sys, re
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
           
          self.txtInsertar = QLineEdit(self.pnlPrincipal)
          self.txtInsertar.setGeometry(190, 40, 100, 20)
          self.txtInsertar.setFont(QFont("Courier New", 9))
          self.txtInsertar.setAlignment(Qt.AlignCenter)
          self.txtInsertar.setStyleSheet("color: blue;") 

          self.botInsertar = QPushButton("INSERTAR", self.pnlPrincipal)
          self.botInsertar.setFont(QFont("Courier New", 8))
          self.botInsertar.setStyleSheet("background-color: black; color: white;")
          self.botInsertar.setGeometry(70, 70, 100, 20)
          self.botInsertar.clicked.connect(self.botInsertarClic)

          self.botContarVocal = QPushButton("CONTAR", self.pnlPrincipal)
          self.botContarVocal.setFont(QFont("Courier New", 8))
          self.botContarVocal.setStyleSheet("background-color: black; color: white;")
          self.botContarVocal.setGeometry(190, 70, 100, 20)
          self.botContarVocal.clicked.connect(self.botContarVocalClic)

          self.botReiniciar = QPushButton("REINICIAR", self.pnlPrincipal)
          self.botReiniciar.setFont(QFont("Courier New", 8))
          self.botReiniciar.setStyleSheet("background-color: black; color: white;")
          self.botReiniciar.setGeometry(310, 70, 100, 20)
          self.botReiniciar.clicked.connect(self.botReiniciarClic)             

          self.lstOracion = QListView(self.pnlPrincipal)
          self.dlm1 = QStandardItemModel()
          self.lstOracion.setModel(self.dlm1)
          self.lstOracion.setGeometry(125,100, 100, 200) 
          self.lstOracion.setSelectionMode(QListView.MultiSelection)

          self.lstFechaFormato = QListView(self.pnlPrincipal)
          self.dlm2 = QStandardItemModel()
          self.lstFechaFormato.setModel(self.dlm2)
          self.lstFechaFormato.setGeometry(255,100, 100, 200)           

      def botInsertarClic(self):
          numero = self.txtInsertar.text()
          self.dlm1.appendRow(QStandardItem(numero)) 
      
      def botContarVocalClic(self):
          print("ENTRO")
          self.dlm2.clear()
          index_seleccionado = self.lstOracion.selectedIndexes()
          for index in index_seleccionado:
              numero = index.data()
              self.dlm2.appendRow(QStandardItem(self.mostrar1(float(numero))))

      def mostrar1(self,numero):
            entero = int(numero)
            decimal = round((numero - entero)*100) # 60
            if decimal % 10 == 0:
               cadena = str(numero) + "0" + ":" + "SI"
            else:
               cadena = str(numero) + ":" + "NO"
            return cadena
              
      def botReiniciarClic(self):
          self.txtInsertar.clear()
          self.dlm1.clear()
          self.dlm2.clear()
     

if __name__ == '__main__':       # METODO PRINCIPAL
    app = QApplication(sys.argv) # ABRIR APLICACION
    ventana = VentanaPython()    # Objeto de la ventana
    ventana.show()               # Muestra la ventana
    sys.exit(app.exec_())        # CERRAR APLICACION