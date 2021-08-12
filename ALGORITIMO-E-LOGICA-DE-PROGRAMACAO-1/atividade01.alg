algoritmo "SomaEnquanto"
// Nome: Andrey Querino

var
     contador, valor, soma : Inteiro
inicio
     contador <- 1
     soma <- 0
     Enquanto (contador <= 5) faca
       Escreva("Insira o",contador,"º valor: ")
       Leia(valor)
       contador <- contador + 1
       soma <- soma + valor
     FimEnquanto
       Escreval("A soma dos valores selecionados é:",soma)
fimalgoritmo
