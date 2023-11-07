/*CREATE DATABASE siteViagens
USE siteViagens;

CREATE TABLE Endereco (
    Id_endereco INT PRIMARY KEY,
    Cep VARCHAR(10) NOT NULL,
    Pais VARCHAR(255),
    Cidade VARCHAR(255),
    Bairro VARCHAR(255),
    Rua VARCHAR(255),
    Numero INT
);

CREATE TABLE Destino (
    Id_destino INT PRIMARY KEY,
    Cidade VARCHAR(255) NOT NULL,
    Pais VARCHAR(255)NOT NULL,
    Aeroporto VARCHAR(255)NOT NULL
);
CREATE TABLE Passagem (
    Id_passagem INT PRIMARY KEY NOT NULL,
    Data_ida DATE NOT NULL,
    Local_partida VARCHAR(255),
    Data_volta DATE,
    Companhia VARCHAR(100),
    Valor DOUBLE,
    Fk_destino INT,
    FOREIGN KEY (Fk_destino) REFERENCES Destino(Id_destino)
);

CREATE TABLE Usuario(
    Rg INT NOT NULL PRIMARY KEY,
    Login VARCHAR(50) NOT NULL,
    Senha VARCHAR(50) NOT NULL,
    Cpf VARCHAR(14),
    Data_Nasc DATE,
    Nome VARCHAR(100),
    Fk_endereco INT,
    FOREIGN KEY (Fk_endereco) REFERENCES Endereco(Id_endereco)
);



CREATE TABLE Compras(
	Fk_passagem INT NOT NULL REFERENCES Passagem(Id_passagem),
	Fk_usuario INT NOT NULL REFERENCES Usuario(Rg),
	PRIMARY KEY(Fk_passagem,Fk_usuario),
	Valor_total DOUBLE NOT NULL,  
	Data_compra DATE NOT NULL
)
*/
