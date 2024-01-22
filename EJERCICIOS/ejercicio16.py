import os
os.system('cls')

c1 = {1, 2, 3}
c2 = {4, 5, 6}

# SON DISJUNTOS SI NO TIENEN ELEMENTOS EN COMUN

interseccion = c1.intersection(c2)
print(interseccion)
if interseccion == set(): # COMPARAR CON UN CONJUNTO VACIO
   print('SI SON DISJUNTOS')
else:
   print('NO SON DISJUNTOS')