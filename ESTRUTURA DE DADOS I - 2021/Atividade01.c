typedef struct NO{
    int dado;
    NO* prox;
}NO;

typedef struct FILA{
    NO* inicio;
    NO* fim;
} FILA;

FILA *f;

void enfileira(int valor){
    NO* ptr = (NO *) malloc(sizeof(NO));
    ptr->dado = valor;
    ptr->prox = NULL;
    if(f->inicio == NULL)
        f->inicio = ptr;
    else
        f->fim->prox = ptr;
    f->fim = ptr;
}

int desenfileira(){
    NO* ptr = f->inicio;
    int dado;
    if(ptr != NULL){
        f->inicio = ptr->prox;
        ptr->prox = NULL;
        dado = ptr->dado;
        free(ptr);
        return dado;
    }
}

int main(){
    f = (FILA *) malloc(sizeof(FILA));
    f->inicio = NULL;
    f->fim = NULL;
    enfileira(10);
    enfileira(30);
    enfileira(50);
    desenfileira();
    enfileira(14);
}
