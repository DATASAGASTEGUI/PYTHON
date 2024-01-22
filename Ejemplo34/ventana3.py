import sys
from PyQt5.QtWidgets import QApplication, QMainWindow, QWidget, QLabel, QPushButton
from PyQt5.QtGui import QIcon, QFont
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
          self.lblMensaje = QLabel("",self.pnlPrincipal) #Crear objeto label
          self.lblMensaje.setFont(QFont("Courier New", 12))
          self.lblMensaje.setStyleSheet("color: #FF0000;") #Color letra RGB
          self.lblMensaje.setAlignment(Qt.AlignCenter)
          self.lblMensaje.setGeometry(0, 50, 480, 20)

          self.botNombre = QPushButton("NOMBRE", self.pnlPrincipal)
          self.botNombre.setFont(QFont("Courier New", 8))
          self.botNombre.setStyleSheet("background-color: black; color: white;")
          self.botNombre.setGeometry(200, 150, 80, 20)
          self.botNombre.clicked.connect(self.botNombreClic)

      def botNombreClic(self):
          self.lblMensaje.setText("WALTER ISMAEL SAGASTEGUI LESCANO")
          
if __name__ == '__main__':       # METODO PRINCIPAL
    app = QApplication(sys.argv) # ABRIR APLICACION
    ventana = VentanaPython()    # Objeto de la ventana
    ventana.show()               # Muestra la ventana
    sys.exit(app.exec_())        # CERRAR APLICACION