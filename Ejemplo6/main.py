import os
import matplotlib.pyplot as plt
# DESDE UNA TERMINA EN VISUAL STUDIO CODE
# PS O:\TRABAJANDO\PROJECTS___PYTHON>pip install matplotlib

os.system('cls')

# Datos para el gráfico
x = [1, 2, 3, 4, 5]
y = [2, 4, 6, 8, 10]

# Crear un gráfico de línea
plt.plot(x, y, label='Línea')

# Agregar etiquetas a los ejes
plt.xlabel('Eje X')
plt.ylabel('Eje Y')

# Agregar un título al gráfico
plt.title('Gráfico de Línea Básico')

# Mostrar una leyenda
plt.legend()

# Mostrar el gráfico
plt.show()
