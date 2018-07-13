package TrabalhoSO;
import java.util.Random;

public class main {
	

	public static void main(String[] args) {
            
            
                                Manipulador manipulador = new Manipulador();
                                
                                 Nodo avl = manipulador.iniciaArvore();
                                 Random ran = new Random();
                                
                                
                                for(int i = 0 ; i < 100000 ; i++){
                                    
                                     avl = manipulador.inserirAvl(avl, ran.nextInt((i+1000)*3) );
                                     
                                    
                                }
                                
                                System.out.println("Código executado com êxito.");
                                
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
