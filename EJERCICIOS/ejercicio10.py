import os

empleado_dic = {
           'E01': {'nombre': 'Miguel', 'apaterno': 'Ruiz', 'estatura': 1.61},
           'E02': {'nombre': 'Carlos', 'apaterno': 'Alva', 'estatura': 1.76},
           'E03': {'nombre': 'María', 'apaterno': 'Roncal', 'estatura': 1.56},
           'E04': {'nombre': 'Carmen', 'apaterno': 'Lescano', 'estatura': 1.66},
           'E05': {'nombre': 'José', 'apaterno': 'Jauregui', 'estatura': 1.46},
           'E06': {'nombre': 'Arturo', 'apaterno': 'Parraga', 'estatura': 1.72}
      }

def principal():
    os.system('cls')
    print("%-10s %-10s %-10s %8s" % ('IDEMPLEADO','NOMBRE','PATERNO','ESTATURA'))
    print("%-10s %-10s %-10s %8s" % ('----------','------','-------','--------'))
    for tupla in list(empleado_dic.items()):
        idEmpleado = tupla[0]
        datos_dic = tupla[1]
        lista = list(datos_dic.values())
        lista.append(idEmpleado)
        print("%-10s %-10s %-10s %8.2f" % (lista[3],lista[0],lista[1],lista[2]))

principal()