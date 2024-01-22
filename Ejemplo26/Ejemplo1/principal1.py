import os

from Ejemplo26.Ejemplo1.Trabajador import Trabajador


def principal():
    os.system('cls')
    # CREAR Y AÑADIR OBJETOS A UNA LISTA
    a1 = Trabajador('T1', 'Lucrezia', 'Berroeta', 1, '532')
    a2 = Trabajador('T2', 'Faith', 'Olmedo', 4, '149#10')
    a3 = Trabajador('T3', 'Nathalie', 'Moncada', 1, '311')
    a4 = Trabajador('T4', 'Hudson', 'Espinoza', 3, '230515')
    a5 = Trabajador('T5', 'Katherine', 'Oprea', 2, '429#2657')
    trabajadores_lst = [a1,a2,a3,a4,a5]
    trabajadores_lst.append(Trabajador('T6', 'Isidro', 'Rizzo', 1, '318'))
    a7 = Trabajador('T7', 'Cristian', 'Esparza', 1, '341')
    trabajadores_lst.append(a7)

    print('(1) RECORRER LA LISTA DE OBJETO Y MOSTRARLO EN PANTALLA')
    for trabajador in trabajadores_lst:
        print(trabajador)

    print('(2) BUSCAR UN TRABAJADOR POR ID_TRABAJADOR')
    id_trabajador_buscar = 'T3'
    for trabajador in trabajadores_lst:
        if trabajador.id_trabajador == id_trabajador_buscar:
           print(trabajador)
    
    print('(3) ELIMINAR UN TRABAJADOR POR ID_TRAJABADOR')  
    del trabajadores_lst[2]
    for trabajador in trabajadores_lst:
        print(trabajador)

if __name__ == "__main__":
   principal()