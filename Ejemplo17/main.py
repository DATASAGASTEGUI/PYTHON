import os

os.system('cls')
a = 5
print(type(a))
a = "HOLA"
print(type(a))
a = 1.72
print(type(a))
a = True
print(type(a))
a = [1, 4, 7]
print(type(a))
a = {'nombre':'Luis', 'edad': 23}
print(type(a))

'''
<class 'int'>  
<class 'str'>  
<class 'float'>
<class 'bool'>
<class 'list'>
<class 'dict'>
'''
claves = list(a.keys())
print(type(claves)) # <class 'dict_keys'>
if isinstance(claves,dict):
   print('ES TIPO ENTERO')
else:
   print('NO ES ENTERO')

for elemento in a.items():
    print(elemento)  

x = len(a.items())
print(type(a.items()))
