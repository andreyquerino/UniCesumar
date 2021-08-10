// UNICESUMAR - FOZ DO IGUA�U - PR
// MAPA - ADS - ESTRUTURA DE DADOS I - 52/2021
// Autor : Andrey Cardoso Querino
// R.A : 1971669-5

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define QUANTIDADE 5 // Quantidade de armazenamento

typedef struct {
    int RA;           // RA do aluno
    int matricula;    // Matr�culacula do professor respons�vel pela corre��o
    char nome[20];    // Nome do arquivo
    char extensao[5]; // Extens�o do arquivo
} Atividade;

Atividade fila[QUANTIDADE];
int opcoes, tamanho;

// Inserir Elemento Na lista
void inserirAtividade(){
    int continuar;
    do {
        system("cls");
        printf(".:: Inserir Nova Atividade ::.\n\n");
        if (tamanho < QUANTIDADE){
            printf("RA do aluno: ");
            scanf("%d",&fila[tamanho].RA);
            fflush(stdin);
            printf("Nome do arquivo: ");
            scanf("%20[^\n]s",&fila[tamanho].nome);
            fflush(stdin);
            printf("Extensão do arquivo: ");
            scanf("%5[^\n]s",&fila[tamanho].extensao);
            fflush(stdin);
            printf("Matr�culacula do professor respons�vel pela corre��o: ");
            scanf("%d",&fila[tamanho].matricula);
            fflush(stdin);
            tamanho++;
            printf("\nAtividade inserida com sucesso!\n\n");
        }
        else {
            printf("\n\nFila Cheia!\n\n");
            system("pause");
        }
        printf("\nDeseja Continuar Inserindo [1]SIM / [0]N�O)? ");
        scanf("%d",&continuar);
        if (continuar > 1){
            printf("\nOp��o Inv�lida!\n");
            system("pause");
        }
    }while (continuar == 1);
}

// Remove um elemento da fila
void RemoverUmaAtividade(){
    int i;
    if (tamanho != 0){
        ListarAtividades();
           fila[i] = fila[i + 1];
            tamanho--;
        printf("\n\nRemovido uma das atividade com sucesso!\n\n");
        system("pause");
    }
    else {
            system("cls");       
            printf("\n\nFila Vazia!\n");
            system("pause");
    }
}

// Esvazia toda a fila
void EsvaziarFila(){
    int i;
    if (QUANTIDADE == 0){
        system("cls");
        printf("A fila j� est� vazia!");
        system("pause");
    }
    else {
        for (i = 0; i <= QUANTIDADE; i++){
            tamanho--;
        }
    }
}

// Mostra toda a fila
void ListarAtividades(){
    int i;
    system("cls");
    printf(".:: Lista de Atividades ::.\n\n");
    if ( tamanho != 0){
        for (i = 0; i < tamanho; i++){
            printf("RA do aluno: %d\n",fila[i].RA);
            printf("Nome do arquivo: %s\n",fila[i].nome);
            printf("Extens�o do arquivo: %s\n",fila[i].extensao);
            printf("Matr�culacula do professor respons�vel pela corre��o: %d\n\n",fila[i].matricula);     
        }
    }
    else{
        printf("\nNenhuma Atividade na Fila!\n\n");
    }
}

int main(){
    setlocale(LC_ALL, "Portuguese");
    tamanho = 0;
    do {
        ListarAtividades();
        printf(".:: MENU DE ATIVIDADES DOS ALUNOS ::.\n");
        printf("[1] Inserir uma atividade na fila\n");
        printf("[2] Remover uma atividade da fila\n");
        printf("[3] Esvaziar a fila\n");
        printf("[0] Encerrar o programa\n");
        printf("Escolha uma op��o: ");
        scanf("%d", &opcoes);
        switch(opcoes){
            case 1: inserirAtividade(); break;
            case 2: RemoverUmaAtividade(); break;
            case 3: EsvaziarFila(); break;
            case 0: break;
            default: printf("\nOp��o Inv�lida!");
            system("pause");
        }
    } while (opcoes != 0);
}
