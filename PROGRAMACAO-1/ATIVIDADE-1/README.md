# Atividade Programação 1 - UNICESUMAR
Crie uma aplicação utilizando as práticas de encapsulamento, abstração, herança, polimorfismo e Javabeans.<br />

Programe um controle de Bancário para gerenciar uma _conta corrente_ e _conta poupança_. Onde deverá ter as seguintes classes:
## Conta
> número, agência, cliente e saldo
> Número da conta e agência deverá ser maior que 0
> Deverá ter um construtor com número, agência e cliente
> Deverá iniciar um saldo 0
> Deverá ter um método de sacar e depositar
> O atributo saldo deverá ter apenas método get
> O método sacar deverá ser abstrato

## Cliente 
> Deverá ter um nome e cpf, ambos String
> Deverá ter um construtor com todos os atributos
> Deverá ter apenas métodos gets

## Conta Corrente
> Deverá herdar de conta
> Deverá retirar do saldo 0,10 a cada saque
> Não deverá permitir sacar um valor superior ao saldo

## Conta poupança
> Deverá herdar de conta
> Não deverá permitir sacar um valor superior ao saldo

## Principal
> Principal, deverá ter uma classe Principal que terá o método main
> Deverá instanciar um objeto conta corrente
> Deverá instanciar um objeto conta poupança
> Deverá exibir todas as informações de todos os atributos de conta corrente e poupança


![](https://github.com/andreyquerino/UniCesumar/blob/main/PROGRAMACAO-1/ATIVIDADE-1/img/Atividade01.jpg)
