import os
os.system('cls')
n = int(input('INGRESE NUMERO ENTERO POSITIVO? '))
bandera = True # ES PRIMO

for i in range(2,n):
    if n % i == 0:
       bandera = False # NO PRIMO
       break

if bandera:
   print('ES PRIMO')
else:
   print('NO PRIMO')

