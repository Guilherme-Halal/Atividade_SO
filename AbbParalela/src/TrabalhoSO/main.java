package TrabalhoSO;

public class main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserView teste = new UserView();
                Manipulador teste2 = new Manipulador();
                Nodo Abb = teste2.iniciaArvore();
		
		teste.defineTipoArvore();
		teste.defineTamanhoArvore();
		System.out.println(teste.defineTeste());
                Preenche teste3 = new Preenche(teste.getTamArvore(),teste.getTipoArvore());                
                Abb = teste3.preenche();
                
		

	}
}
