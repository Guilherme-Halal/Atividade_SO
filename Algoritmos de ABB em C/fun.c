// Prova 2
// 05/05/2017
// Guilherme Afonso Halal (guilhermehalal@gmail.com) - Tiago Machado Jardim (tiago.machado.jardim@hotmail.com)


#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>
#include "fun.h"


A *cria(){
	return NULL;
}
////////////////////////////// fucoes de balanciamento ////////////////////////////////////////////////////////////////////

A *rotacaoDireita(A *a){
	A *aux=a->esq;
	a->esq=aux->dir;
	aux->dir=a;
	a->altura= 1+max(retornaAltura(a->esq),retornaAltura(a->dir));
	aux->altura= 1+max(retornaAltura(aux->esq), retornaAltura(aux->dir));
	return aux;
}

A *rotacaoEsquerda(A *a){
	A *aux=a->dir;
	a->dir=aux->esq;
	aux->esq=a;
	a->altura= 1+max(retornaAltura(a->esq),retornaAltura(a->dir));
	aux->altura= 1+max(retornaAltura(aux->esq), retornaAltura(aux->dir));
	return aux;
}

A *rotacaoEsquerdaDireita (A *a){
	a->esq=rotacaoEsquerda(a->esq);
	a=rotacaoDireita(a);
	return a;
	
}

A *rotacaoDireitaEsquerda (A *a){
	a->dir=rotacaoDireita(a->dir);
	a=rotacaoEsquerda(a);
	return a;
	
}

////////////////////////////  retorna o maior elemento da arvore ////////////////////////////////////////////////////////////////////

int *maiorArvore(A *a){
	A *aux=a;
	//int temp;
	while(aux->dir!=NULL)
		aux=aux->dir;
		//temp = (int*)aux->info;
	return (int*)aux->info;
}


///////////////////////////// retorna o menor elemento da arvore ////////////////////////////////////////////////////////////////////

int *menorArvore(A *a){
	A *aux=a;
	while(aux->esq!=NULL)
		aux=aux->esq;
	return (int*)aux->info;
}

//////////////////////////// retorna a altura ////////////////////////////////////////////////////////////////////

int retornaAltura(A *a){
	if(a==NULL){
		return -1;
	}
	else{
		return a->altura;
	}
}

///////////////////////////////  testa a e b e retorna o maior////////////////////////////////////////////////////////////////////

int max(int a, int b){
	
	if (a>b)
		return a;
	else
		return b;
}

/////////////////////////////// função de impressao em tela dos 3 modos ////////////////////////////////////////////////////////////////////

void imprimeavl_preordem(A *a){
	A *aux=a;
	
	printf("<");
	if(a!=NULL){
	printf("%d",aux->info);
	imprimeavl_preordem(aux->esq);
	imprimeavl_preordem(aux->dir);	
	}
		printf(">");
		
	}
void imprimeavl_simetrico(A *a){
		
		
	printf("<");
	if(a!=NULL){
	imprimeavl_preordem(a->esq);
	printf("%d", a->info);
	imprimeavl_preordem(a->dir);
}
	printf(">");
	
}
void imprimeavl_posordem(A *a){
	
	printf("<");
	if(a!=NULL){
	imprimeavl_preordem(a->esq);
	imprimeavl_preordem(a->dir);
	printf("%d",a->info);
}
	printf(">");
	
}

////////////////////////////// função de liberação de memoria final ////////////////////////////////////////////////////////////////////

void liberaFinal(A *a){
	A *aux=a;
	if(a!=NULL){
	liberaFinal(aux->esq);
	liberaFinal(aux->dir);
	free(aux);
	}
		
	}
////////////////////////////// função de impressao em FILE dos 3 modos ////////////////////////////////////////////////////////////////////

void imprimeavl_preordem_FILE(A *a, FILE *arq){
	A *aux=a;
	printf("<");
	if(a!=NULL){
	fprintf(arq,"<%d>",aux->info);
	imprimeavl_preordem_FILE(aux->esq, arq);
	imprimeavl_preordem_FILE(aux->dir, arq);	
	}
		printf(">");
		
	}
void imprimeavl_simetrico_FILE(A *a, FILE *arq){
		
		
	printf("<");
	if(a!=NULL){
	imprimeavl_preordem_FILE(a->esq, arq);
	fprintf(arq,"<%d>",a->info);
	imprimeavl_preordem_FILE(a->dir, arq);
}
	printf(">");
	
}
void imprimeavl_posordem_FILE(A *a, FILE *arq){
	
	printf("<");
	if(a!=NULL){
	imprimeavl_preordem_FILE(a->esq, arq);
	imprimeavl_preordem_FILE(a->dir, arq);
	fprintf(arq,"<%d>",a->info);
}
	printf(">");
	
}
/////////////////////////// função de tratamento do TAD genérico ////////////////////////////////////////////////////////////////////
 
A* percorre(A *a, void *n, int tipo, int(*callback)(A*, void*)){//falta implementar a exclusão no meio da arvore com o devido balanceamento da mesma...
		
		int	parada=callback(a, n);	
		A* aux = a;
		A* aux2=NULL;								        	//tipos: 0: insercao 1: exclusao
	
		if(parada==99){
		
			if (tipo==0){//tipo 0 = inserção
			a=ins(a, n);
			return a;			// erro aqui aparece que o elemento nao foi encontrado e quando digita um valor errado nao retorna a arvore para o programa principal
				}else {
				printf("\nElemento não encontrado\n\n");
				system("pause");
				return a;
			}
			
		}
		else if(parada==0){       // quando achar o valor para excluir entra nessa condição 
		
			if (tipo==0){ //tipo 0 = inserção
			printf("\nElemento já existe na arvore\n");
			system("pause");
			return a;
			}
			else if(tipo==1){ //tipo 1 = exclusão
				
				return a=ex(a,n);
						
		    }
		    
			}
		else if(parada==-1){      
			if (tipo==0){//tipo 0 = inserção
				a->esq=percorre(a->esq, n, 0, callback);
				return balanceamento(a);	
		    }
		    else if(tipo==1){//tipo 1 = exclusao
			
			a->esq=percorre(a->esq, n, 1, callback);
			return balanceamento(a);
			}
		}
		else if(parada==1){
			if (tipo==0){//tipo 0 = inserção
				a->dir=percorre(a->dir, n, 0, callback);
				return balanceamento(a);
			}
														// alteração feita na exclusão: percorre a arvore para a direita e retorna para a função principal 
		    else if(tipo==1){//tipo 1 = exclusao
			
			a->dir=percorre(a->dir, n, 1, callback);
			return balanceamento(a);
			}		
		}
				
}

A * ins(A *a,void *n ){
	a=(A*)malloc(sizeof(A));
			a->info=n;
			a->dir=NULL;
			a->esq=NULL;
			a->altura=0;
	return a;
}

A * ex(A *a,void *n ){
	A *aux=a, *aux2;
	if(a->esq==NULL && a->dir==NULL && a->altura==0){ 	// teste para ver se o Valor é a raiz, para retornar a arvore = NULL
					free(a);
					printf("\nElemento %d encontrado\nExclusão realizada com sucesso\n\n", n);
					system("pause");
					return NULL;
				}
				else if(a->esq==NULL&&a->dir==NULL){	//se for uma folha  							
					
					
					free(aux);
					printf("\nElemento %d encontrado\nExclusão realizada com sucesso\n\n", n);
					system("pause");
					return a;
				}
				
				
				
				else if (a->dir!=NULL && a->esq==NULL){//se tiver somente um filho a direita
					
					a=a->dir;
					
					free(aux);
					printf("\nElemento %d encontrado\nExclusão realizada com sucesso\n\n", n);
					system("pause");
					
					return a;
				}
				else if (a->dir==NULL && a->esq!=NULL){//se tiver somente um filho a esquerda
					
					a=a->esq;
					
					free(aux);
					printf("\nElemento %d encontrado\nExclusão realizada com sucesso\n\n", n);
					system("pause");	
				
					return a;
				}
				else{ //possui dois filhos
				aux2=a->esq;
				while (aux2->dir!=NULL){
				aux2=aux2->dir;
				}
				aux->info=aux2->info;
				aux2->info=a->info;
				
				free(aux2);
				return aux;
				}
	
	
	
	
}

A* balanceamento(A *a){
    if(retornaAltura(a->esq) - retornaAltura(a->dir) == 2){
        if(retornaAltura(a->esq->esq) - retornaAltura(a->esq->dir) == 1)
            a = rotacaoDireita(a);
        else
            a = rotacaoEsquerdaDireita(a);
    }else{
        if(retornaAltura(a->esq) - retornaAltura(a->dir) == -2){
            if(retornaAltura(a->dir->esq) - retornaAltura(a->dir->dir) == -1)
                a = rotacaoEsquerda(a);
            else
                a = rotacaoDireitaEsquerda(a);
        }
    }
    a->altura = 1 + max(retornaAltura(a->esq), retornaAltura(a->dir));
    return a;
}
