algoritmo "DoisOuUm"
// MAPA - ADS/SI - ALGORITIMO E LOGICA DE PROGRAMACAO I - 2020
// Autor : Andrey Cardoso Querino
// R.A : 1971669-5
// Atividade jogo DOIS ou UM
var
   A, C, P, X : inteiro
Procedimento topo()
inicio
      escreval("=====================================")
      escreval("          JOGO DOIS OU UM")
      escreval("=====================================")
      escreval
fimprocedimento
procedimento VerificaNumero(var Y : inteiro)
inicio
      leia(Y)
      enquanto (Y <> 1) e (Y <> 2) faca
               escreva("ERRO! Apenas o nº 2 ou nº 1: ")
               leia(Y)
      fimenquanto
      limpatela
fimprocedimento
inicio
      topo()
      escreva("Andre escolha 2 ou 1: ")
      VerificaNumero(A)
      topo()
      escreva("Carlos escolha 2 ou 1: ")
      VerificaNumero(C)
      topo()
      escreva("Pietro escolha 2 ou 1: ")
      VerificaNumero(P)
      topo()
      escreval("            & RESULTADO &")
      escreval(" Andre =",A,"   Carlos =",C,"   Pietro =",P)
      escreval
      se (A <> C) e (C = P) entao
         escreval("         A - Andre vencedor!")
      senao
           se (A <> C) e (A = P) entao
              escreval("         C - Carlos vencedor!")
           senao
                se (A = C) e (C <> P) entao
                   escreval("         P - Pietro vencedor!")
                senao
                     se (A = C) e (C = P) entao
                        escreval("             X - Empate!")
                     fimse
                fimse
           fimse
      fimse
      escreval
      escreval("=====================================")
fimalgoritmo

