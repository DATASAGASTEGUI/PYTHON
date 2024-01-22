-- (1)
SET SERVEROUTPUT ON
DECLARE
   numero1 NUMBER := 5;
   numero2 NUMBER := 3;
   suma NUMBER;
BEGIN
   suma := numero1 + numero2;
   DBMS_OUTPUT.PUT_LINE('Suma: ' || suma);
END;

-- (2)

SET SERVEROUTPUT ON
BEGIN
   DBMS_OUTPUT.PUT_LINE('HOLA MUNDO');
END;

-- (3) SENTENCIA CONDICIONAL BINARIA

DECLARE
  edad NUMBER := 20;
BEGIN
  IF edad >= 18 THEN
     DBMS_OUTPUT.PUT_LINE('Eres mayor de edad');
  ELSE 
     DBMS_OUTPUT.PUT_LINE('Eres menor de edad');
  END IF;
END;

-- (4) SENTENCIA CONDICIONAL MULTIPLE
-- 4.1 CASE ... END CASE

DECLARE
   dia_semana VARCHAR(10) := 'Martes1';
BEGIN
   CASE dia_semana
      WHEN 'Lunes' THEN
         DBMS_OUTPUT.PUT_LINE('Es el primer día de la semana'); 
      WHEN 'Martes' THEN
         DBMS_OUTPUT.PUT_LINE('Es el segundo día de la semana');
      WHEN 'Miercoles' THEN
         DBMS_OUTPUT.PUT_LINE('Es el tercer día de la semana');
      WHEN 'Jueves' THEN
         DBMS_OUTPUT.PUT_LINE('Es el cuarto día de la semana');
      WHEN 'Viernes' THEN
         DBMS_OUTPUT.PUT_LINE('Es el quinto día de la semana');
      WHEN 'Sabado' THEN
         DBMS_OUTPUT.PUT_LINE('Es el sexto día de la semana');
      WHEN 'Domingo' THEN
         DBMS_OUTPUT.PUT_LINE('Es el séptimo día de la semana');
      ELSE
         DBMS_OUTPUT.PUT_LINE('No es un día valido');
   END CASE;
END;

-- 4.2 IF-ELSEIF-ELSE

DECLARE
    dia_semana VARCHAR2(10) := 'Martes';
BEGIN
    IF dia_semana = 'Lunes' THEN
        DBMS_OUTPUT.PUT_LINE('Es el primer día de la semana.');
    ELSIF dia_semana = 'Martes' THEN
        DBMS_OUTPUT.PUT_LINE('Es el segundo día de la semana.');
    ELSIF dia_semana = 'Miércoles' THEN
        DBMS_OUTPUT.PUT_LINE('Es el tercer día de la semana.');
    ELSIF dia_semana = 'Jueves' THEN
        DBMS_OUTPUT.PUT_LINE('Es el cuarto día de la semana.');
    ELSIF dia_semana = 'Viernes' THEN
        DBMS_OUTPUT.PUT_LINE('Es el quinto día de la semana.');
    ELSIF dia_semana = 'Sábado' THEN
        DBMS_OUTPUT.PUT_LINE('Es el sexto día de la semana.');
    ELSIF dia_semana = 'Domingo' THEN
        DBMS_OUTPUT.PUT_LINE('Es el séptimo día de la semana.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('No es un día válido.');
    END IF;
END;

-- BUCLE FOR

DECLARE
  sumaserie NUMBER := 0;
BEGIN
   FOR i IN 1..10 LOOP
       DBMS_OUTPUT.PUT_LINE(i);
       sumaserie := sumaserie + i;
   END LOOP;
   DBMS_OUTPUT.PUT_LINE('Suma de la serie: ' || sumaserie);
END;

-- BUCLE WHILE

DECLARE
   sumaserie NUMBER := 0;
   i NUMBER := 1;
   n NUMBER := 10;
BEGIN
   WHILE(i <= n) LOOP
         DBMS_OUTPUT.PUT_LINE(i);
         i := i + 1;
         sumaserie := sumaserie + i;
   END LOOP;
   DBMS_OUTPUT.PUT_LINE('Suma de la serie: ' || sumaserie);
END;

-- BUCLE DO ... WHILE

DECLARE
   sumaserie NUMBER := 0;
   i NUMBER := 1;
   n NUMBER := 10;
BEGIN
   LOOP
         DBMS_OUTPUT.PUT_LINE(i);
         i := i + 1;
         sumaserie := sumaserie + i;
         EXIT WHEN i > n;
   END LOOP;
   DBMS_OUTPUT.PUT_LINE('Suma de la serie: ' || sumaserie);
END;

-- DISTINTOS TIPOS DE DATOS

DECLARE
   idAlumno  VARCHAR2(5) := 'A1';        -- CADENA
   nombre    VARCHAR2(6) := 'Ismael';
   edad      NUMBER := 34;               -- ENTERO
   estatura  NUMBER := 1.72;             -- REAL
   es_casado BOOLEAN := true;            -- LOGICO
   
   concatenar VARCHAR2(120);
   logico VARCHAR2(10);
BEGIN
   logico := CASE WHEN es_casado THEN 'true' ELSE 'false' END;
   concatenar := idAlumno || ';' || nombre || ';'|| edad || ';' || estatura || ';' || logico;
   DBMS_OUTPUT.PUT_LINE(concatenar);
END;

-- USAR EL LIMITADOR DE CADENA

DECLARE
   cadena1 VARCHAR2(60) := q'[Mi madre se llama 'María' y vive en 'Madrid']';
   cadena2 VARCHAR2(60) := q'[Mi madre se llama 'María']';
   cadena3 VARCHAR2(60) := q'[ y vive en 'Madrid']';
BEGIN
   DBMS_OUTPUT.PUT_LINE(cadena1);
   DBMS_OUTPUT.PUT_LINE(cadena2 || cadena3);
END;

-- RESTRINGIR VARIABLES

DECLARE
	a NUMBER NOT NULL := 10;
	b NUMBER NOT NULL := 3;
	x NUMBER;
BEGIN
	x := -b/a;
	DBMS_OUTPUT.PUT_LINE('X: ' || x);
END;

-- RESTRINGIR VARIABLES

DECLARE
   numero1 NUMBER := 5;
   numero2 NUMBER;
   suma NUMBER;
BEGIN
   IF numero2 IS NULL THEN
      DBMS_OUTPUT.PUT_LINE('NO TIENE VALOR NUMERO2');
   ELSE
      suma := numero1 + numero2;
      DBMS_OUTPUT.PUT_LINE('Suma: ' || suma);
   END IF;
END;

-- RESTRINGIR VARIABLES

DECLARE
   nombre VARCHAR2(30) DEFAULT NULL;
BEGIN
   nombre := 'Arturo';
   IF nombre IS NULL THEN
      DBMS_OUTPUT.PUT_LINE('CADENA VACIA');
   ELSE
      DBMS_OUTPUT.PUT_LINE(nombre);
   END IF;
END;

-- CREAR TABLA

-- ELIMINAR TABLA

DROP TABLE Alumno;

-- CREAR TABLA

CREATE TABLE Alumno (
  idAlumno NUMBER        NOT NULL,
  nombre   VARCHAR2(30)  NOT NULL,
  edad     NUMBER(3)     NOT NULL,
  estatura NUMBER(3,2)   NOT NULL,                                    
  esCasado CHAR    CHECK (esCasado IN (0,1))      NOT NULL,
            PRIMARY KEY (idAlumno)
);

-- CREAR PROPIEDAD INCREMENTO AUTOMATICO EN LA CLAVE PRIMARIA

DROP SEQUENCE INCREMENTO;

CREATE SEQUENCE INCREMENTO
START WITH 1
INCREMENT BY 1;

CREATE OR REPLACE TRIGGER TRG_ALUMNO
BEFORE INSERT ON ALUMNO
FOR EACH ROW
BEGIN
   SELECT INCREMENTO.NEXTVAL INTO :NEW.IDALUMNO FROM DUAL;
END;

-- INSERTAR REGISTROS EN UNA TABLA

INSERT INTO Alumno (nombre, edad, estatura, esCasado) VALUES ('María', 23, 1.72, 1);
INSERT INTO Alumno (nombre, edad, estatura, esCasado) VALUES ('Carmen', 24, 1.64, 0);
INSERT INTO Alumno (nombre, edad, estatura, esCasado) VALUES ('Melissa', 21, 1.65, 1);
INSERT INTO Alumno (nombre, edad, estatura, esCasado) VALUES ('Carlos', 28, 1.73, 1);
INSERT INTO Alumno (nombre, edad, estatura, esCasado) VALUES ('Delly', 24, 1.71, 0);

-- MOSTRAR TODOS LOS REGISTROS DE UNA TABLA

SELECT * FROM ALUMNO;

-- OPERADORES ARITMETICOS
-- INVERTIR UN NUMERO DE 2 DÍGITOS
DECLARE
   numero NUMBER(2) := 45;
   cociente NUMBER;
   resto NUMBER;
   invertido NUMBER;
BEGIN
   cociente := TRUNC(numero / 10); 
   resto := MOD(numero, 10);
   invertido := resto * 10 + cociente;
   DBMS_OUTPUT.PUT_LINE('Original : ' || numero);
   DBMS_OUTPUT.PUT_LINE('Invertido: ' || invertido);
END;

-- CREAR UNA TABLA LUEGO INSERTAR REGISTROS

DECLARE
    -- Declarar una variable para el número máximo de registros a insertar
    max_registros NUMBER := 5;
BEGIN
    -- Crear la tabla empleados si no existe
    EXECUTE IMMEDIATE 'CREATE TABLE empleados (
        id NUMBER,
        nombre VARCHAR2(100)
    )';

    -- Utilizar un bucle FOR para insertar múltiples registros
    FOR i IN 1..max_registros LOOP
        -- Insertar un nuevo registro en la tabla empleados
        INSERT INTO empleados (id, nombre) VALUES (i, 'Empleado ' || i);
    END LOOP;
END;

--

-- CREAR UN PROCEDURE QUE NO RETORNE NADA

-- (1) CREAR EL PROCEDURE

DROP PROCEDURE cls;
CREATE OR REPLACE PROCEDURE cls IS
BEGIN
   FOR i IN 1..50 LOOP
       DBMS_OUTPUT.PUT_LINE(' ');
   END LOOP;
END;

-- (2) LLAMAR AL PROCEDURE

SET SERVEROUTPUT ON
BEGIN
   cls();
   DBMS_OUTPUT.PUT_LINE('Hola Mundo');
END;

-- CREAR UNA FUNCION (RETORNA ALGO)

-- CALCULAR EL AREA DEL CIRCULO

DROP FUNCTION calcular_area_circulo;

CREATE OR REPLACE FUNCTION calcular_area_circulo(radio NUMBER) RETURN NUMBER IS
  area NUMBER;
BEGIN
  area := 3.1416 * POWER(radio,2);
  RETURN area;
END;

-- LLAMAR A LA FUNCION

DECLARE
   radio NUMBER := 5;
   area NUMBER;
BEGIN
   area := calcular_area_circulo(radio);
   DBMS_OUTPUT.PUT_LINE('Area Círculo: ' || area);
END;

-- CREAR UNA FUNCION PARA INVERTIR UNA CADENA

DROP FUNCTION invertir_cadena;

CREATE OR REPLACE FUNCTION invertir_cadena(cadena VARCHAR2) RETURN VARCHAR2 IS
  resultado VARCHAR2(50);
BEGIN
  FOR i IN REVERSE 1..LENGTH(cadena) LOOP -- HOLA    1..4  4..1
      resultado := resultado || SUBSTR(cadena,i,1);
  END LOOP;
  RETURN resultado;
END;

-- LLAMAR A LA FUNCION

DECLARE
   resultado VARCHAR2(50);
BEGIN
   resultado := invertir_cadena('HOLA MUNDO');
   DBMS_OUTPUT.PUT_LINE(resultado);
END;















