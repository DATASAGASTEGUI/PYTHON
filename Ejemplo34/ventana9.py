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

          self.botFormatear = QPushButton("FORMATEAR", self.pnlPrincipal)
          self.botFormatear.setFont(QFont("Courier New", 8))
          self.botFormatear.setStyleSheet("background-color: black; color: white;")
          self.botFormatear.setGeometry(190, 70, 100, 20)
          self.botFormatear.clicked.connect(self.botFormatearClic)

          self.botReiniciar = QPushButton("REINICIAR", self.pnlPrincipal)
          self.botReiniciar.setFont(QFont("Courier New", 8))
          self.botReiniciar.setStyleSheet("background-color: black; color: white;")
          self.botReiniciar.setGeometry(310, 70, 100, 20)
          self.botReiniciar.clicked.connect(self.botReiniciarClic)             

          self.lstFecha = QListView(self.pnlPrincipal)
          self.dlm1 = QStandardItemModel()
          self.lstFecha.setModel(self.dlm1)
          self.lstFecha.setGeometry(125,100, 100, 200) 

          self.lstFechaFormato = QListView(self.pnlPrincipal)
          self.dlm2 = QStandardItemModel()
          self.lstFechaFormato.setModel(self.dlm2)
          self.lstFechaFormato.setGeometry(255,100, 100, 200)           

      def botInsertarClic(self):
          fecha = self.txtInsertar.text()
          self.dlm1.appendRow(QStandardItem(fecha)) 
      
      def botFormatearClic(self):
          self.dlm2.clear()
          for fila in range(self.dlm1.rowCount()):
              index = self.dlm1.index(fila,0)
              fecha = self.dlm1.data(index)
              self.dlm2.appendRow(QStandardItem(self.formato_fecha(fecha)))
              
      def formato_fecha(self,fecha):
            partes = fecha.split("/")
            dia = partes[0]
            mes = partes[1]
            anio = partes[2]
            if int(dia) <= 9:
               dia = "0" + str(int(dia))
            if int(mes) <= 9:
               mes = "0" + str(int(mes))
            if len(anio) == 2:
               anio = "20" + str(anio)
            fecha = dia + "/" + mes + "/" + anio
            return fecha

      def botReiniciarClic(self):
          self.txtInsertar.clear()
          self.dlm1.clear()
          self.dlm2.clear()
     

if __name__ == '__main__':       # METODO PRINCIPAL
    app = QApplication(sys.argv) # ABRIR APLICACION
    ventana = VentanaPython()    # Objeto de la ventana
    ventana.show()               # Muestra la ventana
    sys.exit(app.exec_())        # CERRAR APLICACION