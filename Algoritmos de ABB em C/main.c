// Prova 2
// 05/05/2017
// Guilherme Afonso Halal (guilhermehalal@gmail.com) - Tiago Machado Jardim (tiago.machado.jardim@hotmail.com)

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>
#include "fun.h"



static int compara(A *a,void *n);

int main(){
	setlocale (LC_ALL, "Portuguese");
	int flag=0;
	int *ele=NULL;
	int op=99,op2=99;
	A *arvore;
	FILE *arq;
	
		do{
			system("cls");
			printf("========= ESCOLHA UMA OPÇÃO =========\n");
			printf("==== [1] Inserir Elemento:\n");//ok
			printf("==== [2] Excluir Elemento:\n");//??
			printf("==== [3] Imprimir Elementos:\n");//ok
			printf("==== [4] Mostrar menor valor da árvore:\n");//ok
			printf("==== [5] Mostrar maior valor da árvore:\n");//ok
			printf("==== [6] Mostrar altura da árvore:\n");//ok
			printf("==== [0] Sair do programa:\n");//ok
			printf(" Opção: ");
			scanf("%d",&op);
			system("cls");
			
			switch(op){
				
				case 1:
						if (flag==0){
							arvore=arvore=cria();
							printf("Digite um elemento para inserir:\n");
							scanf("%d",&ele);
							arvore=percorre(arvore, ele, 0, compara);
							
						}else{
							printf("Digite um elemento para inserir:\n");
							scanf("%d",&ele);
							arvore=percorre(arvore, ele, 0, compara);
						}
					flag++;
					break;
				case 2:
					system("cls");
					if(arvore==NULL || flag==0){
						
						printf("========= Arvore vazia!========= \n\n");
						system("pause");
					}
					else{
						printf("Digite um elemento para excluir:\n");
							scanf("%d",&ele);
							arvore=percorre(arvore, ele, 1, compara);
					}
					break;
				case 3:
					system("cls");
					if(arvore==NULL || flag==0){
						
						printf("========= Arvore vazia!========= \n\n");
						system("pause");
					}
					else{
					do{
			printf("========= ESCOLHA UMA OPÇÃO DE IMPRESSÃO =========\n");
			printf("==== [1] Imprimir os três percursos:\n");
			printf("==== [2] Imprimir em arquivo texto os três percursos:\n");
			printf("==== [0] Retornar ao menu anterior:\n");
			printf(" Opção: ");
			scanf("%d",&op2);
						switch(op2){
							case 1:
								printf("\n########## Impressão Pré-ordem ##########\n");
								imprimeavl_preordem(arvore);
								printf("\n########## Impressão Simétrica ##########\n");
								imprimeavl_simetrico(arvore);
								printf("\n########## Impressão Pós-ordem ##########\n");
								imprimeavl_posordem(arvore);
								printf("\n");
							break;
								
							case 2:
								arq=fopen("arvore.txt","w");
								fprintf(arq,"\n########## Impressão Pré-ordem ##########\n");
								imprimeavl_preordem_FILE(arvore, arq);
								fprintf(arq, "\n########## Impressão Simétrica ##########\n");
								imprimeavl_simetrico_FILE(arvore, arq);
								fprintf(arq, "\n########## Impressão Pós-ordem ##########\n");
								imprimeavl_posordem_FILE(arvore, arq);
								printf("\n");
								fclose(arq);
							break;
							
								break;
							case 0:
							
								break;
							default:
								system("cls");
								printf("\n========= Opção inválida tente novamente =========\n");
								break;
							
						}
						
					}while(op2!=0);
				}
					break;
				case 4:
					system("cls");
					if(arvore==NULL || flag==0){	
						printf("========= Arvore vazia!========= \n\n");
						system("pause");
					}
					else{
						printf("O menor elemento da arvore é: %d\n\n", menorArvore(arvore));
						system("pause");
					}
					break;
				case 5:
					system("cls");
					if(arvore==NULL || flag==0){	
						printf("========= Arvore vazia!========= \n\n");
						system("pause");
					}
					else{
						printf("O maior elemento da arvore é: %d\n\n", maiorArvore(arvore));
						system("pause");
					}
					break;
				case 6:
					if(arvore==NULL || flag==0){
						printf("========= Arvore vazia!========= \n\n");
					}
					else{
					
					printf("\nA altura da arvore é %d\n", retornaAltura(arvore));
					}
					system("pause");				
					break;
				case 0:
					if(flag!=0){
						liberaFinal(arvore);
						printf("\n========= Obrigado por utilizar o programa =========\n");
					}
					else							
						printf("\n========= Obrigado por utilizar o programa =========\n");	
					break;
				default:
					system("cls");
					printf("\n========= Opção inválida tente novamente =========\n");
					system("pause");
					break;	
			}
			
			
		}while(op!=0);
			
system("pause");	
}

static int compara(A *a,void *n){ //compara n com o nó atual e se for igual retorna 0, se menor retorna -1 e se maior retorna 1
	if (a==NULL)
		return 99;
	else{
		if(n==a->info)
			return 0; 
		if(n<a->info)
			return -1;
		else
			return 1;
	}
}
