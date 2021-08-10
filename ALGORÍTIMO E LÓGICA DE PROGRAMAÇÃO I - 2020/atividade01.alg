algoritmo "SomaEnquanto"
// Nome: Andrey Querino
// Função: Soma de 5 valores com a interação do usuário com a máquina
// Comando "Enquanto"
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
