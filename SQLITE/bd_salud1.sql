-- 1. CREAR UNA TABLA

DROP TABLE IF EXISTS Consulta;

CREATE TABLE Consulta (
  numeroConsulta TEXT(10) NOT NULL,
  fecha          TEXT     NOT NULL,
  nombreMedico   TEXT(50) NOT NULL,
  deinpr         TEXT(20) NOT NULL,
  procedencia    TEXT(20) NOT NULL,
                 PRIMARY KEY (numeroConsulta)
);

-- 2. INSERTAR REGISTROS A UNA TABLA

INSERT INTO Consulta(numeroConsulta,fecha,nombreMedico,deinpr,procedencia) VALUES('1','2012-01-02','JUAN ANTONIO LEON LUIS','INDUCCION','URGENCIAS');
INSERT INTO Consulta(numeroConsulta,fecha,nombreMedico,deinpr,procedencia) VALUES('2','2012-01-02','CONCEPCION HERNANDEZ MARTIN','INDUCCION','CONSULTA');
INSERT INTO Consulta(numeroConsulta,fecha,nombreMedico,deinpr,procedencia) VALUES('3','2012-01-02','CRISTINA OLIVER BARRECHEGUREN','CESAREA','CONSULTA');