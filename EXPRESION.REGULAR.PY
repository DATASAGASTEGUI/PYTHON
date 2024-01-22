*****************************
***   EXPRESION REGULAR   ***
*****************************

LISTA DE SECUENCIAS ESPECIALES
------------------------------

\d 	Coincide con cualquier dígito. Equivalente a [0-9]
\D	Coincide con cualquier caracter que no sea dígito. Equivalente a [^0-9]
\s  Coincide con cualquier carácter de espacio en blanco. Equivalente a [\t\n\r\f\v]
\S  Coincide con cualquier carácter que no sea un espacio en blanco. Equivalente a [^\t\n\r\f\v].
\w  Coincide con cualquier carácter alfanumérico. Equivalente a [a-zA-Z0-9_]
\W  Coincide con cualquier carácter no alfanumérico. Equivalente a [^a-zA-Z0-9_]

.   Coincide con cualquier carácter excepto nueva línea
\   El carácter puesto a continuación será convertido en carácter especial o, si ya es especial, deja de ser especial
^   Negación

NUMERO DE CARACTERES
--------------------

*     0 o más caracteres
+     1 o más caracteres
?     0 o 1 caracter
{3}   3 caracteres exactamente
{3,4} mínimo 3 caracteres y máximo 4 caracteres
{x,}  Indica que se repite un mínimo de x veces sin límite máximo. 

EJEMPLOS DE EXPRESIONES REGULARES
---------------------------------

(1) ER que coincida con números enteros de uno a mas dígitos.

[0-9]+			---> 3, 43434, 0, 22
\d+

(2) ER que coincida con cadenas que inician en 'ab' y continuan con cero o mas caracteres cualquiera

ab.*
			
(3) ER que coincida con cadenas que inician con a, b o c y no continua con ningun caracter

[abc]		---> a, b, c,  ck(Error)
[a-c]

(4) ER 	que coincida con cadenas que incien con cualquier caracter excepto a,b o c y continuen con ningun caracter

[^abc]		---> k, m, l, h, a(Error), b(Error), c(Error)

(5) ER que coincida con cadenas que inicien con una vocal y continue con cualquier caracter menos los caracters que estan en el rango 'm' y 'p' e ingore la sensible a minúsculas y mayúsculas.

[aeiouAEIOU][^m-pM-P]    ---> Al, an(Error), Eq, up(Error)

(6) ER que coincida con cadenas que inicien con una vocal y continue con cero o un caracter cualquiera, menos los caracters que estan en el rango m y p e ingore la sensible a minúsculas y mayúsculas.

[aeiouAEIOU][^m-pM-P]?    --->  Ekk(Error), ok, a

(7) ER que coincide con cadenas que inicia con una letra mayúscula y continua con cualquier cosa.

[A-Z].*     --->Adfadfaksdfjasd,  Q, B?#!dfasdf,  adfasdf(Error)

(8) ER que coincida con cadenas que inicia con un número de uno o dos digitos y nada a continuación.

[0-9]||[0-9]{2}    ---> 1, 23, 432(Error)
[0-9]{1,2}

(9) ER que coincida con cadenas que inicia como mínimo 3 dígitos y como maximo 5 digitos.

[0-9]{3,5}    ---> 3(Error),  22(Error),  134, 41341234(Erro),  12345

(10) ER que coincida con cadenas que inician con uno o dos dígitos y continue con cualquier cosa.

[0-9]{1,2}.*   ---> 0dfadfsdfafda, 33, 444dfqasdfas(Error)

(11) ER que reconozca un número con 1 o 2 dígitos después del punto decimal

[0-9]+\.[0-9]{1,2}    --->  0.5,  .8(Error),  8343q.3(Error), 22.00, 22.999(Error)

(12) ER que reconozca números de 3 a mas dígitos.

[0-9]{3,}   ---> 333, 333333333333333333, 13412341234, 22(Error), ddfq(Error)

(13) ER que reconozca cadenas que inician con a,b o c y continua con 1 o 2.

[abc][12]   --->  b2, c1, k1(Error)   c3(Error)

(14) ER que reconozca todas las cadenas que contengan la secuencia 'abc'.

.*abc.*   --->  ddsfsabcfasdf,  abc,  dfasbacdfasd(Error),  abcc

(15) ER que reconozca todas las cadenas que inicen con la secuencia 'abc' y continue con cualquier cosa.

abc.*   --->   abc, abcfasdfas, bcafdasd(Error)

(16) ER que reconozca todas las cadenas con un mínimo de 5 letras mayusculas o minusculas y un máxmo de 10.

[a-zA-Z]{5,10}    ---> dfas(Error),  AAAAA

(17) ER que reconozca todas las cadenas formadas por una o mas veces la secuencia "es".

(es)+         ---> eseseses, especies(Error), esess(Error)
(es){1,}

es+ (Incorrecto)

(18) ER que reconozca todas las cadenas que inicien con la letra "e" y continue con uno o mas letras "s".

es+   			---> es, ess, essssssss, e(Error)
es{1,}
[e]s+
[e]s{1,}

(19) ER que reconozca todas las cadenas que inicien con una letra distinta de "e" ó "o" y terminen con la letra "s".

[^eo]s   ---> ls, os(Error)

(20) ER que reconozca todas las cadenas que inician con la letra "e" y contnua con cero o una letra "s".

es{0,1}           ---> e, es, esss(Error)
es?
[e]s{0,1}

(21) ER que reconozca todas las cadenas que inician con "s" sigue con un caracter calquiera y termina en "s".

s.s  --->  s?s, s s, s.s, s..s(Error)

(22) ER que reconozca todas las cadenas que inician con "hotmail" sigue con "." y termina con "com".

hotmail\.com

(23) ER que reconozca C:\user\walter

C:\\user\\walter

(24) ER que reconozca nombres y apellidos de una persona.

Walter Ismael Sagástegui Lescano
Luis Ledezma Roncal

[a-zA-Z\s]+   CORRECTO


[a-zA-Z]+\s[a-zA-Z]+\s[a-zA-Z]+         
[a-zA-Z\sá]{2,}    						
([a-zA-Z]+\s){4}               

(25) ER reconozca numeros reales (enteros como con punto decimal)

2   o   334.34

[0-9]+||[0-9]+\.[0-9]{2}

(26) ER reconozca correos de hotmail

sagastegui@hotmail.com
[a-zA-Z]+@hotmail\.com

PROGRAMA PYTHON PARA VALIDAR UNA EXPRESION REGULAR
--------------------------------------------------

import os
import re

os.system('cls')

def validar():
    #patron = '[a-zA-ZñÑ\s]+' # CORRECTO
    #patron = '[a-zA-ZñÑ]+\s+[a-zA-ZñÑ]+\s+[a-zA-ZñÑ]+' 
    #patron = '[a-zA-Z\s]{2,}' # CORRECTO
    #patron = '([a-zA-Z]+\s){4}'
    patron = '[a-zA-Z0-9\_]+@hotmail\.com'
    while True:
          cadena = input('Ingrese cadena? ')
          correcto = re.fullmatch(patron, cadena)
          if not correcto:
             print('Error: Vuelva a ingresar la cadena')
          if correcto:
             break
    print('OK')

validar()

PROGRAMA PYTHON PARA FORMAR UNA LISTA CON PALABRAS QUE COINCIDAN CON UNA EXPRESION REGULAR
------------------------------------------------------------------------------------------

La función findall devuelve una lista que contiene todas las coincidencias.

Patron = [0-9]+

Hola 1234 como estas 345  tengo 23

['1234', '345','23']

def buscarPalabras():
    #texto = 'Hola 1234 como estas 345  tengo 23'
    #p = re.compile('[0-9]+')
    #texto = 'Hola .3 como estas 1.3 tengo 4.4 espero 234.3'
    #p = re.compile('[0-9]*\.[0-9]')
    texto = 'Holaaa .3 como estaaaas 1.3 tengo 4.4 espero 234.3 casa' # Recuperar las secuencias de a
    p = re.compile('a+')
    lista = p.findall(texto)
    print(lista)


REMPLAZAR UNA SUBCADENA QUE CUMPLE UN PATRON POR OTRA SUBCADENA
---------------------------------------------------------------

def remplazarPalabras():
    #texto = 'Hola 1234 como estas 345  tengo 23'
    #patron = '[0-9]+'
    #texto = 'Hola .3 como estas 1.3 tengo 4.4 espero 234.3'
    #patron = '[0-9]*\.[0-9]'
    texto = 'Holaaa .3 como estaaaas 1.3 tengo 4.4 espero 234.3 casa' # Recuperar las secuencias de a
    patron = 'a+'
    textomodificado = re.sub(patron, 'a', texto)
    print(textomodificado)


************************
***   BIBLIOGRAFIA   ***
************************

- EXPRESIONES REGULARES

https://docs.python.org/es/3/library/re.html#re-syntax

- CODIGOS DIVERSOS SOBRE PYTHON

https://decodigo.com/python

https://jarroba.com/busqueda-de-patrones-expresiones-regulares/