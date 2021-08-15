# Atividade Programação 1 - UNICESUMAR
Crie uma aplicação utilizando as práticas de encapsulamento, abstração, herança, polimorfismo e Javabeans.;<br />

Programe um controle de Bancário para gerenciar uma **_conta corrente_** e **_conta poupança_**. Onde deverá ter as seguintes classes:
## Conta
> número, agência, cliente e saldo;<br />
> Número da conta e agência deverá ser maior que 0;<br />
> Deverá ter um construtor com número, agência e cliente;<br />
> Deverá iniciar um saldo 0;<br />
> Deverá ter um método de sacar e depositar;<br />
> O atributo saldo deverá ter apenas método get;<br />
> O método sacar deverá ser abstrato;<br />

## Cliente 
> Deverá ter um nome e cpf, ambos String;<br />
> Deverá ter um construtor com todos os atributos;<br />
> Deverá ter apenas métodos gets;<br />

## Conta Corrente
> Deverá herdar de conta;<br />
> Deverá retirar do saldo 0,10 a cada saque;<br />
> Não deverá permitir sacar um valor superior ao saldo;<br />

## Conta poupança
> Deverá herdar de conta;<br />
> Não deverá permitir sacar um valor superior ao saldo;<br />

## Principal
> Principal, deverá ter uma classe Principal que terá o método main;<br />
> Deverá instanciar um objeto conta corrente;<br />
> Deverá instanciar um objeto conta poupança;<br />
> Deverá exibir todas as informações de todos os atributos de conta corrente e poupança;<br />

![Atividade01](https://user-images.githubusercontent.com/88719652/129478318-68d49b1a-24da-4a6a-98c3-d142a7d8d11d.png)
