CREATE DATABASE cursojava;
USE cursojava;
CREATE TABLE Personas (
    PersonaID int auto_increment,
    Nombre varchar(255),
    Apellidos varchar(255),
    Direccion varchar(255),
    Ciudad varchar(255),
    PRIMARY KEY (PersonaID)
);
INSERT INTO Personas (PersonaID, Nombre, Apellidos, Direccion, Ciudad)
VALUES (null, "Sergio","Lara Guardiola", "C inv 7","Barcelona"),
		(null,"John","McAfee","Avenue 5 bd","Zamora"),
        (null, "Don","Omar", "C caca rgt","Caracas"),
        (null, "Paquito","El chocolatero", "C madrid 100","Madrid"),
        (null, "Friedrich","Nietzche", "C alemana quiza austriaca 9","Munich");