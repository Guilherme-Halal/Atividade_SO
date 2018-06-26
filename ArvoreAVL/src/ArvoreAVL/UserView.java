package ArvoreAVL;

import java.util.Scanner;

public class UserView{
  Scanner input = new Scanner (System.in);
  
 	
//seta o tipo de árvore para teste
	
public int defineTipoArvore(){
		int aux;
  do{
			System.out.printf	("========= ESCOLHA UMA OPÇÃO DE ARVORE =========\n");
			System.out.printf	("==== [1] Arvore Binaria de Busca:\n");
      		System.out.printf               ("==== [2] ArvoreAVL:\n");
      		aux = input.nextInt();
	  if((aux!=1)&&(aux!=2)){
		  System.out.printf             ("==== DIGITE UMA OPÇÃO VÁLIDA\n");
	  }
  }while((aux!=1)&&(aux!=2));
		return aux;
	
	}
	
//seta o tamanho inicial da árvore para teste
	
public int defineTamanhoArvore(){
		int	opTam;
		
		do{
			System.out.printf("========= ESCOLHA A QUANTIDADE INICIAL DE ELEMENTOS =========\n");
			System.out.printf("==== [1] 500K\n");
			System.out.printf("==== [2] 1M\n");
			System.out.printf("==== [3] 10M\n");
			System.out.printf("==== [4] 50M\n");
			System.out.printf("==== [5] 100M\n");
			opTam=input.nextInt();
			 if((opTam!=1)&&(opTam!=2)&&(opTam!=3)&&(opTam!=4)&&(opTam!=5)){
		  		System.out.printf	("==== DIGITE UMA OPÇÃO VÁLIDA\n");
			 }
			}while((opTam!=1)&&(opTam!=2)&&(opTam!=3)&&(opTam!=4)&&(opTam!=5));
			
			switch(opTam){
                case 1:
                return = 500000; //500K
                break;
					
                case 2:
                return = 1000000; //1M
                break;
					
                case 3:
                return = 10000000; //10M
                break;
					
                case 4:
                return = 50000000; //50M
                break;
					
                case 5:
                return = 100000000; //100M
                break;
					
				default:
				break;
			}
}
	
public int defineTeste(){
	int opTest;
		
	do{
		System.out.printf("========= ESCOLHA QUAL TESTE PRETENDE REALIZAR =========\n");
		System.out.printf("==== [1] INSERÇÃO SEQUENCIAL\n");
		System.out.printf("==== [2] INSERÇÃO PARALELA\n");
		System.out.printf("==== [3] BUSCA SEQUENCIAL\n");
		System.out.printf("==== [4] BUSCA PARALELA\n");
		opTest=input.nextInt();
		
		if((opTest!=1)&&(opTest!=2)&&(opTest!=3)&&(opTest!=4)){
			System.out.printf("==== DIGITE UMA OPÇÃO VÁLIDA\n");
		}
	}while((opTest!=1)&&(opTest!=2)&&(opTest!=3)&&(opTest!=4));
	
	return opTest;
}
}