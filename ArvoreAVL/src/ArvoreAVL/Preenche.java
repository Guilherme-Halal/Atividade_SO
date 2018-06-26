package ArvoreAVL;
import java.util.Random;


public class Preenche{
	private Random rd;
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
	
public preencheABB(){
	Nodo abb = criarArvore(rd.nextInt(2*(this.tamanho)));
	
	for (int i=this.tamanho; i>1; i--){
		inserir(abb, rd.nextInt(2*(this.tamanho)));
	}
	return abb;
}

}