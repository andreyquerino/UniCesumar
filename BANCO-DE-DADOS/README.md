# Atividade Mapa Banco de Dados - UNICESUMAR

**1)** Crie um script contendo os comandos de criação das tabelas (**CREATE TABLE**), lembrando que os tipos dos campos poderá ser ao seu critério, porém, não fugindo da necessidade do campo.
**2)** Crie um script contendo os comandos de inserção de dados (**INSERT**), onde seja feita a inserção dos dados descritos nas tabelas acima.
**3)** Crie os comandos para apagar o conteúdos das tabelas (**DELETE**).


## Tabela TIPO_PRODUTO:
- ID é chave primária.
 
## Tabela TIPO_PAGTO:
- ID é chave primária.
 
## Tabela PRODUTOS:
- ID é chave primária.
- ID_TIPO_PRODUTO é chave estrangeira e referencia ID da tabela TIPO_PRODUTO.

## Tabela PEDIDOS:
- ID é chave primária.
- ID_TIPO_PAGTO é chave estrangeira e referencia ID da tabela TIPO_PAGTO.

## Tabela PEDIDOS_PRODUTOS:
- ID é chave primária.
- ID_PEDIDO é chave estrangeira e referencia ID da tabela PEDIDOS.
- ID_PRODUTO é chave estrangeira e referencia ID da tabela PRODUTOS.