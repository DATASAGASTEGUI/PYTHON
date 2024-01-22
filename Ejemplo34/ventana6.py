import sys, math
from PyQt5.QtWidgets import (
    QApplication, QMainWindow, QWidget, 
    QLabel, QPushButton, QLineEdit, QMessageBox,
    QRadioButton, QButtonGroup
)
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
          self.lblRadio = QLabel("RADIO?",self.pnlPrincipal) #Crear objeto label
          self.lblRadio.setFont(QFont("Courier New", 10))
          self.lblRadio.setStyleSheet("color: #000000;") #Color letra RGB
          self.lblRadio.setAlignment(Qt.AlignLeft)
          self.lblRadio.setGeometry(130, 80, 150, 20)

          self.lblArea = QLabel("AREA:",self.pnlPrincipal) #Crear objeto label
          self.lblArea.setFont(QFont("Courier New", 10))
          self.lblArea.setStyleSheet("color: #000000;") #Color letra RGB
          self.lblArea.setAlignment(Qt.AlignLeft)
          self.lblArea.setGeometry(130, 120, 150, 20) 

          self.lblPerimetro = QLabel("PERIMETRO:",self.pnlPrincipal) #Crear objeto label
          self.lblPerimetro.setFont(QFont("Courier New", 10))
          self.lblPerimetro.setStyleSheet("color: #000000;") #Color letra RGB
          self.lblPerimetro.setAlignment(Qt.AlignLeft)
          self.lblPerimetro.setGeometry(130, 160, 150, 20) 

          self.txtRadio = QLineEdit(self.pnlPrincipal)
          self.txtRadio.setGeometry(250, 80, 100, 20)
          self.txtRadio.setFont(QFont("Courier New", 9))
          self.txtRadio.setAlignment(Qt.AlignCenter)
          self.txtRadio.setStyleSheet("color: blue;")    

          self.txtArea = QLineEdit(self.pnlPrincipal)
          self.txtArea.setGeometry(250, 120, 100, 20)
          self.txtArea.setFont(QFont("Courier New", 9))
          self.txtArea.setAlignment(Qt.AlignCenter)
          self.txtArea.setStyleSheet("color: red;") 
          self.txtArea.setReadOnly(True)

          self.txtPerimetro = QLineEdit(self.pnlPrincipal)
          self.txtPerimetro.setGeometry(250, 160, 100, 20)
          self.txtPerimetro.setFont(QFont("Courier New", 9))
          self.txtPerimetro.setAlignment(Qt.AlignCenter)
          self.txtPerimetro.setStyleSheet("color: red;") 
          self.txtPerimetro.setReadOnly(True)                                   

          self.rdoCalcular = QRadioButton("CALCULAR", self.pnlPrincipal)
          self.rdoCalcular.setGeometry(110, 220, 95, 20)
          self.rdoCalcular.setFont(QFont("Courier New", 8))
          self.rdoCalcular.clicked.connect(self.botCalculoClic)

          self.rdoReiniciar = QRadioButton("REINICIAR", self.pnlPrincipal)
          self.rdoReiniciar.setGeometry(200, 220, 95, 20)
          self.rdoReiniciar.setFont(QFont("Courier New", 8)) 
          self.rdoReiniciar.clicked.connect(lambda: self.botReiniciarClic())         

          self.rdoSalir = QRadioButton("SALIR", self.pnlPrincipal)
          self.rdoSalir.setGeometry(310, 220, 95, 20)
          self.rdoSalir.setFont(QFont("Courier New", 8))
          self.rdoSalir.clicked.connect(lambda: self.botSalirClic())  

          # AGRUPAR LOS RADIOBUTTON
          self.grupo_accion = QButtonGroup()
          self.grupo_accion.addButton(self.rdoCalcular)
          self.grupo_accion.addButton(self.rdoReiniciar)
          self.grupo_accion.addButton(self.rdoSalir)

          self.grupo_accion.setExclusive(True) # Selecciona Simple (uno a la vez)

      def botCalculoClic(self):
          try:
            radio = float(self.txtRadio.text())
            area = math.pi * math.pow(radio,2) 
            perimetro = 2 * math.pi * radio
            self.txtArea.setText(str(round(area,2)))
            self.txtPerimetro.setText(str(round(perimetro,2)))
          except Exception as e:
            QMessageBox.critical(self,"ERROR","ENTRADA INCORRECTA")

      def botReiniciarClic(self):
          self.txtRadio.clear()
          self.txtArea.clear()
          self.txtPerimetro.clear()
      
      def botSalirClic(self):
          self.close()
          
if __name__ == '__main__':       # METODO PRINCIPAL
    app = QApplication(sys.argv) # ABRIR APLICACION
    ventana = VentanaPython()    # Objeto de la ventana
    ventana.show()               # Muestra la ventana
    sys.exit(app.exec_())        # CERRAR APLICACION