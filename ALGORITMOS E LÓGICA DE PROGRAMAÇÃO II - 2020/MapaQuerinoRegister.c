// UNICESUMAR - FOZ DO IGUAÇU - PR
// MAPA - ADS/SI - ALGORITMOS E LÓGICA DE PROGRAMAÇÃO II - 2020
// Autor : Andrey Querino
// R.A : 1971669-5
//
//        .:: QUERINO REGISTER VERSÃO BETA ::.
// Sistema de agenda que permite armazenar o cadastro de,
// no máximo, 5 (cinco) clientes por vez.


#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define QUANTIDADE 5  // Quantidade de Cadastro.

struct QuerinoRegister
{
    int codigo;
    char nome[30];
    char telefone[15];
    char email[50];
};

int main()
{
    setlocale(LC_ALL, "Portuguese");
    struct QuerinoRegister Agenda[QUANTIDADE];
    int i, opcoes;
    opcoes = QUANTIDADE + 1;
    Agenda[QUANTIDADE].codigo = 0;

    while (opcoes != 0)
    {
        system("cls");
        printf(".:: QUERINO REGISTER VERSÃO BETA ::.\n");
        printf("[1] Inserir Cadastro\n");
        printf("[2] Mostrar todos os cadastros\n");
        printf("[0] Encerrar\n");
        printf("Escolha uma opção: ");
        scanf("%d",&opcoes);
        fflush(stdin);
        if (opcoes > 2)
        {
            printf("\nErro: opção inválida!\n");
            system("pause");
        }
        if (opcoes == 1)
        {
            if (Agenda[QUANTIDADE].codigo < QUANTIDADE)
            {
                for ( i = 1; i <= QUANTIDADE; i++)
                {
                    system("cls");
                    printf(".:: NOVO CADASTRO ::.\n\n");
                    printf("Código de registro 00%d\n",Agenda[i].codigo = i);
                    printf("Nome: ");
                    scanf("%30[^\n]s",&Agenda[i].nome);
                    fflush(stdin);
                    printf("Telefone: ");
                    scanf("%15[^\n]s",&Agenda[i].telefone);
                    fflush(stdin);
                    printf("Email: ");
                    scanf("%50[^\n]s",&Agenda[i].email);
                    fflush(stdin);
                }
            }
            else
            {
                system("cls");
                printf("Agenda lotada!\n\n");
                system("pause");
            }
        }
        else if (opcoes == 2)
        {
            if (Agenda[QUANTIDADE].codigo >= QUANTIDADE)
            {
                system("cls");
                printf(".:: CADASTROS REGISTRADOS ::.\n\n");
                for ( i = 1; i <= QUANTIDADE; i++)
                {
                    printf("Código 00%d\n",Agenda[i].codigo);
                    printf("Nome: %s\n",Agenda[i].nome);
                    printf("Telefone: %s\n",Agenda[i].telefone);
                    printf("Email: %s\n\n",Agenda[i].email);
                }
                system("pause");
            }
            else
            {
                system("cls");
                printf("Agenda vazia!\n\n");
                system("pause");
            }
        }
    }
    return 0;
}


