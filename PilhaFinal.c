#include <stdio.h>
#include <stdlib.h>
#define MAX 20

typedef struct Nopilha{
   int num;
   struct Nopilha *prox;
   struct Nopilha *topo;
}no;

int tam;
no *aux;
int nu;
void pilha_cheia(no *pilha)
{
	if(tam == MAX)
	{
		printf("\n\nPILHA CHEIA\n\n");
		system("cls");
	}	
}


void inicializar_pilha(no *pilha){
   pilha->prox = NULL;
   tam = 0;
}
void inicializar_pilha_2(no *pilha){
   pilha->prox = NULL;
}

int pilha_vazia(no *pilha){
   if(pilha->prox == NULL) return 1;
   else return 0;
}

no *add(){
   no *new = (no*) malloc(sizeof(no));
   if(!new) printf("\nsem memoria\n\n");
   else{
       printf("\nnovo numero: "); scanf("%d", &new->num);
   }
   return new;
}

void empilha(no *pilha){
   no *new = add();
   new->prox = NULL;
   no *topo = pilha->prox;
   if(pilha_vazia(pilha)){
      pilha->prox = new;
      tam++;
   }else if(tam == MAX)
   {
	pilha_cheia(pilha);
   }else{
     aux = pilha->prox;
      while(aux->prox != NULL){
         aux = aux->prox;
      }
   aux->prox = new;
   tam++;
   }
}

no *desempilha(no *pilha){
   if(pilha_vazia(pilha)){
      printf("\n\nno vazio\n\n");
      return NULL;
   }else{
      no *ult = pilha->prox;
      no *penultimo = pilha;
      
      while(ult->prox != NULL){
         penultimo = ult;
         ult = ult->prox;
      }
   penultimo->prox = NULL;
   tam--;   
   return ult;
   }
}

void imprimir_pilha(no *pilha){
   if(pilha_vazia(pilha)){
      printf("\n\npilha vazia\n\n");
   }else{
      aux = pilha->prox;
      printf("\n");
      while(aux != NULL){
         printf("%d ", aux->num);
         aux = aux->prox;
      }
      printf("\nTamanho: %d\n\n", tam);
   }
}

void liberar_pilha(no *pilha){
   if(pilha_vazia(pilha)){
      printf("\n\npilha vazia\n\n");
   }else{
      no *no = pilha->prox, 
         *proxNo;
      
      while(no != NULL){
         proxNo = no->prox;
         free(no);
         no = proxNo;
      } printf("\npilha liberada\n\n");
   }
}
int elimina(no *pilha, int n)
{  
   no*y = pilha;
   no*x = NULL;
   while(y != NULL){
      if(y->num == n){
         if(y->prox == NULL)
            x->prox = NULL;
         else
            x->prox = y->prox;
         free(y);
         tam--;
         return 1; // eliminado;
      }
      x = y;
      y = y->prox;

   }
   return 0;

}
//gambiarra
int ler_topo(no *pilha){
	no *topo;
	printf("Topo: %d", topo->num);
}

void par_impar(int tseq){
    int vetor[tseq];
    int i;
    no *par;
    no *impar;
    inicializar_pilha_2(par);
    inicializar_pilha_2(impar);
    for(i = 0; i < tseq;i++){
        scanf("%d",&vetor[i]);
    }

}


int main(){
   no *pilha = (no*) malloc(sizeof(no));
   int tamanhoSequencia;
   if(!pilha) printf("\nno memory\n");
   else inicializar_pilha(pilha);

      int op;
      do{
      printf("0 -> sair\n");
      printf("1 -> empilhar\n");
      printf("2 -> desempilhar\n");
      printf("3 -> mostrar pilha\n");
      printf("4 -> mostrar topo**não funciona**\n");
      printf("5 -> liberar pilha\n");
      printf("6 -> elimina\n");
      printf("7 -> pares e impares***não funciona**\n");
      printf("op: "); scanf("%d", &op);
      
      switch(op){
         case 1:
            empilha(pilha);
            break;
         case 2: 
            aux = desempilha(pilha);
             if(aux != NULL){
             printf("\nelement removed: %d\n\n", aux->num);
             free(aux);
             } break;      
            
         case 3:
            imprimir_pilha(pilha);
            break;
         case 4:
         	ler_topo(pilha);
         	break;
         case 5:
            liberar_pilha(pilha);
            inicializar_pilha(pilha);
            break;
         case 6:
            printf("digite o numero que deseja eliminar:");
            scanf("%d", &nu);
            elimina(pilha,nu);
            break;
        case 7:
            printf("Digite o tamanho da sequencia:");
            scanf("%d", &tamanhoSequencia);
            break;

         default:
            if(op != 0) printf("precisa de uma opcao valida\n\n");
            
         }
      }while(op != 0);
}