

/*
TABELA PESSOAS

------------------------------------------------------------------------------
Column Name       Data Type     Length  Constraints               Nullable
------------------------------------------------------------------------------
CODPESSOA         Alfanumérico  3       Primary Key
CPFCNPJ           Alfanumérico  14                                Not Null
NOME              Alfanumérico  100                               Not Null
DATANASCIMENTO    Data                                            Not Null
TIPOPESSOA        Alfanumérico  1       Accept only 'F' or 'J'    Not Null
NUMEROFILHOS      Inteiro               Default value 0           Not Null
INDCLIENTEBANCO   Alfanumérico  1       Accept only 'S' or 'N'    Not Null
TIPOLOGRADOURO    Alfanumérico  3
LOGRADOURO        Alfanumérico  100
BAIRRO            Alfanumérico  50
CIDADE            Alfanumérico  50
UF                Alfanumérico  2
PAIS              Alfanumérico  50
CEP               Alfanumérico  8
------------------------------------------------------------------------------
*/
CREATE TABLE PESSOAS (
  CODPESSOA VARCHAR(3),
  CPFCNPJ VARCHAR(14) NOT NULL,
  NOME VARCHAR(100) NOT NULL,
  DATANASCIMENTO DATE NOT NULL,
  TIPOPESSOA VARCHAR(1) NOT NULL,
  NUMEROFILHOS INT NOT NULL,
  INDCLIENTEBANCO VARCHAR(1) NOT NULL,
  TIPOLOGRADOURO VARCHAR(3),
  LOGRADOURO VARCHAR(100),
  BAIRRO VARCHAR(50),
  CIDADE VARCHAR(50),
  UF VARCHAR(2),
  PAIS VARCHAR(50),
  CEP VARCHAR(8),

  CONSTRAINT PK_PESSOAS PRIMARY KEY (CODPESSOA),
  CONSTRAINT CHK_TIPOPESSOA CHECK (TIPOPESSOA IN ('F', 'J')),
  CONSTRAINT CHK_INDCLIENTEBANCO CHECK (INDCLIENTEBANCO IN ('S','N'))
)





/*
TABELA CONTAS

---------------------------------------------------------------------------------
Column Name       Data Type     Length   Constraints                 Nullable
---------------------------------------------------------------------------------
CODCOLIGADA       Alfanumérico  3        Primary Key
CODAGENCIA        Alfanumérico  5        Primary Key
NROCONTA          Alfanumérico  7        Primary Key
CODPESSOA         Alfanumérico  3        Foreign Key with PESSOAS    Not Null
INDPOUPANCA       Alfanumérico  1        Accept only 'S' or 'N'      Not Null
USUARIOINCLUSAO   Alfanumérico  100
DATAINCLUSAO      Data
USUARIOALTERACAO  Alfanumérico  100
---------------------------------------------------------------------------------
*/
CREATE TABLE CONTAS (
	CODCOLIGADA VARCHAR(3),
	CODAGENCIA VARCHAR(5),
	NROCONTA VARCHAR(7),
	CODPESSOA VARCHAR(3) NOT NULL,
	INDPOUPANCA VARCHAR(1) NOT NULL,
	USUARIOINCLUSAO VARCHAR(100),
	DATAINCLUSAO DATE,
	USUARIOALTERACAO VARCHAR(100),
	DATAALTERACAO DATE,

	CONSTRAINT PK_CONTAS PRIMARY KEY (CODCOLIGADA, CODAGENCIA, NROCONTA),
	CONSTRAINT FK_CONTAS_PESSOAS FOREIGN KEY (CODPESSOA) REFERENCES PESSOAS (CODPESSOA),
	CONSTRAINT CHK_INDPOUPANCA CHECK (INDPOUPANCA IN ('S', 'N'))
)





/*
TABELA MOVIMENTOS

-----------------------------------------------------------------------------------------------
Column Name       Data Type     Length   Constraints                                Nullable
-----------------------------------------------------------------------------------------------
CODCOLIGADA       Alfanumérico  3        Primary Key and Foreign Key with Contas
CODAGENCIA        Alfanumérico  5        Primary Key and Foreign Key with Contas
NROCONTA          Alfanumérico  7        Primary Key and Foreign Key with Contas
NROMOVIMENTO      Inteiro                Primary Key and Auto Incrementing Field
DATAMOVIMENTO     Data                                                              Not Null
VALOR             Numérico      17,2
MORA              Numérico      17,2
MULTA             Numérico      17,2
DESCONTO          Numérico      17,2
DESCRICAO         Numérico      17,2
-----------------------------------------------------------------------------------------------
*/
CREATE TABLE MOVIMENTOS (
	CODCOLIGADA VARCHAR(3),
	CODAGENCIA VARCHAR(5),
	NROCONTA VARCHAR(7),
	NROMOVIMENTO INT IDENTITY(1,1),
	DATAMOVIMENTO DATE NOT NULL,
	VALOR DECIMAL(17,2),
	MORA DECIMAL(17,2),
	MULTA DECIMAL(17,2),
	DESCONTO DECIMAL(17,2),
	DESCRICAO DECIMAL(17,2),

	CONSTRAINT PK_MOVIMENTOS PRIMARY KEY (CODCOLIGADA, CODAGENCIA, NROCONTA, NROMOVIMENTO),
	CONSTRAINT FK_MOVIMENTOS_CONTAS FOREIGN KEY (CODCOLIGADA, CODAGENCIA, NROCONTA) REFERENCES CONTAS (CODCOLIGADA, CODAGENCIA, NROCONTA)
)





/*
Realize 2 inserções na tabela PESSOAS, sendo que:
	- O nome da pessoa deve iniciar pelo nome do treinando
	- Para uma pessoa, inserir o TIPOPESSOA 'F' e a outra 'J'
	- Para uma pessoa, inserir o INDCLIENTEBANCO 'S' e a outra 'N'
*/
INSERT INTO PESSOAS (CODPESSOA, CPFCNPJ, NOME, DATANASCIMENTO, TIPOPESSOA, NUMEROFILHOS, INDCLIENTEBANCO, TIPOLOGRADOURO, LOGRADOURO, BAIRRO, CIDADE, UF, PAIS, CEP)
VALUES
('001', '12345678901', 'Lucas da Silva', '1990-05-15', 'F', 2, 'S', 'RUA', 'Rua das Flores, 123', 'Centro', 'São Paulo', 'SP', 'Brasil', '01001000'),
('002', '12345678000199', 'Lucas Tech Ltda.', '2000-01-01', 'J', 0, 'N', 'AV', 'Av. das Empresas, 456', 'Industrial', 'Campinas', 'SP', 'Brasil', '13010000')





/* Realize uma nova inserção na tabela pessoas */
INSERT INTO PESSOAS (CODPESSOA, CPFCNPJ, NOME, DATANASCIMENTO, TIPOPESSOA, NUMEROFILHOS, INDCLIENTEBANCO, TIPOLOGRADOURO, LOGRADOURO, BAIRRO, CIDADE, UF, PAIS, CEP)
VALUES
('003', '98765432100', 'Mariana Oliveira', '1988-11-30', 'F', 1, 'N', 'RUA', 'Rua do Sol, 789', 'Jardins', 'Belo Horizonte', 'MG', 'Brasil', '30140071')





/* Altere o TIPOPESSOA, LOGRADOURO E DATANASCIMENTO da pessoa inserida no tópico 3 */
UPDATE PESSOAS
SET TIPOPESSOA = 'J',
    LOGRADOURO = 'Rua Nova Esperança, 321',
    DATANASCIMENTO = '1995-03-20'
WHERE CODPESSOA = '003';





/* Exclua a pessoa inserida no tópico 3 */
DELETE FROM PESSOAS
WHERE CODPESSOA = '003'





/* Realize 2 inserções na tabela CONTAS, sendo que a conta seja para pessoas diferentes */
INSERT INTO CONTAS (CODCOLIGADA, CODAGENCIA, NROCONTA, CODPESSOA, INDPOUPANCA, USUARIOINCLUSAO, DATAINCLUSAO, USUARIOALTERACAO, DATAALTERACAO)
VALUES
('001', '12345', '0001001', '001', 'N', 'admin', '2025-06-22', NULL, NULL),
('001', '12345', '0002001', '002', 'S', 'sistema', '2025-06-22', NULL, NULL)





/* Realize uma consulta que retorne quantas pessoas estão cadastradas */
SELECT COUNT(*) AS QTD_PESSOAS_CADASTRADAS FROM PESSOAS





/*
Realize um select na tabela clientes que exiba o nome do cliente e:
	- Se TIPOPESSOA = 'J', exiba Jurídica
	- Se TIPOPESSOA = 'F', exiba Física
*/
SELECT
	NOME,
	CASE TIPOPESSOA
    WHEN 'J' THEN 'JURIDICA'
		WHEN 'F' THEN 'FISICA'
	END AS TIPOPESSOA
FROM PESSOAS
WHERE INDCLIENTEBANCO = 'S'





/* Realize uma consulta que retorne a pessoa que possui a menor DATANASCIMENTO */
SELECT *
FROM PESSOAS
WHERE DATANASCIMENTO = (SELECT MIN(DATANASCIMENTO) FROM PESSOAS)





/* Realize uma consulta que retorne as pessoas ordenadas por UF e CIDADE, desde que a UF e a CIDADE sejam diferentes de nulo ou vazio */
SELECT *
FROM PESSOAS
WHERE (UF IS NOT NULL AND UF <> '') AND
	    (CIDADE IS NOT NULL AND CIDADE <> '')
ORDER BY UF, CIDADE





/* Realize uma consulta que retorne apenas o nome e o número da conta dos clientes */
SELECT P.NOME, C.NROCONTA
FROM PESSOAS P
JOIN CONTAS C
  ON P.CODPESSOA = C.CODPESSOA





/* Realize uma consulta que traga apenas as contas dos clientes que tem mais de uma conta */
SELECT C.*
FROM CONTAS C
JOIN PESSOAS P
  ON C.CODPESSOA = P.CODPESSOA
WHERE P.INDCLIENTEBANCO = 'S' AND
	    P.CODPESSOA IN (
        SELECT CODPESSOA
        FROM CONTAS
        GROUP BY CODPESSOA
        HAVING COUNT(*) > 1
	    )





/* Realize uma consulta que traga apenas as contas dos clientes que o TIPOPESSOA seja 'F' */
SELECT C.*
FROM CONTAS C
JOIN PESSOAS P
  ON C.CODPESSOA = P.CODPESSOA
WHERE P.INDCLIENTEBANCO = 'S' AND
      P.TIPOPESSOA = 'F'
