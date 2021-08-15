# Atividade Estrutura de Dados 1 - UNICESUMAR

## Atividade 1
Responder quais valores que estarão armazenados na fila, imediatamente antes de o programa finalizar sua execução? Escreva os valores começando pelo início da fila, e indo até o fim.<br />

## Atividade Mapa
Desenvolve um programa permite que o administrador do sistema (usuário) armazene as informações que o sistema acadêmico necessita para realizar as correções de cada atividade, a saber:
>- RA do aluno
>- Nome do arquivo
>- Extensão do arquivo
>- Matrícula do professor responsável pela correção

Toda vez que o usuário cadastrar uma nova atividade, suas informações são adicionadas ao final da fila. Ainda, sempre que o usuário desejar remover uma atividade da fila, seu programa deve ser capaz de excluir o elemento do início da fila, mantendo a estrutura de dados organizada de forma similar.<br />

O programa deve ter um menu principal em forma de laço de repetição que atenda aos seguintes requisitos:
>- O menu sempre deve imprimir o conteúdo da fila (do início em direção ao fim);
>- Após a impressão do conteúdo da fila, o usuário deve ser informado de que pode realizar as seguintes operações:
>- Inserir um elemento na fila;
>- Remover um elemento da fila;
>- Esvaziar a fila;
>- Encerrar o programa.

**Inserir um elemento na fila**
>deve, antes de mais nada, verificar se a fila já esta cheia. Se não houver mais espaço na fila, o usuário deve ser informado, e o programa volta para o menu inicial. Caso não esteja cheia, o programa deve pedir para que o usuário informe o RA do(a) aluno(a), nome do arquivo contendo a solução da atividade, a extensão do arquivo e a matrícula do professor responsável pela correção, inserindo essas informações no fim da fila.<br />

**Remover um elemento da fila** 
>deve tentar retirar a atividade que está na primeira posição da fila. Caso haja elemento para ser removido, todos os dados da respectiva atividade que será removido devem ser impressos na tela: RA do(a) estudante, nome do arquivo, extensão do arquivo e nome do(a) professor(a). Se a fila estiver vazia, o usuário deve ser informado e o programa simplesmente retorna ao menu principal.<br />

**Esvaziar a fila** 
>deve remover todos os elementos da fila.<br />

**Encerrar programa** 
>deve finalizar o processo.<br />

![mapa](https://user-images.githubusercontent.com/88719652/129478274-384186f2-cbb3-41e1-b978-c5c53e5bb32a.png)
