import sys, os
from PyQt5.QtWidgets import (
    QApplication, QMainWindow, QWidget, QLabel, QPushButton, QLineEdit,
    QMessageBox
)
from PyQt5.QtGui import QIcon, QFont
from PyQt5.QtCore import Qt
from ventana14_datos import verificar_usuario

import ventana14_menu

class VentanaPython(QMainWindow):# HERECIA 
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
          self.lblLogin = QLabel("LOGIN",self.pnlPrincipal) #Crear objeto label
          self.lblLogin.setFont(QFont("Courier New", 12))
          self.lblLogin.setStyleSheet("color: #FF0000;") #Color letra RGB
          self.lblLogin.setAlignment(Qt.AlignCenter)
          self.lblLogin.setGeometry(190, 60, 100, 20)

          self.txtLogin = QLineEdit(self.pnlPrincipal)
          self.txtLogin.setGeometry(190, 90, 100, 20)
          self.txtLogin.setFont(QFont("Courier New", 9))
          self.txtLogin.setAlignment(Qt.AlignCenter)
          self.txtLogin.setStyleSheet("color: blue;")     

          self.lblPassword = QLabel("PASSWORD",self.pnlPrincipal) #Crear objeto label
          self.lblPassword.setFont(QFont("Courier New", 12))
          self.lblPassword.setStyleSheet("color: #FF0000;") #Color letra RGB
          self.lblPassword.setAlignment(Qt.AlignCenter)
          self.lblPassword.setGeometry(190, 120, 100, 20)

          self.txtPassword = QLineEdit(self.pnlPrincipal)
          self.txtPassword.setGeometry(190, 150, 100, 20)
          self.txtPassword.setFont(QFont("Courier New", 9))
          self.txtPassword.setAlignment(Qt.AlignCenter)
          self.txtPassword.setStyleSheet("color: blue;")  
          self.txtPassword.setEchoMode(QLineEdit.Password)                  

          self.botAceptar = QPushButton("ACEPTAR", self.pnlPrincipal)
          self.botAceptar.setFont(QFont("Courier New", 8))
          self.botAceptar.setStyleSheet("background-color: black; color: white;")
          self.botAceptar.setGeometry(190, 180, 100, 20)
          self.botAceptar.clicked.connect(self.botAceptarClic)

      def botAceptarClic(self):
          login = self.txtLogin.text()
          password = self.txtPassword.text()
          if verificar_usuario(login,password) == True:
             QMessageBox.information(self,"INFORMACION","USUARIO CORRECTO") 
             self.objeto_ventana_menu = ventana14_menu.Ventana()
             self.objeto_ventana_menu.show()
             self.close()
          else:
             QMessageBox.critical(self,"ERROR","USUARIO O CONTRASEÑA INCORRECTO") 

if __name__ == '__main__':       # METODO PRINCIPAL
    app = QApplication(sys.argv) # ABRIR APLICACION
    ventana = VentanaPython()    # Objeto de la ventana
    ventana.show()               # Muestra la ventana
    sys.exit(app.exec_())        # CERRAR APLICACION