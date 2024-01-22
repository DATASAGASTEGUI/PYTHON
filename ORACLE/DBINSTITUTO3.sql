/*
HALLAR EL AREA Y PERIMETRO DE UN CIERCULO. DONDE EL RADIO SERA INGREADO POR
TECLADO
*/

-- (1) PROGRAMA PL/SQL

SET SERVEROUTPUT ON
DECLARE
   radio NUMBER;      -- VARIABLE DE ENTRADA
   area NUMBER;       -- VARIABLE SALIDA
   perimetro NUMBER;  -- VARIABLE SALIDA
BEGIN
   radio := &1;
   area := 3.1416 * POWER(radio,2);
   perimetro := 2 * 3.1416 * radio;
   DBMS_OUTPUT.PUT_LINE('Area     : ' || area);
   DBMS_OUTPUT.PUT_LINE('Perimetro: ' || perimetro);
END;

-- (2) PROCEDURE

-- 2.1 CREAR EL PROCEDURE

CREATE OR REPLACE PROCEDURE calcular_area_perimetro(radio IN NUMBER)
IS
   area NUMBER;
   perimetro NUMBER;
BEGIN
   area := 3.1416 * POWER(radio,2);
   perimetro := 2 * 3.1416 * radio;
   DBMS_OUTPUT.PUT_LINE('Area     : ' || area);
   DBMS_OUTPUT.PUT_LINE('Perimetro: ' || perimetro);
END;

-- 2.2 PROGRAMA PL/SQL

DECLARE
   radio NUMBER;
BEGIN
   radio := &1;
   calcular_area_perimetro(radio);
END;

-- (3) FUNCTION: RETORNA CADENA

-- 3.1 CREAR LA FUNCTION

CREATE OR REPLACE FUNCTION funcion_calcular_area_perimetro(radio IN NUMBER)
RETURN VARCHAR2
IS
  area NUMBER;
  perimetro NUMBER;
BEGIN
  area := 3.1416 * POWER(radio,2);
  perimetro := 2 * 3.1416 * radio;
  RETURN 'Area: ' || area || '   ' || 'Perimetro: ' || perimetro;
END;

-- 3.2 PROGRAMA PL/SQL

DECLARE
   radio NUMBER := &1;
   area_perimetro VARCHAR2(100);
BEGIN
   area_perimetro := funcion_calcular_area_perimetro(radio);
   DBMS_OUTPUT.PUT_LINE(area_perimetro);
END;

-- (4) FUNCTION: RETORNA OBJETO

-- 3.1 CREAR LA FUNCTION

CREATE OR REPLACE TYPE InformacionCirculo AS OBJECT (
   area NUMBER, perimetro NUMBER
);

CREATE OR REPLACE FUNCTION funcion_calcular_area_perimetro_objeto(radio IN NUMBER)
RETURN InformacionCirculo
IS
   resultado InformacionCirculo := InformacionCirculo(NULL,NULL);
BEGIN
   resultado.area := 3.1416 * POWER(radio,2);
   resultado.perimetro := 2 * 3.1416 * radio;
   RETURN resultado;
END;

-- PROGRAMA PL/SQL

DECLARE
   radio NUMBER := &1;
   resultado InformacionCirculo;
BEGIN
   resultado := funcion_calcular_area_perimetro_objeto(radio);
   DBMS_OUTPUT.PUT_LINE('Area     : ' || resultado.area);
   DBMS_OUTPUT.PUT_LINE('Perimetro: ' || resultado.perimetro);
END;

/*
-- HACER UN PROGRAMA MODULAR DONDE LA ENTRADA DE LOS DATOS SERA UNA FUNCION
-- EL PROCESO OTRA FUNCION Y LA SALIDA UN PROCEDURE.

-- 1. PROGRAMA PL/SQL

CREATE OR REPLACE TYPE Entrada AS OBJECT (
   numero1 NUMBER, numero2 NUMBER
);

CREATE OR REPLACE PROCEDURE entrada_numeros(
    OUT resultado
)
IS
BEGIN
    resultado := Entrada(NULL, NULL);
    
    DBMS_OUTPUT.PUT_LINE('Ingrese el primer número:');
    resultado.numero1 := &1; -- Aquí podrías usar un comando de entrada de datos si fuera posible
    DBMS_OUTPUT.PUT_LINE('Ingrese el segundo número:');
    resultado.numero2 := &2; -- Aquí podrías usar un comando de entrada de datos si fuera posible
END;
/

DECLARE
    mi_entrada Entrada;
BEGIN
    entrada_numeros(mi_entrada);
    
    -- Ahora puedes usar los valores de mi_entrada según sea necesario
    DBMS_OUTPUT.PUT_LINE('El primer número ingresado es: ' || mi_entrada.numero1);
    DBMS_OUTPUT.PUT_LINE('El segundo número ingresado es: ' || mi_entrada.numero2);
END;
/


DECLARE
   numero Entrada;
   suma NUMBER;
BEGIN
   numero := entrada_numeros(); -- Función
   suma := sumar(numero);       -- Función
   salida_numeros(suma);        -- Procedure
END;
*/

-- CREAR UN PROCEDURE QUE PERMITA CREAR UNA TABLA.

CREATE OR REPLACE PROCEDURE crear_tabla AS
BEGIN
   EXECUTE IMMEDIATE 'CREATE TABLE Empleado(
      id_empleado  CHAR(4)      NOT NULL PRIMARY KEY,
      nombre       VARCHAR2(20) NOT NULL,
      edad         NUMBER
   )';
   DBMS_OUTPUT.PUT_LINE('OK: CREATE TABLE');
   EXCEPTION
      WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('ERROR: CREATE TABLE');  
END;

-- PROGRAMA PL/SQL 

BEGIN
   crear_tabla;
END;

-- PRIVILEGIO PARA PODER CREAR TABLA.

GRANT CREATE TABLE TO DBINSTITUTO;

-- CREAR UN PROCEDURE PARA INSERTAR REGISTROS EN LA TABLA EMPLEADO

CREATE OR REPLACE PROCEDURE insertar_registro(
    p_id_empleado IN CHAR,
    p_nombre IN VARCHAR2,
    p_edad IN NUMBER
)
IS
BEGIN
  INSERT INTO Empleado(id_empleado,nombre,edad)
  VALUES (p_id_empleado,p_nombre,p_edad);
  COMMIT;
  DBMS_OUTPUT.PUT_LINE('OK: INSERT');
  EXCEPTION 
    WHEN OTHERS THEN
       DBMS_OUTPUT.PUT_LINE('ERROR: INSERT');
END;

-- PROGRAMA PL/SQL

DECLARE
   id_empleado CHAR(4) := 'E001';
   nombre VARCHAR2(20) := 'Arturo';
   edad NUMBER := 25;
BEGIN
   insertar_registro(id_empleado,nombre,edad);
END;

-- PROGRAMA PL/SQL

DECLARE
   id_empleado CHAR(4) := '&1';
   nombre VARCHAR2(20) := '&2';
   edad NUMBER := &3;
BEGIN
   insertar_registro(id_empleado,nombre,edad);
END;

SELECT * FROM Empleado;

-- PROCEDURE PARA ACTUALIZAR UN REGISTRO

CREATE OR REPLACE PROCEDURE actualizar_registro_edad(
   p_id_empleado IN CHAR,
   p_nueva_edad IN NUMBER
)
IS
BEGIN
   UPDATE Empleado
   SET edad = p_nueva_edad
   WHERE id_empleado = p_id_empleado;
   COMMIT;
   DBMS_OUTPUT.PUT_LINE('OK: UPDATE');
   EXCEPTION 
    WHEN OTHERS THEN
       DBMS_OUTPUT.PUT_LINE('ERROR: UPDATE');
END;

-- PROGRAMA PL/SQL

DECLARE
   id_empleado CHAR(4) := '&1';
   nueva_edad NUMBER := &2;
BEGIN
   actualizar_registro_edad(id_empleado,nueva_edad);
END;

-- CREAR UN PROCEDUERE PARA ELIMINAR UN REGISTRO

CREATE OR REPLACE PROCEDURE eliminar_registro(
   p_id_empleado IN CHAR
)
IS
BEGIN
   DELETE FROM Empleado
   WHERE id_empleado = p_id_empleado;
   COMMIT;
   DBMS_OUTPUT.PUT_LINE('OK: DELETE');
   EXCEPTION 
    WHEN OTHERS THEN
       DBMS_OUTPUT.PUT_LINE('ERROR: DELETE');
END;

-- PROGRAMA PL/SQL

DECLARE
   id_empleado CHAR(4) := '&1';
BEGIN
   eliminar_registro(id_empleado);
END;

-- PROCEDURE PARA MOSTRAR TODOS LOS REGISTROS DE UNA TABLA

CREATE OR REPLACE PROCEDURE mostrar_todos_registros
IS
BEGIN
   FOR re IN (SELECT * FROM Empleado) LOOP
       DBMS_OUTPUT.PUT_LINE(re.id_empleado);
       DBMS_OUTPUT.PUT_LINE(re.nombre);
       DBMS_OUTPUT.PUT_LINE(re.edad);
   END LOOP;
END;

-- PROGRAMA PL/SQL

BEGIN
  mostrar_todos_registros;
END;


-- PROGRAMA PL/SQL PARA LEER UN ARCHIVO CSV

SET SERVEROUTPUT ON
DECLARE
    v_file_handle UTL_FILE.FILE_TYPE;
    v_file_location VARCHAR2(15) := 'empleado.csv';
    v_line VARCHAR2(100);
    
    id_empleado CHAR(4);
    nombre VARCHAR2(20);
    edad NUMBER;
BEGIN
    -- Abrir el archivo CSV
    v_file_handle := UTL_FILE.FOPEN('DATA_DIR', v_file_location, 'R');

    -- Leer cada línea del archivo
    LOOP
        -- Leer una línea del archivo
        BEGIN
            UTL_FILE.GET_LINE(v_file_handle, v_line);
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                -- Si no hay más datos, salir del bucle
                EXIT;
        END;
        -- Dividir la línea en campos separados por punto y coma
        id_empleado := TRIM(REGEXP_SUBSTR(v_line, '[^;]+', 1, 1));
        nombre := TRIM(REGEXP_SUBSTR(v_line, '[^;]+', 1, 2));
        edad := TRIM(REGEXP_SUBSTR(v_line, '[^;]+', 1, 3));
        
        DBMS_OUTPUT.PUT_LINE(id_empleado || ';' || nombre || ';' || edad);
    END LOOP;

    -- Cerrar el archivo
    UTL_FILE.FCLOSE(v_file_handle);

END;


CREATE DIRECTORY DATA_DIR AS 'C:\oracle';

DROP DIRECTORY DATA_DIR;

SELECT directory_name, directory_path
FROM dba_directories
WHERE directory_name = 'DATA_DIR';



























