
import ventana11, sys

from PyQt5.QtWidgets import ( 
     QHeaderView,QApplication, QMainWindow, QTableWidget,
     QTableWidgetItem, QPushButton
)

from PyQt5.QtGui import QFont, QIcon
from PyQt5.QtCore import Qt

class Ventana(QMainWindow):# HERECIA 
      def __init__(self): # CONSTRUCTOR
          super().__init__()
          self.lanzarVentanas()

      def lanzarVentanas(self):
          self.objeto = ventana11.Ventana()
          self.objeto.show()

if __name__ == "__main__":
    app = QApplication(sys.argv)
    ventana = Ventana()
    ventana.show()
    sys.exit(app.exec_())