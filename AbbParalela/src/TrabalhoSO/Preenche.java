package TrabalhoSO;
import java.util.Random;


public class Preenche{
	private Random rd;
        private Manipulador preen = new Manipulador();
	private int tamanho;
	private int tipo;
	
	public Preenche (int tamanho, int tipo){
		this.tamanho=tamanho;
		this.tipo=tipo;
		rd= new Random();
	}
	
public Nodo preenche(){
	if(this.tipo==1)
		return preencheABB();
	else
		return preencheAVL();
}
	
public Nodo preencheABB(){
	Nodo abb = preen.criarArvore(rd.nextInt(2*(this.tamanho)));
	
	for (int i=this.tamanho; i>1; i--){
                int temp =rd.nextInt(2*(this.tamanho));
                System.out.println(temp);
		preen.inserirBin(abb, temp /*rd.nextInt(2*(this.tamanho))*/); //comentado para teste retirar linha acima e descomentar na versão final
	}
	return abb;
}//fim preencheABB

public Nodo preencheAVL(){
	Nodo avl = preen.criarArvore(rd.nextInt(2*(this.tamanho)));
	
	for (int i=this.tamanho; i>1; i--){
                int temp =rd.nextInt(2*(this.tamanho));
                System.out.println(temp);
		preen.inserirAvl(avl, temp /*rd.nextInt(2*(this.tamanho))*/); //comentado para teste retirar linha acima e descomentar na versão final
	}
	return avl;
}//fim preencheAVL


}//fim classe
