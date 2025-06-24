

/*
Crie uma stored procedure que receba por parâmetro os dados da tabela MOVIMENTOS, exceto o número e a data de movimento, e inclua o registro desde que:
	- Exista a conta passada por parâmetro na tabela CONTAS (ver pela chave primária inteira e não apenas pelo número da conta)
	- Ao incluir, para a data do movimento, passar a data corrente.
  - Execute a procedure de forma que insira o registro.
  - Realize uma consulta que retorne apenas o registro inserido pela procedure.
*/
CREATE PROCEDURE P_MOVIMENTOS_INSERIR (
	@CODCOLIGADA VARCHAR(3),
	@CODAGENCIA VARCHAR(5),
	@NROCONTA VARCHAR(7),
	@VALOR DECIMAL(17,2),
	@MORA DECIMAL(17,2),
	@MULTA DECIMAL(17,2),
	@DESCONTO DECIMAL(17,2),
	@DESCRICAO DECIMAL(17,2)
)
AS
BEGIN
	IF EXISTS (
		SELECT 1
		FROM CONTAS
		WHERE CODCOLIGADA = @CODCOLIGADA AND
			    CODAGENCIA = @CODAGENCIA AND
			    NROCONTA = @NROCONTA
		)
	BEGIN
		INSERT INTO MOVIMENTOS (CODCOLIGADA, CODAGENCIA, NROCONTA, DATAMOVIMENTO, VALOR, MORA, MULTA, DESCONTO, DESCRICAO)
		VALUES
		(@CODCOLIGADA, @CODAGENCIA, @NROCONTA, GETDATE(), @VALOR, @MORA, @MULTA, @DESCONTO, @DESCRICAO)
	END
END

EXEC P_CONTAS_INSERIR
		@CODCOLIGADA = '002',
		@CODAGENCIA = '54321',
		@NROCONTA = '0003001',
		@VALOR = 100.00,
		@MORA = 2.00,
		@MULTA = 1.50,
		@DESCONTO = 0.00,
		@DESCRICAO = 0.00

SELECT *
FROM MOVIMENTOS
WHERE CODCOLIGADA = '002' AND
      CODAGENCIA = '54321' AND
      NROCONTA = '0003001' AND
      NROMOVIMENTO = 1






/* Realize uma nova inserção utilizando a stored procedure criada no exercício 14, porém, para outra conta. */
EXEC P_CONTAS_INSERIR
	@CODCOLIGADA = '001',
	@CODAGENCIA = '12345',
	@NROCONTA = '0001001',
	@VALOR = 250.00,
	@MORA = 5.00,
	@MULTA = 2.50,
	@DESCONTO = 10.00,
	@DESCRICAO = 0.00





/* Insira uma check nos campos VALOR, MORA, MULTA e DESCONTO da tabela MOVIMENTOS para não permitir valores negativos */
ALTER TABLE MOVIMENTOS
ADD
CONSTRAINT CHK_VALOR CHECK (VALOR >= 0),
CONSTRAINT CHK_MORA CHECK (MORA >= 0),
CONSTRAINT CHK_MULTA CHECK (MULTA >= 0),
CONSTRAINT CHK_DESCONTO CHECK (DESCONTO >= 0)

INSERT INTO MOVIMENTOS (CODCOLIGADA, CODAGENCIA, NROCONTA, DATAMOVIMENTO, VALOR, MORA, MULTA, DESCONTO, DESCRICAO)
VALUES
('001', '12345', '0001001', GETDATE(), -100.00, 5.00, 2.50, 0.00, 0.00)





/* Realize um consulta que retorne o menor, o maior e a média do campo VALOR da tabela MOVIMENTOS */
SELECT  MIN(VALOR) AS MENOR_VALOR,
        MAX(VALOR) AS MAIOR_VALOR,
        AVG(VALOR) AS MEDIA_VALOR
FROM MOVIMENTOS





/* Realize uma consulta que retorne os campos CPFCNPJ, NOME da tabela PESSOA, e o campo DATAMOVIMENTO da tabela MOVIMENTOS, desde que seja o maior valor, que a conta seja do tipo poupança (INDPOUPANCA = S) e que a pessoa seja cliente (INDCLIENTEBANCO = 'S') */
SELECT P.CPFCNPJ, P.NOME, MAX(M.DATAMOVIMENTO)
FROM PESSOAS P
JOIN CONTAS C
	ON P.CODPESSOA = C.CODPESSOA
JOIN MOVIMENTOS M
	ON  C.CODCOLIGADA = M.CODCOLIGADA AND
	    C.CODAGENCIA = M.CODAGENCIA AND
      C.NROCONTA = M.NROCONTA
WHERE C.INDPOUPANCA = 'S' AND
	    P.INDCLIENTEBANCO = 'S'
GROUP BY P.CPFCNPJ, P.NOME
