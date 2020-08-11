IF NOT EXISTS(SELECT * FROM sys.databases WHERE name = 'dmz_stock')
	BEGIN
		CREATE DATABASE dmz_stock;
	END;

GO
USE dmz_stock;

IF NOT EXISTS(SELECT 1 FROM sys.tables WHERE name = 'funcionario')
	BEGIN
		CREATE TABLE funcionario(
			id int primary key identity,
			nome varchar(125) not null,
			apelido varchar(30) not null,
			outro_nome varchar(30) null,
			nascimento date not null,
			genero varchar(13) not null,
			b_identidade varchar(14) not null unique,
			nuit varchar(11) not null unique,
			nacionalidade varchar(30) not null default 'Moçambicana',
			created_at datetime default getdate(),
			deleted_at datetime null,
			soft_delete varchar(15) not null default 'SAFE'
		);
	END;

IF NOT EXISTS(SELECT 1 FROM sys.tables WHERE name = 'usuario')
	BEGIN
		CREATE TABLE usuario(
			id_funcionario int not null unique,
			username varchar(125) not null unique,
			password varchar(256) not null,
			tipo_usuario varchar(30) not null,
			status varchar(30) not null default 'Active'
		);
	END;

IF NOT EXISTS(SELECT 1 FROM sys.tables WHERE name = 'funcionario_endereco')
	BEGIN
		CREATE TABLE funcionario_endereco(
			id_funcionario int not null,
			cidade varchar(30) not null default 'Maputo',
			pais varchar(75) not null default 'Moçambique',
			bairro varchar(75) not null default '',
			numero int not null default 0,
			avenida varchar(75) not null default ''
		);
	END;

IF NOT EXISTS(SELECT 1 FROM sys.tables WHERE name = 'funcionario_telefone')
	BEGIN
		CREATE TABLE funcionario_telefone(
			id_funcionario int not null,
			telefone varchar(30) not null unique
		);
	END;

IF NOT EXISTS(SELECT 1 FROM sys.tables WHERE name = 'funcionario_email')
	BEGIN
		CREATE TABLE funcionario_email(
			id_funcionario int not null,
			email varchar(125) not null unique	
		);
	END;

IF NOT EXISTS(SELECT 1 FROM sys.tables WHERE name = 'produto')
	BEGIN
		CREATE TABLE produto(
			id int primary key identity,
			codigo_barras varchar(254) unique not null,
			nome varchar(125) not null,
			categoria varchar(125) not null,
			descricao text, 
			quantidade_caixa int not null default 1,
			quantidade_unidade int default 1,
			quantidade_minima int default 0,
			valor_total decimal(10, 2) not null,
			valor_unidade decimal(10, 2) not null,
			data_validade date,
			data_compra date,
			created_at date default getdate(),
			deleted_at datetime null,
			soft_delete varchar(15) not null default 'SAFE'

		);
	END;

IF NOT EXISTS(SELECT 1 FROM sys.tables WHERE name = 'fornecedor')
	BEGIN
		CREATE TABLE fornecedor(
			id int primary key identity,
			nome_fornecedor varchar(125) NOT NULL,
			tipo_produto varchar(75) NOT NULL,
			pais varchar(125),
			nuit varchar(11) not null unique,
			cidade_fornecedor varchar(75) NOT NULL,
			avenida varchar(75),
			created_at date default getdate(),
			deleted_at datetime null,
			soft_delete varchar(15) not null default 'SAFE'
		);
	END;

IF NOT EXISTS(SELECT 1 FROM sys.tables WHERE name = 'saida_produto')
	BEGIN
		CREATE TABLE saida_produto(
			id int primary key identity,
			id_produto int not null,
			id_usuario int not null,
			data_saida date not null,
			quantidade int not null,
			observacao varchar(255),
			created_at date default getdate(),
			deleted_at datetime null,
			soft_delete varchar(15) not null default 'SAFE'
		);
	END;

IF NOT EXISTS (SELECT 1 FROM sys.tables WHERE name = 'fornecedor_produto')
	BEGIN
		CREATE TABLE fornecedor_produto(
			id_fornecedor int not null,
			id_produto int not null,
			primary key(id_fornecedor, id_produto),
		);
	END;

IF NOT EXISTS(SELECT 1 FROM sys.tables WHERE name = 'fornecedor_telefone')
	BEGIN
		CREATE TABLE fornecedor_telefone(
			id_fornecedor int not null,
			telefone varchar(75) not null unique,
			FOREIGN KEY (id_fornecedor) REFERENCES fornecedor (id) 
				ON DELETE CASCADE 
				ON UPDATE CASCADE

		);
	END;
 
IF NOT EXISTS(SELECT 1 FROM sys.tables WHERE name = 'fornecedor_email')
	BEGIN
		CREATE TABLE fornecedor_email(
			id_fornecedor int not null,
			email varchar(75) not null unique,
			FOREIGN KEY (id_fornecedor) REFERENCES fornecedor (id)
				ON DELETE CASCADE 
				ON UPDATE CASCADE
		);
	END;

-- Relações

ALTER TABLE dbo.funcionario_email ADD  FOREIGN KEY (id_funcionario) REFERENCES funcionario (id)
ON DELETE CASCADE
ON UPDATE CASCADE;

ALTER TABLE dbo.funcionario_telefone ADD  FOREIGN KEY (id_funcionario) REFERENCES funcionario (id)
ON DELETE CASCADE
ON UPDATE CASCADE;

ALTER TABLE dbo.funcionario_endereco ADD  FOREIGN KEY (id_funcionario) REFERENCES funcionario (id)
ON DELETE CASCADE
ON UPDATE CASCADE;

ALTER TABLE dbo.usuario ADD  FOREIGN KEY (id_funcionario) REFERENCES funcionario (id)
ON DELETE CASCADE
ON UPDATE CASCADE;

ALTER TABLE dbo.fornecedor_produto ADD  FOREIGN KEY (id_fornecedor) REFERENCES fornecedor (id)
ON DELETE CASCADE
ON UPDATE CASCADE;

ALTER TABLE dbo.fornecedor_produto ADD FOREIGN KEY (id_produto) REFERENCES produto(id)
ON DELETE CASCADE
ON UPDATE CASCADE;


ALTER TABLE dbo.saida_produto ADD FOREIGN KEY (id_produto)  REFERENCES produto(id)
ON DELETE CASCADE
ON UPDATE CASCADE;

ALTER TABLE dbo.saida_produto ADD FOREIGN KEY (id_usuario)  REFERENCES usuario(id_funcionario)
ON DELETE CASCADE
ON UPDATE CASCADE;

--

-- FAKE DATA [TESTE]
INSERT INTO dbo.funcionario(
	 nome, apelido, outro_nome, nascimento, genero, b_identidade, nuit, nacionalidade 
)VALUES(
	'DMZ', 'SOFTWARE', '', '2020-08-05', 'Masculino', '11112222333 J', '111 222 333', 'Moçambicana'
);

INSERT INTO usuario(
	id_funcionario, username, password, tipo_usuario, status
) VALUES(
	1, 'SQL_SERVER', '830EF117E1386DFC8C1C22201C5450B6D9EF60AD6FBBDFDACC5CB923C0F799C9', 'Administrador', 'Activo'
);

SELECT * FROM funcionario;
SELECT * FROM usuario;