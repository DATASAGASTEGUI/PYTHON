import os
os.system('cls')

n = 2
while True:
    bandera = True # ES PRIMO
    for i in range(2,n):
        if n % i == 0:
           bandera = False # NO PRIMO
           break

    if bandera:
       print(n, end='  ')

    n = n + 1
    if n == 101:
       break