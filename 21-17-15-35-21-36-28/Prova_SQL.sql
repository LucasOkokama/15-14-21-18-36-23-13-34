

/*
Crie as seguintes tabelas e campos

Tabela: PESSOAS
--------------------------------------------------------------------------------------------------
Column Name       Data Type     Length   Constraints        Nullable
--------------------------------------------------------------------------------------------------
CPF               ALFANUMERICO  11       Primary Key
NOME              ALFANUMERICO  50                          NOT NULL
LOGRADOURO        ALFANUMERICO  150                         NOT NULL
TELEFONE          ALFANUMERICO  12
LIMITE CREDITO    NUMERICO      17,2     Default value 0    NOT NULL
OBSERVACAO        VARCHAR       100
--------------------------------------------------------------------------------------------------


Tabela: EMPRESTIMOS
--------------------------------------------------------------------------------------------------
Column Name       Data Type     Length   Constraints                                   Nullable
--------------------------------------------------------------------------------------------------
NUMERO CONTRATO   ALFANUMERICO  8        Primary Key
CPF               ALFANUMERICO  11       Primary Key, Foreign Key with PESSOAS (CPF)
DATA EMPRESTIMO   DATA                                                                 NOT NULL
VALOR EMPRESTIMO  NUMERICO      17,2     Default value 0                               NOT NULL
--------------------------------------------------------------------------------------------------


Tabela: PAGAMENTOS
--------------------------------------------------------------------------------------------------
Column Name       Data Type     Length   Constraints                                Nullable
--------------------------------------------------------------------------------------------------
NUMERO CONTRATO   ALFANUMERICO  8        Primary Key, Foreign Key with EMPRESTIMOS
CPF               ALFANUMERICO  11       Primary Key, Foreign Key with EMPRESTIMOS
DATA PAGAMENTO    DATA                                                              NOT NULL
VALOR PAGAMENTO   NUMERICO      17,2     Default value 0                            NOT NULL
--------------------------------------------------------------------------------------------------
*/
CREATE TABLE PESSOAS (
    CPF VARCHAR(11),
    NOME VARCHAR(50) NOT NULL,
    LOGRADOURO VARCHAR(150) NOT NULL,
    TELEFONE VARCHAR(12),
    LIMITE_CREDITO DECIMAL(17,2) NOT NULL DEFAULT 0,
    OBSERVACAO VARCHAR(100),

    CONSTRAINT PK_PESSOAS PRIMARY KEY (CPF)
);

CREATE TABLE EMPRESTIMOS (
	NUMERO_CONTRATO VARCHAR(8),
	CPF VARCHAR(11),
	DATA_EMPRESTIMO DATE NOT NULL,
	VALOR_EMPRESTIMO DECIMAL(17,2) NOT NULL DEFAULT 0,

	CONSTRAINT PK_EMPRESTIMOS PRIMARY KEY (NUMERO_CONTRATO, CPF),
	CONSTRAINT FK_EMPRESTIMOS_PESSOAS FOREIGN KEY (CPF) REFERENCES PESSOAS (CPF)
)

CREATE TABLE PAGAMENTOS (
	NUMERO_CONTRATO VARCHAR(8),
	CPF VARCHAR(11),
	DATA_PAGAMENTO DATE NOT NULL,
	VALOR_PAGAMENTO DECIMAL(17,2) NOT NULL DEFAULT 0,

	CONSTRAINT PK_PAGAMENTOS PRIMARY KEY (NUMERO_CONTRATO, CPF),
	CONSTRAINT FK_PAGAMENTOS_EMPRESTIMOS FOREIGN KEY (NUMERO_CONTRATO, CPF) REFERENCES EMPRESTIMOS (NUMERO_CONTRATO, CPF)
)





/* 1) Realize cinco inserções na tabela Pessoas sendo que, para uma delas, no logradouro, seja inserido o conteúdo SÃO PAULO */
INSERT INTO PESSOAS (CPF, NOME, LOGRADOURO, TELEFONE, LIMITE_CREDITO, OBSERVACAO)
VALUES
('12345678901', 'Videu Soares', 'RUA DOS MARES QUENTES, 123', '11987654321', 1000.00, NULL),
('23456789012', 'Maria Penelope', 'AVENIDA PAULISTA, 456', '11912345678', 900.00, NULL),
('34567890123', 'Guilherme Freitas', 'SÃO PAULO', '11999999999', 0, NULL),
('45678901234', 'José Vileburgo', 'RUA MIGUEL TEOTONIO, 789', '11968476827', 3000.50, NULL),
('56789012345', 'Joana Milena', 'RUA VERGUEIRO, 222', '11876543210', 250.00, NULL)





/* 2) Altere o limite de crédito de duas Pessoas para 1000,00 */
UPDATE PESSOAS
SET LIMITE_CREDITO = 1000.00
WHERE CPF IN ('23456789012', '56789012345')





/* 3) Delete  um registro da tabela Pessoas, exceto a de logradouro com conteúdo igual a 'SÃO PAULO' */
DELETE FROM PESSOAS
WHERE CPF = '12345678901' AND LOGRADOURO <> 'SÃO PAULO'





/* 4) Insira na tabela Empréstimos 4 registros, sendo uma para cada pessoa, e que a data do empréstimo seja entre 01/01/2001 à 10/01/2011 */
INSERT INTO EMPRESTIMOS (NUMERO_CONTRATO, CPF, DATA_EMPRESTIMO, VALOR_EMPRESTIMO)
VALUES
('C0000001', '23456789012', '2010-06-10', 1500.00),
('C0000002', '34567890123', '2007-02-12', 1000.00),
('C0000003', '45678901234', '2003-04-27', 2500.00),
('C0000004', '56789012345', '2009-11-30', 300.00)





/* 5) Altere a data de empréstimo de apenas um empréstimo */
UPDATE EMPRESTIMOS
SET DATA_EMPRESTIMO = '2008-12-03'
WHERE NUMERO_CONTRATO = 'C0000004' AND
	    CPF = '56789012345'





/* 6) Realize uma consulta que retorne apenas empréstimos que tenham valores acima de 1000,00 */
SELECT *
FROM EMPRESTIMOS
WHERE VALOR_EMPRESTIMO > 1000.00





/* 7) Realize uma consulta que retorne a soma de todos os empréstimos realizados no período de 01/01/2001  10/01/2011 */
SELECT SUM(VALOR_EMPRESTIMO) AS TOTAL_EMPRESTIMOS
FROM EMPRESTIMOS
WHERE DATA_EMPRESTIMO BETWEEN '2001-01-01' AND '2011-01-10'





/* 8) Realize uma consulta que retorne apenas o nome das pessoas que não realizaram empréstimos */
SELECT P.NOME
FROM PESSOAS P
LEFT JOIN EMPRESTIMOS E
	ON P.CPF = E.CPF
WHERE E.CPF IS NULL





/* 9) Realize uma consulta que retorne o nome e o limite de crédito das pessoas que tem empréstimos com valores acima de 1000,01 */
SELECT P.NOME, P.LIMITE_CREDITO
FROM PESSOAS P
JOIN EMPRESTIMOS E
	ON P.CPF = E.CPF
WHERE E.VALOR_EMPRESTIMO > 1000.01





/* 10) Realize uma consulta que retorne todos os empréstimos ordenados por data do empréstimo e valor do empréstimo */
SELECT *
FROM EMPRESTIMOS
ORDER BY DATA_EMPRESTIMO, VALOR_EMPRESTIMO





/* 11) Realize uma consulta que retorne todos os empréstimos desde que no logradouro exista o conteúdo 'SÃO PAULO' */
SELECT E.*
FROM EMPRESTIMOS E
JOIN PESSOAS P
ON E.CPF = P.CPF
WHERE P.LOGRADOURO LIKE '%SÃO PAULO%'





/* 12) Realize uma consulta que retorne a quantidade de registros da tabela Pessoas agrupadas por Limite Crédito */
SELECT LIMITE_CREDITO, COUNT(*) AS QUANTIDADE
FROM PESSOAS
GROUP BY LIMITE_CREDITO
GO





/* 13) Crie uma view que retorne todas as pessoas que possuem empréstimos com valores maiores que o seu limite de crédito e realize uma consulta com base nesta view
*/
CREATE VIEW VW_VALOR_EMPRESTIMO_MAIOR_LIMITE_CREDITO
AS
SELECT P.*
FROM PESSOAS P
JOIN EMPRESTIMOS E
	ON P.CPF = E.CPF
WHERE E.VALOR_EMPRESTIMO > P.LIMITE_CREDITO
GO

SELECT * FROM VW_VALOR_EMPRESTIMO_MAIOR_LIMITE_CREDITO





/* 14) Exclua um empréstimo */
DELETE FROM EMPRESTIMOS
WHERE NUMERO_CONTRATO = 'C0000004' AND CPF = '56789012345'
GO





/*
15) Crie uma stored procedure que:
  - Receba por parâmetro todos os dados necessários para a inserção na tabela Empréstimos
  - Insira esses dados na tabela Empréstimos, desde que o limite de crédito da pessoa seja maior ou igual ao valor do empréstimo. Caso contrário, não inserir.
  - Se inseriu no tópico anterior, subtraia o valor do empréstimo do limite de crédito daquela pessoa
*/
CREATE PROCEDURE P_EMPRESTIMO_INSERIR (
	@NUMERO_CONTRATO VARCHAR(8),
	@CPF VARCHAR(11),
	@DATA_EMPRESTIMO DATE,
	@VALOR_EMPRESTIMO DECIMAL(17,2)
)
AS
BEGIN
	IF EXISTS (
		SELECT 1
		FROM PESSOAS
		WHERE CPF = @CPF AND LIMITE_CREDITO >= @VALOR_EMPRESTIMO
	)
	BEGIN
		INSERT INTO EMPRESTIMOS (NUMERO_CONTRATO, CPF, DATA_EMPRESTIMO, VALOR_EMPRESTIMO)
		VALUES
		(@NUMERO_CONTRATO, @CPF, @DATA_EMPRESTIMO, @VALOR_EMPRESTIMO)

		UPDATE PESSOAS
		SET LIMITE_CREDITO = LIMITE_CREDITO - @VALOR_EMPRESTIMO
		WHERE CPF = @CPF
	END

	ELSE
	BEGIN
		RAISERROR('ERRO: O limite de crédito é insuficiente para esse empréstimo.', 16, 1);
	END
END





/*
16)	Insira através da procedure criada anteriormente 3 empréstimos sendo que, num deles , o valor do limite de crédito seja menor que o valor do empréstimos, e os demais o valor seja igual e maior.
		- Realize a consulta na tabela empréstimos e verifique a inserção
		- Realize uma consulta na tabela Pessoas e verifique se o valor do empréstimo foi subtraído do limite de crédito
*/
-- VALOR_EMPRESTIMO maior que LIMITE_CREDITO ---> ERRO
EXEC P_EMPRESTIMO_INSERIR
    @NUMERO_CONTRATO = 'C0000005',
    @CPF = '34567890123',
    @DATA_EMPRESTIMO = '2025-06-23',
    @VALOR_EMPRESTIMO = 100.00


-- VALOR_EMPRESTIMO igual que LIMITE_CREDITO ---> SUCESSO (Zerar LIMITE_CREDITO)
EXEC P_EMPRESTIMO_INSERIR
    @NUMERO_CONTRATO = 'C0000006',
    @CPF = '23456789012',
    @DATA_EMPRESTIMO = '2025-06-23',
    @VALOR_EMPRESTIMO = 1000.00


-- VALOR_EMPRESTIMO menor que LIMITE_CREDITO ---> SUCESSO (Diminuir LIMITE_CREDITO)
EXEC P_EMPRESTIMO_INSERIR
    @NUMERO_CONTRATO = 'C0000007',
    @CPF = '45678901234',
    @DATA_EMPRESTIMO = '2025-06-23',
    @VALOR_EMPRESTIMO = 500.50


SELECT * FROM EMPRESTIMOS
SELECT * FROM PESSOAS
GO





/*
17) Crie uma trigger na tabela Pagamentos que (ao final desse exercício, REMOVA esta trigger para não ocasionar problemas nos próximos treinamentos):
	- Ao inserir nesta tabela, some o valor pago no limite de crédito da mesma pessoa.
*/
CREATE TRIGGER TR_AUMENTAR_LIMITE_CREDITO
ON PAGAMENTOS
AFTER INSERT
AS
BEGIN
	UPDATE P
	SET P.LIMITE_CREDITO = P.LIMITE_CREDITO + I.VALOR_PAGAMENTO
	FROM PESSOAS P
	JOIN INSERTED I
	  ON P.CPF = I.CPF
END





/*
18) Realize uma inserção na tabela pagamentos sendo que o valor do pagamento do contrato deve ser exatamente igual ao valor do empréstimo
	- Realize a consulta na tabela Pessoa para verificar se o valor do pagamento somou no valor do limite de crédito
*/
INSERT INTO PAGAMENTOS (NUMERO_CONTRATO, CPF, DATA_PAGAMENTO, VALOR_PAGAMENTO)
VALUES
('C0000002','34567890123','2025-06-23', 1000.00)

SELECT * FROM PESSOAS WHERE CPF = '34567890123'





/*
19) Crie uma tabela  chamada LOG_EMPRESTIMO, com os mesmos campos e tipo de dados da tabela EMPRESTIMO.
	Incluir na tabela LOG_EMPRESTIMO os campos:
  - DATAINCLUSAO DATA,
  - USUARIOINCLUSAO ALFANUMERICO(50),
  - DATAALTERACAO DATA,
  - USUARIOALTERACAO ALFANUMERICO(50)

Faça uma trigger de insert e update que toda vez que for inserido ou alterado algum registro na tabela empréstimo, o dado inserido ou o dado alterado deve ser inserido na tabela LOG_EMPRESTIMO.
Nos campos DATAINCLUSAO e DATAALTERACAO guardar a data do dia da inserção ou alteração do registro.
Nos campos USUARIOINCLUSAO guardar o host_name().
*/

CREATE TABLE LOG_EMPRESTIMO (
  NUMERO_CONTRATO VARCHAR(8),
  CPF VARCHAR(11),
  DATA_EMPRESTIMO DATE NOT NULL,
  VALOR_EMPRESTIMO DECIMAL(17,2) NOT NULL DEFAULT 0,
  DATAINCLUSAO DATE,
  USUARIOINCLUSAO VARCHAR(50),
  DATAALTERACAO DATE,
  USUARIOALTERACAO VARCHAR(50)
)
GO


CREATE TRIGGER TR_LOG_EMPRESTIMO
ON EMPRESTIMOS
AFTER INSERT, UPDATE
AS
BEGIN
	-- INSERT
	IF EXISTS (SELECT 1 FROM INSERTED) AND NOT EXISTS (SELECT 1 FROM DELETED)
	BEGIN
		INSERT INTO LOG_EMPRESTIMO (NUMERO_CONTRATO, CPF, DATA_EMPRESTIMO, VALOR_EMPRESTIMO, DATAINCLUSAO, USUARIOINCLUSAO)
		SELECT NUMERO_CONTRATO, CPF, DATA_EMPRESTIMO, VALOR_EMPRESTIMO, GETDATE(), HOST_NAME()
		FROM INSERTED
	END

	-- UPDATE
	IF EXISTS (SELECT 1 FROM INSERTED) AND EXISTS (SELECT 1 FROM DELETED)
	BEGIN
		INSERT INTO LOG_EMPRESTIMO (NUMERO_CONTRATO, CPF, DATA_EMPRESTIMO, VALOR_EMPRESTIMO, DATAALTERACAO, USUARIOALTERACAO)
		SELECT NUMERO_CONTRATO, CPF, DATA_EMPRESTIMO, VALOR_EMPRESTIMO, GETDATE(), HOST_NAME()
		FROM INSERTED
	END
END


INSERT INTO EMPRESTIMOS (NUMERO_CONTRATO, CPF, DATA_EMPRESTIMO, VALOR_EMPRESTIMO)
VALUES
('C0000008', '23456789012', '2025-06-23', 700.00)

UPDATE EMPRESTIMOS
SET VALOR_EMPRESTIMO = 999.00
WHERE NUMERO_CONTRATO = 'C0000008' AND CPF = '23456789012'


SELECT * FROM LOG_EMPRESTIMO



