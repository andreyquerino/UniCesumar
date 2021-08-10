// A solução correta seria inverter as duas linhas onde faz a leitura (scanf) dos números pedidos no programa, no caso inverteria as linhas 6 e 8. O código-fonte ficaria assim:

#include <stdio.h>

int main(void){
	int a, b;
	printf("Valor de A: ");
	scanf("%d",&a);
	printf("Valor de B: ");
	scanf("%d",&b);
	if (a > b){
		printf("A > B\n");
	} else if (b > a){
		printf("B > A\n");
	} else {
		printf("A = B\n");
	}
}