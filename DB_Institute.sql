/*
** 
** @author MINDLUNNY
*/

CREATE DATABASE DB_Intitu_SA;

USE DB_Intitu_SA;

CREATE TABLE USUARIO
(
	ID INT AUTO_INCREMENT NOT NULL,
    usuario VARCHAR(30) NOT NULL,
    clave CHAR(8) NOT NULL,
    PRIMARY KEY (ID)
);

CREATE TABLE ALUMNO
(
	dni INT NOT NULL,
    nombres VARCHAR(40) NOT NULL,
    apellidos VARCHAR(40) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    sección VARCHAR(1) NOT NULL,
    teléfono_emer_01 INT NOT NULL,
    teléfono_emer_02 INT,
    activo BOOL NOT NULL,
    PRIMARY KEY (dni)
);


CREATE TABLE DOCENTE
(
	dni INT NOT NULL,
    nombres VARCHAR(40) NOT NULL,
    apellidos VARCHAR(40) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    teléfono INT NOT NULL,
    e_mail VARCHAR(50) NOT NULL,
    activo BOOL NOT NULL,
    PRIMARY KEY (dni)
);


CREATE TABLE CURSO
(
	id CHAR(7),
    nombre VARCHAR(30),
    _dni INT,
    PRIMARY KEY (id),
    CONSTRAINT fk_docente FOREIGN KEY (_dni) REFERENCES DOCENTE (dni)
);

CREATE TABLE MATRÍCULA
(
	cod CHAR(20) NOT NULL,
    cod_curso CHAR(7) NOT NULL,
    dni_alumno INT NOT NULL,
    local_date DATE NOT NULL,
    PRIMARY KEY (cod),
    CONSTRAINT fk_Curso FOREIGN KEY (cod_curso) REFERENCES CURSO (id),
    CONSTRAINT fk_Alumno FOREIGN KEY (dni_alumno) REFERENCES ALUMNO (dni)
);

SELECT m.cod, c.nombre, m.dni_alumno, a.nombres, a.apellidos, m.local_date
FROM MATRÍCULA m 
INNER JOIN CURSO c
ON m.cod_curso = c.id
INNER JOIN ALUMNO a
ON m.dni_alumno = a.dni;

/*CREATE TABLE NOTAS
(
	DNI_alumno INT NOT NULL,
    num_trimestre INT NOT NULL,
    nota_01 DOUBLE,
    nota_02 DOUBLE,
    nota_03 DOUBLE,
    PRIMARY KEY (DNI_alumno),
    CONSTRAINT Fk_Alumn FOREIGN KEY (DNI_alumno) REFERENCES ALUMNO (dni)
);*/

/*===========================================================================*/
INSERT INTO USUARIO VALUES	(ID,'Userrandom','12345678'),
							(ID,'Userrandom_02','12345678');