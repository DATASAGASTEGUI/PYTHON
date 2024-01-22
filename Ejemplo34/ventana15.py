import sys, os
from PyQt5.QtWidgets import QApplication, QMainWindow, QLabel, QWidget, QCalendarWidget
from PyQt5.QtGui import QIcon, QFont
from PyQt5.QtCore import Qt, QDate

class Ventana(QMainWindow):
    def __init__(self):
        super().__init__()
        self.personalizarVentana()
        self.personalizarComponentes()

    def personalizarVentana(self):
        self.setWindowTitle("VENTANA PYQT5")
        self.setStyleSheet("background-color: lightgray;")
        self.setFixedSize(480, 330) 

        ruta_relativa = "PYTHON_0033/cross1.png"
        ruta_absoluta = os.path.abspath(ruta_relativa)
        print(ruta_absoluta) # F:\CURSOS\TRABAJANDO\PROJECTS___PYTHON\PYTHON_TEXTO\PYTHON\PYTHON_0033\cross1.png
        self.setWindowIcon(QIcon(ruta_absoluta))

        self.pnlPrincipal = QWidget() # Crear un contenedor
        self.setCentralWidget(self.pnlPrincipal) # Establecer el contenedor como principal para nuestra ventana
    
    def personalizarComponentes(self):
        self.lblFecha = QLabel("AQUI SE PONE LA FECHA SELECCIONADA", self.pnlPrincipal)
        self.lblFecha.setFont(QFont("Courier New", 12))
        self.lblFecha.setStyleSheet("color: #FF0000;")
        self.lblFecha.setAlignment(Qt.AlignCenter)
        self.lblFecha.setGeometry(0, 290, 480, 20)

        self.calendario = QCalendarWidget(self.pnlPrincipal)
        self.calendario.setGridVisible(True)
        self.calendario.setGeometry(10, 10, 460, 250)
        self.calendario.clicked[QDate].connect(self.mostrarFechaSeleccionada) #1 
        '''
        min_date = QDate(2024, 1, 1) # Por ejemplo, establecer la fecha mínima como 1 de enero de 2024
        self.calendario.setMinimumDate(min_date)
        max_date = QDate(2024, 12, 31) # Por ejemplo, establecer la fecha máxima como 31 de diciembre de 2024
        self.calendario.setMaximumDate(max_date)
        '''
        min_date = QDate(2024, 1, 1)
        max_date = QDate(2024, 12, 31)
        self.calendario.setDateRange(min_date, max_date)
        self.calendario.setFirstDayOfWeek(Qt.Sunday)

        self.calendario.setStyleSheet("color: white; background-color: black")
        self.calendario.setNavigationBarVisible(True)

    def mostrarFechaSeleccionada(self, fecha):
        fecha_str = "{:02d}/{:02d}/{:04d}".format(fecha.day(), fecha.month(), fecha.year())
        self.lblFecha.setText(fecha_str)  
        print(fecha.toString())  
        print(fecha.day())
        print(fecha.month())
        print(fecha.year()) 
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    ventana = Ventana()
    ventana.show()
    sys.exit(app.exec_())

'''
1. Entonces, aunque no se pasa explícitamente la fecha como argumento cuando se llama a mostrarFechaSeleccionada, el argumento fecha se llena automáticamente con la fecha seleccionada cuando el método es llamado por la señal clicked del QCalendarWidget.
'''