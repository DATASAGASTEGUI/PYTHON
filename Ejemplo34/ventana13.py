import sys,os
# from PyQt5.QtWidgets import *

from PyQt5.QtWidgets import ( 
     QHeaderView,QApplication, QMainWindow, QTableWidget,
     QTableWidgetItem, QPushButton, QLineEdit, QMessageBox
)

from PyQt5.QtGui import QFont, QIcon
from PyQt5.QtCore import Qt

class Ventana(QMainWindow):
    def __init__(self):
        super().__init__()
        self.personalizarVentana()
        self.personalizarComponentes()

    def personalizarVentana(self):
        self.setFixedSize(480, 330) # Ubicar la ventana en el centro de la pantalla no se puede redimensionar la ventana 
        self.setWindowTitle("VENTANA PYQT5") # Título para la ventana
        self.setStyleSheet("background-color: lightgray;") # Color de fondo para la ventana

        # Cambiar el icono de la ventana con una ruta absoluta que se crea a partir de una relativa
        ruta_relativa = "Ejemplo34/cross1.png"
        ruta_absoluta = os.path.abspath(ruta_relativa)
        print(ruta_absoluta) # F:\CURSOS\TRABAJANDO\PROJECTS___PYTHON\PYTHON_TEXTO\PYTHON\PYTHON_0033\cross1.png
        self.setWindowIcon(QIcon(ruta_absoluta))

    def personalizarComponentes(self):
        self.tblMostrar = QTableWidget(self)
        self.tblMostrar.setColumnCount(4)
        self.tblMostrar.setRowCount(0)
        self.tblMostrar.setHorizontalHeaderLabels(["ID", "NOMBRE", "ESTATURA", "SEXO"])
        self.tblMostrar.horizontalHeader().setStyleSheet("color: black; background-color: white;")
        self.tblMostrar.horizontalHeader().setFont(QFont("Courier New", 9, QFont.Bold)) #Fuente de letra y tamaño de letra de la cabecera
        self.tblMostrar.setFont(QFont("Courier New", 9)) #Fuente de letra y tamaño de letra del cuerpo
        self.tblMostrar.setStyleSheet("color: blue; background-color: lightgray;") #Color de fondo del cuerpo
        self.tblMostrar.setGeometry(10, 10, 460, 200)

        header = self.tblMostrar.horizontalHeader()
        header.setSectionResizeMode(QHeaderView.Stretch)  # Ajustar automáticamente el ancho de las columnas
        header.setStretchLastSection(True)  # Estirar la última sección (última columna) para llenar el espacio
        
        self.btoCargar = QPushButton("CARGAR", self)
        self.btoCargar.setGeometry(20, 230, 80, 20)
        self.btoCargar.setFont(QFont("Courier New", 0, 8))
        self.btoCargar.setStyleSheet("background-color: black; color: white;")
        self.btoCargar.clicked.connect(self.cargarDatosTabla)

        self.btoHombre = QPushButton("HOMBRE", self)
        self.btoHombre.setGeometry(110, 230, 80, 20)
        self.btoHombre.setFont(QFont("Courier New", 0, 8))
        self.btoHombre.setStyleSheet("background-color: black; color: white;")
        self.btoHombre.clicked.connect(self.cargarDatosTablaHombre) 

        self.btoMujer = QPushButton("MUJER", self)
        self.btoMujer.setGeometry(200, 230, 80, 20)
        self.btoMujer.setFont(QFont("Courier New", 0, 8))
        self.btoMujer.setStyleSheet("background-color: black; color: white;")
        self.btoMujer.clicked.connect(self.cargarDatosTablaMujer)                

        self.btoLimpiar = QPushButton("LIMPIAR", self)
        self.btoLimpiar.setGeometry(290, 230, 80, 20)
        self.btoLimpiar.setFont(QFont("Courier New", 0, 8))
        self.btoLimpiar.setStyleSheet("background-color: black; color: white;")
        self.btoLimpiar.clicked.connect(self.limpiarTabla)

        self.btoSalir = QPushButton("SALIR", self)
        self.btoSalir.setGeometry(380, 230, 80, 20)
        self.btoSalir.setFont(QFont("Courier New", 0, 8))
        self.btoSalir.setStyleSheet("background-color: black; color: white;")
        self.btoSalir.clicked.connect(self.salir)

        self.txtBuscar = QLineEdit(self)
        self.txtBuscar.setGeometry(200, 260, 80, 20)
        self.txtBuscar.setFont(QFont("Courier New", 9))
        self.txtBuscar.setAlignment(Qt.AlignCenter)
        self.txtBuscar.setStyleSheet("color: blue;") 

        self.btoBuscar = QPushButton("BUSCAR", self)
        self.btoBuscar.setGeometry(200, 290, 80, 20)
        self.btoBuscar.setFont(QFont("Courier New", 0, 8))
        self.btoBuscar.setStyleSheet("background-color: black; color: white;")
        self.btoBuscar.clicked.connect(self.buscar)                 

    def buscar(self):
        try:
            id_buscar = int(self.txtBuscar.text())
            bandera = 0
            for i in range(len(id)):
                if id[i] == id_buscar:
                    self.limpiarTabla()
                    self.tblMostrar.insertRow(0) #Añadir una nueva fila en blanco en la posición i: 0,1,2,3...14
                    self.tblMostrar.setItem(0, 0, QTableWidgetItem(str(id[i]))) #Posición i: fila, 0: columna
                    self.tblMostrar.setItem(0, 1, QTableWidgetItem(nombre[i]))
                    self.tblMostrar.setItem(0, 2, QTableWidgetItem(self.decimalesfijo(estatura[i])))
                    self.tblMostrar.setItem(0, 3, QTableWidgetItem(sexo[i]))
                    self.txtBuscar.setText(str(id[i]))
                    bandera = 1
                    break
            if bandera == 0:
               QMessageBox.critical(self,"ERROR","ID NO EXISTE")
        except:
               QMessageBox.critical(self,"ERROR","ENTRADA INCORRECTA")
               self.limpiarTabla()

    def cargarDatosTablaHombre(self):
        self.limpiarTabla()
        k = 0
        for i in range(len(id)):
            if sexo[i] == 'H':
               self.tblMostrar.insertRow(k) #Añadir una nueva fila en blanco en la posición i: 0,1,2,3...14
               self.tblMostrar.setItem(k, 0, QTableWidgetItem(str(id[i]))) #Posición i: fila, 0: columna
               self.tblMostrar.setItem(k, 1, QTableWidgetItem(nombre[i]))
               self.tblMostrar.setItem(k, 2, QTableWidgetItem(self.decimalesfijo(estatura[i])))
               self.tblMostrar.setItem(k, 3, QTableWidgetItem(sexo[i]))
               k = k + 1

        # Almacenar el índice de la columna "ID" para ajustar la alineación al centro más tarde
        self.indice_id = 0 #self.indice_id = self.tblMostrar.horizontalHeader().visualIndex(0)
        # Almacenar el índice de la columna "ESTATURA" para ajustar la alineación a la derecha 
        self.indice_estatura = 2 #self.indice_estatura = self.tblMostrar.horizontalHeader().visualIndex(2)
        # Almacenar el índice de la columna "ESTATURA" para ajustar la alineación a la derecha 
        self.indice_sexo = 3 #self.indice_sexo = self.tblMostrar.horizontalHeader().visualIndex(3)
                
        for i in range(self.tblMostrar.rowCount()):
            # Alinear la columna "ID" al centro
            item0 = self.tblMostrar.item(i, self.indice_id)
            item0.setTextAlignment(Qt.AlignCenter | Qt.AlignVCenter)
            # Alinear la columna "ESTATURA" a la derecha
            item2 = self.tblMostrar.item(i, self.indice_estatura)
            item2.setTextAlignment(Qt.AlignRight | Qt.AlignVCenter)
            # Alinear la columna "SEXO" al centro
            item3 = self.tblMostrar.item(i, self.indice_sexo)
            item3.setTextAlignment(Qt.AlignCenter | Qt.AlignVCenter) 

    def cargarDatosTablaMujer(self):
        self.limpiarTabla()
        k = 0
        for i in range(len(id)):
            if sexo[i] == 'M':
               self.tblMostrar.insertRow(k) #Añadir una nueva fila en blanco en la posición i: 0,1,2,3...14
               self.tblMostrar.setItem(k, 0, QTableWidgetItem(str(id[i]))) #Posición i: fila, 0: columna
               self.tblMostrar.setItem(k, 1, QTableWidgetItem(nombre[i]))
               self.tblMostrar.setItem(k, 2, QTableWidgetItem(self.decimalesfijo(estatura[i])))
               self.tblMostrar.setItem(k, 3, QTableWidgetItem(sexo[i]))
               k = k + 1

        # Almacenar el índice de la columna "ID" para ajustar la alineación al centro más tarde
        self.indice_id = 0 #self.indice_id = self.tblMostrar.horizontalHeader().visualIndex(0)
        # Almacenar el índice de la columna "ESTATURA" para ajustar la alineación a la derecha 
        self.indice_estatura = 2 #self.indice_estatura = self.tblMostrar.horizontalHeader().visualIndex(2)
        # Almacenar el índice de la columna "ESTATURA" para ajustar la alineación a la derecha 
        self.indice_sexo = 3 #self.indice_sexo = self.tblMostrar.horizontalHeader().visualIndex(3)
                
        for i in range(self.tblMostrar.rowCount()):
            # Alinear la columna "ID" al centro
            item0 = self.tblMostrar.item(i, self.indice_id)
            item0.setTextAlignment(Qt.AlignCenter | Qt.AlignVCenter)
            # Alinear la columna "ESTATURA" a la derecha
            item2 = self.tblMostrar.item(i, self.indice_estatura)
            item2.setTextAlignment(Qt.AlignRight | Qt.AlignVCenter)
            # Alinear la columna "SEXO" al centro
            item3 = self.tblMostrar.item(i, self.indice_sexo)
            item3.setTextAlignment(Qt.AlignCenter | Qt.AlignVCenter) 

    def cargarDatosTabla(self):
        self.limpiarTabla()
        for i in range(len(id)):
            self.tblMostrar.insertRow(i) #Añadir una nueva fila en blanco en la posición i: 0,1,2,3...14
            self.tblMostrar.setItem(i, 0, QTableWidgetItem(str(id[i]))) #Posición i: fila, 0: columna
            self.tblMostrar.setItem(i, 1, QTableWidgetItem(nombre[i]))
            self.tblMostrar.setItem(i, 2, QTableWidgetItem(self.decimalesfijo(estatura[i])))
            self.tblMostrar.setItem(i, 3, QTableWidgetItem(sexo[i]))

        # Almacenar el índice de la columna "ID" para ajustar la alineación al centro más tarde
        self.indice_id = 0 #self.indice_id = self.tblMostrar.horizontalHeader().visualIndex(0)
        # Almacenar el índice de la columna "ESTATURA" para ajustar la alineación a la derecha 
        self.indice_estatura = 2 #self.indice_estatura = self.tblMostrar.horizontalHeader().visualIndex(2)
        # Almacenar el índice de la columna "ESTATURA" para ajustar la alineación a la derecha 
        self.indice_sexo = 3 #self.indice_sexo = self.tblMostrar.horizontalHeader().visualIndex(3)
                
        for i in range(self.tblMostrar.rowCount()):
            # Alinear la columna "ID" al centro
            item0 = self.tblMostrar.item(i, self.indice_id)
            item0.setTextAlignment(Qt.AlignCenter | Qt.AlignVCenter)
            # Alinear la columna "ESTATURA" a la derecha
            item2 = self.tblMostrar.item(i, self.indice_estatura)
            item2.setTextAlignment(Qt.AlignRight | Qt.AlignVCenter)
            # Alinear la columna "SEXO" al centro
            item3 = self.tblMostrar.item(i, self.indice_sexo)
            item3.setTextAlignment(Qt.AlignCenter | Qt.AlignVCenter)            
        
    def decimalesfijo(self,estatura):
        parte_entera = int(estatura)
        parte_decimal = estatura - parte_entera
        parte_decimal_1 = int(parte_decimal * 100)
        if parte_decimal_1 % 10 == 0:
           return str(estatura) + "0"
        else:
           return str(estatura)

    def limpiarTabla(self):
        self.tblMostrar.setRowCount(0)
        self.txtBuscar.setText("")

    def salir(self):
        # sys.exit()
        self.close()

id = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
nombre = ["Luis", "Miguel", "Carlos", "Javier", "Carmen", "Maria", "Lucia", "Carmen", "Arturo", "Ismael", "Delly", "Vanessa", "Melissa", "Raul", "Arturo"]
estatura = [1.72, 1.73, 1.74, 1.75, 1.76, 1.60, 1.61, 1.62, 1.63, 1.64, 1.65, 1.56, 1.64, 1.67, 1.61]
sexo = ['H','H','H','H','M','M','M','M','H','H','M','M','M','H','H']

if __name__ == "__main__":
    app = QApplication(sys.argv)
    ventana = Ventana()
    ventana.show()
    sys.exit(app.exec_())