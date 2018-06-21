package ArvoreAVL;

import java.util.Scanner;

public class UserView {
  Scanner input = new Scanner (System.in);
  private int op1, opTam, tamArvore;

  do{
			System.out("cls");
			System.out.printf("========= ESCOLHA UMA OPÇÃO DE ARVORE =========\n");
			System.out.printf("==== [1] Arvore Binaria de Busca:\n");
      System.out.printf("==== [2] ArvoreAVL:\n");
      op = input.nextInt();

        switch(op1){
          case 1:
              System.out.printf("========= ESCOLHA A QUANTIDADE INICIAL DE ELEMENTOS =========\n");
              System.out.printf("==== [1] 500K:\n");
              System.out.printf("==== [2] 1M:\n");
              System.out.printf("==== [3] 10M:\n");
              System.out.printf("==== [4] 50M:\n");
              System.out.printf("==== [5] 100M:\n");
              switch(opTam){
                case 1:
                tamArvore = 500000; //500K
                break;
                case 2:
                tamArvore = 1000000; //1M
                break;
                case 3:
                tamArvore = 10000000; //10M
                break;
                case 4:
                tamArvore = 50000000; //50M
                break;
                case 5:
                tamArvore = 100000000; //100M
                break;

            case 2:
                System.out.printf("========= ESCOLHA A QUANTIDADE INICIAL DE ELEMENTOS =========\n");
                System.out.printf("==== [1] 500K:\n");
                System.out.printf("==== [2] 1M:\n");
                System.out.printf("==== [3] 10M:\n");
                System.out.printf("==== [4] 50M:\n");
                System.out.printf("==== [5] 100M:\n");
                switch(opTam){
                  case 1:
                  tamArvore = 500000; //500K
                  break;
                  case 2:
                  tamArvore = 1000000; //1M
                  break;
                  case 3:
                  tamArvore = 10000000; //10M
                  break;
                  case 4:
                  tamArvore = 50000000; //50M
                  break;
                  case 5:
                  tamArvore = 100000000; //100M
                  break;


          case 2:
          break;

          default:
          break;
        }
      }
    }

			System.out.printf("==== [3] Imprimir Elementos:\n");//ok
			System.out.printf("==== [4] Mostrar menor valor da árvore:\n");//ok
			System.out.printf("==== [5] Mostrar maior valor da árvore:\n");//ok
			System.out.printf("==== [6] Mostrar altura da árvore:\n");//ok
			System.out.printf("==== [0] Sair do programa:\n");//ok
			System.out.printf(" Opção: ");

			system("cls");
    }
      while(op!=0);
    }


}
