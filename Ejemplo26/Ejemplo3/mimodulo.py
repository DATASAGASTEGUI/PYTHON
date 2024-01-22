# Perimetro y Area de un Circulo: 
import math
class Circulo:

     def __init__(self, radio):
          self.radio = radio 

     def perimetro(self):
          return 2 * math.pi * self.radio

     def area(self):
          return math.pi * math.pow(self.radio,2)  

     def __str__(self):
          return f'radio: {self.radio}, area: {round(self.area(),2)}, perimetro: {round(self.perimetro(),2)}'

     
