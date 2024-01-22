from os import system
from modulo import Alumno, llenar_lista_alumnos, \
                    eliminar_alumno, \
                    mostrar_lista_alumnos, anadir_alumno, \
                    modificar_lista_alumnos

if __name__ == "__main__":
   system('cls')
   alumnos_lst = []
   llenar_lista_alumnos(alumnos_lst)
   mostrar_lista_alumnos(alumnos_lst)

   alumnos_lst.clear()
   print('LISTA LIMPIA')
   mostrar_lista_alumnos(alumnos_lst)
   eliminar_alumno('A1',alumnos_lst)
   mostrar_lista_alumnos(alumnos_lst)
   anadir_alumno(alumnos_lst)
   system('pause')
   mostrar_lista_alumnos(alumnos_lst)
  
   modificar_lista_alumnos('A3','Carla', alumnos_lst)
   system('pause')
   mostrar_lista_alumnos(alumnos_lst)

   lista = [1, "Luis", 1.72, 23, True]
   print(lista)