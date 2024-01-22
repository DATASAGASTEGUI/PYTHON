import os

def principal():
    fecha = "19/2/2024"
    print(formato_fecha(fecha))

def formato_fecha(fecha):
    partes = fecha.split("/")
    dia = partes[0]
    mes = partes[1]
    anio = partes[2]
    if int(dia) <= 9:
       dia = "0" + str(int(dia))
    if int(mes) <= 9:
       mes = "0" + str(int(mes))
    if len(anio) == 2:
       anio = "20" + str(anio)
    fecha = dia + "/" + mes + "/" + anio
    return fecha

if __name__ == "__main__":
   os.system("cls")
   principal()
   os.system("pause > nul")
