import os
os.system('cls')

for n in range(2,101): # 2 3 4 ... 100
    bandera = True # ES PRIMO

    for i in range(2,n):
        if n % i == 0:
           bandera = False # NO PRIMO
           break

    if bandera:
       print(n, end='  ')
