package TrabalhoSO;
import java.util.Random;

public class main {
	

	public static void main(String[] args) {
            
            
                                 Manipulador manipulador = new Manipulador();
                                 Random ran = new Random();
                                 arqMan arqMan = new arqMan();
                                 UserView view = new UserView();
                                 Preenche preenche = new Preenche();
                                 
                                 view.defineProposta();
                                 
                                 if(view.getProposta() == 2){//Selecionou a proposta 2.
                                 
                                     Nodo[] vetorAVL = new Nodo[5];
                                     
                                     view.defineQuantidadeElementos();
                                     
                                     vetorAVL = preenche.preencheVetorAVL(vetorAVL, view.getTamArvore());
                                 
                                 }
                                 
                               /* for(int i = 0 ; i < 100000 ; i++){
                                    
                                     avl = manipulador.inserirAvl(avl, ran.nextInt((i+1000)*3) );
                                     
                                    
                                }
                                
                                System.out.println("Código executado com êxito.");*/
                                
		// TODO Auto-generated method stub
		/*UserView teste = new UserView();
                Manipulador teste2 = new Manipulador();
                Nodo Abb = teste2.iniciaArvore();
		
		teste.defineTipoArvore();
		teste.defineTamanhoArvore();
		System.out.println(teste.defineTeste());
                Preenche teste3 = new Preenche(teste.getTamArvore(),teste.getTipoArvore());                
                Abb = teste3.preenche();*/
                
                
		

	}
}
