-- 1)Crie um script contendo os comandos de criação das tabelas (CREATE TABLE), lembrando que os tipos dos campos poderão ser ao seu critério, porém, não fugindo da necessidade do campo.

CREATE TABLE TIPO_PRODUTO(
ID		INTEGER PRIMARY KEY,
DESCRICAO	VARCHAR(60));

CREATE TABLE TIPO_PAGTO(
ID 		INTEGER PRIMARY KEY,
DESCRICAO	VARCHAR(60));

CREATE TABLE PRODUTOS(
ID		INTEGER PRIMARY KEY,
ID_TIPO_PRODUTO	INTEGER,
DESCRICAO	VARCHAR(60),
VALOR		VARCHAR(10),
FOREIGN KEY (ID_TIPO_PRODUTO) REFERENCES TIPO_PRODUTO (ID));

CREATE TABLE PEDIDOS(
ID 		INTEGER PRIMARY KEY,
DATA		VARCHAR(60),
ID_TIPO_PAGTO	INTEGER,
VALOR_TOTAL	VARCHAR(10),
FOREIGN KEY (ID_TIPO_PAGTO) REFERENCES TIPO_PAGTO (ID));

CREATE TABLE PEDIDOS_PRODUTOS(
ID		INTEGER PRIMARY KEY,
ID_PEDIDO	INTEGER,
ID_PRODUTO	INTEGER,
QTDE		VARCHAR(10),
VALOR_UNIT	VARCHAR(60),
VALOR_TOTAL	VARCHAR(60),
FOREIGN KEY (ID_PEDIDO) REFERENCES PEDIDOS (ID),
FOREIGN KEY (ID_PRODUTO) REFERENCES PRODUTOS (ID));


-- 2)Crie um script contendo os comandos de inserção de dados (INSERT), onde seja feita a inserção dos dados descritos nas tabelas acima.


INSERT INTO TIPO_PRODUTO VALUES (1, 'CONSUMO');
INSERT INTO TIPO_PRODUTO VALUES (2, 'VERBA');

INSERT INTO TIPO_PAGTO VALUES (1, 'A VISTA');
INSERT INTO TIPO_PAGTO VALUES (2, 'A PRAZO');

INSERT INTO PRODUTOS VALUES(1, 2, 'SABÃO EM PÓ 2 KG', '17.00');
INSERT INTO PRODUTOS VALUES(2, 1, 'COXINHA', '5.00');
INSERT INTO PRODUTOS VALUES(3, 1, 'EMPADINHA', '7.00');
INSERT INTO PRODUTOS VALUES(4, 1, 'BOLO PEDAÇO', '7.50');
INSERT INTO PRODUTOS VALUES(5, 2, 'DETERGENTES 5 LINTROS', '8.00');
INSERT INTO PRODUTOS VALUES(6, 1, 'PASTEL', '6.00');
INSERT INTO PRODUTOS VALUES(7, 1, 'PIZZA PEDAÇO', '7.00');
INSERT INTO PRODUTOS VALUES(8, 1, 'SUCO', '7.00'); 

INSERT INTO PEDIDOS VALUES(1, '27/07/2020', 1, '16.00');
INSERT INTO PEDIDOS VALUES(2, '05/08/2020', 2, '27.00');
INSERT INTO PEDIDOS VALUES(3, '06/08/2020', 1, '13.50');

INSERT INTO PEDIDOS_PRODUTOS VALUES(1, 1, 2, 2, '5.00', '10.00');
INSERT INTO PEDIDOS_PRODUTOS VALUES(2, 1, 6, 1, '6.00', '6.00');
INSERT INTO PEDIDOS_PRODUTOS VALUES(3, 2, 3, 3, '7.00', '21.00');
INSERT INTO PEDIDOS_PRODUTOS VALUES(4, 2, 6, 1, '6.00', '6.00');
INSERT INTO PEDIDOS_PRODUTOS VALUES(5, 3, 4, 1, '7.50', '7.50');
INSERT INTO PEDIDOS_PRODUTOS VALUES(6, 3, 6, 1, '6.00', '6.00');



-- 3)Crie os comandos para apagar os conteúdos das tabelas (DELETE).


DELETE FROM PEDIDOS_PRODUTOS WHERE ID = 1;
DELETE FROM PEDIDOS_PRODUTOS WHERE ID = 2;
DELETE FROM PEDIDOS_PRODUTOS WHERE ID = 3;
DELETE FROM PEDIDOS_PRODUTOS WHERE ID = 4;
DELETE FROM PEDIDOS_PRODUTOS WHERE ID = 5;
DELETE FROM PEDIDOS_PRODUTOS WHERE ID = 6;

DELETE FROM PEDIDOS WHERE ID = 1;
DELETE FROM PEDIDOS WHERE ID = 2;
DELETE FROM PEDIDOS WHERE ID = 3;


DELETE FROM PRODUTOS WHERE ID = 1;
DELETE FROM PRODUTOS WHERE ID = 2;
DELETE FROM PRODUTOS WHERE ID = 3;
DELETE FROM PRODUTOS WHERE ID = 4;
DELETE FROM PRODUTOS WHERE ID = 5;
DELETE FROM PRODUTOS WHERE ID = 6;
DELETE FROM PRODUTOS WHERE ID = 7;
DELETE FROM PRODUTOS WHERE ID = 8;

DELETE FROM TIPO_PRODUTO WHERE ID = 1;
DELETE FROM TIPO_PRODUTO WHERE ID = 2;

DELETE FROM TIPO_PAGTO WHERE ID = 1;
DELETE FROM TIPO_PAGTO WHERE ID = 2;
