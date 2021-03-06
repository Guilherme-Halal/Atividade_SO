package TrabalhoSO;

import java.util.Scanner;

public class UserView{
  Scanner input = new Scanner (System.in);
  private int tipoArvore; 
  private int tamArvore;
  private int proposta;
  
	
	public UserView(){		
	}
	
	
//seta o tipo de árvore para teste
	
public void defineTipoArvore(){
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
		this.tipoArvore=aux;
	
	}
	
//seta o tamanho inicial da árvore para teste
	
public void defineQuantidadeElementos(){
		int	opTam;
		
		do{
			System.out.printf("========= ESCOLHA A QUANTIDADE INICIAL DE ELEMENTOS =========\n");
			System.out.printf("==== [1] 500K\n");
			System.out.printf("==== [2] 1M\n");
			System.out.printf("==== [3] 10M\n");
			System.out.printf("==== [4] 50M\n");
			System.out.printf("==== [5] 100M\n");
                                                          System.out.printf("==== [6] 100\n");
			opTam=input.nextInt();
			 if((opTam!=1)&&(opTam!=2)&&(opTam!=3)&&(opTam!=4)&&(opTam!=5)&&(opTam!=6)){
		  		System.out.printf	("==== DIGITE UMA OPÇÃO VÁLIDA\n");
			 }
			}while((opTam!=1)&&(opTam!=2)&&(opTam!=3)&&(opTam!=4)&&(opTam!=5)&&(opTam!=6));
			
			switch(opTam){
                case 1:
                this.tamArvore = 500000; //500K
                break;
                case 2:
                this.tamArvore = 1000000; //1M
                break;
                case 3:
                this.tamArvore = 10000000; //10M
                break;
                case 4:
                this.tamArvore = 50000000; //50M
                break;
                case 5:
                this.tamArvore = 100000000; //100M
                break;
                case 6:
                this.tamArvore = 100;//100
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

public void defineProposta(){
    
        System.out.println("Selecione uma das seguintes propostas: ");
        System.out.println("2 - Proposta 2.");
        System.out.println("3 - Proposta 3.");
        this.proposta = input.nextInt();
    }
    public int getTipoArvore() {
        return tipoArvore;
    }

    public int getTamArvore() {
        return tamArvore;
    }
    
    public int getProposta(){
        return this.proposta;
    }

}