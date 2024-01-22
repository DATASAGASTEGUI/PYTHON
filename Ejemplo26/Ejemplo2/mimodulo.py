# Perimetro y Area de un Circulo: 
import math
class Circulo:

      def __init__(self, radio):
          self.__radio = radio 

      def get_radio(self):
          return self.__radio
      
      def set_radio(self, radio):
          self.__radio = radio

      def perimetro(self):
          return 2 * math.pi * self.__radio

      def area(self):
          return math.pi * math.pow(self.__radio,2)  

      def __str__(self):
          return f'radio: {self.__radio}, area: {round(self.area(),2)}, perimetro: {round(self.perimetro(),2)}'

     
