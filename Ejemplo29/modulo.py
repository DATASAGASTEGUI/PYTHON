class Alumno:
    def __init__(self, idAlumno, nombre, edad, estatura):
        self.idAlumno = idAlumno
        self.nombre = nombre
        self.edad = edad
        self.estatura = estatura

    def __str__(self):
        return self.idAlumno + ';' + self.nombre + ';' + str(self.edad) + ';' + str(self.estatura) + ';'

def llenar_lista_alumnos(alumnos_lst):
    a1 = Alumno('A1','Miguel',23,1.72)
    a2 = Alumno('A2','Carlos',22,1.71)
    alumnos_lst.append(a1)
    alumnos_lst.append(a2)

def eliminar_alumno(id,alumnos_lst):
    i = 0
    for alumno in alumnos_lst:
        if alumno.idAlumno == id:
           del alumnos_lst[i]
        i = i + 1

def mostrar_lista_alumnos(alumnos_lst):
    for alumno in alumnos_lst:
        print(alumno) 

def anadir_alumno(alumnos_lst):
    alumnos_lst.append(Alumno('A3','María',24,1.75))  

def modificar_lista_alumnos(id,nombre_nuevo, alumnos_lst):
    for alumno in alumnos_lst:
        if alumno.idAlumno == id:
           alumno.nombre = nombre_nuevo