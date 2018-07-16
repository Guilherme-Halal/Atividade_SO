package TrabalhoSO;
import java.util.Random;


public class Preenche{
	private Random rd;
                   private Manipulador preen = new Manipulador();
	private int tamanho;
	private int tipo;
	
        public Preenche(){}
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

public Nodo [] preencheVetorAVL(Nodo [] vetor, int lim){

    int aux;
    ManipuladorThreads thread1 = new ManipuladorThreads("Threads N° 1");
    ManipuladorThreads thread2 = new ManipuladorThreads("Threads N° 2");
    ManipuladorThreads thread3 = new ManipuladorThreads("Threads N° 3");
    ManipuladorThreads thread4 = new ManipuladorThreads("Threads N° 4");
    ManipuladorThreads thread5 = new ManipuladorThreads("Threads N° 5");
    
        for(int i = 0 ; i < lim ; i++){

            aux = i;
            
            if((aux > 0) && (aux < (1*lim)/5)){
                
                System.out.println("1° num: "+ i );
                

            } else if((aux > (1*lim)/5) && (aux < (2*lim)/5)){
                
                System.out.println("2° num: "+ i );
                

            } else if((aux > (2*lim)/5) && (aux < (3*lim)/5)){
                
                System.out.println("3° num: "+ i );
                

            } else if((aux > (3*lim)/5) && (aux < (4*lim)/5)){
                
                System.out.println("4° num: "+ i );
                

            } else if((aux > (4*lim)/5) && aux <= lim){
                
                System.out.println("5° num: "+ i );
                

            }

        }
    return vetor;
}

/*

if((aux > 0) && (aux < (1/5) * lim)){
                
                System.out.println("1° num: "+ i );

            } else if(aux >= (1/5)*lim && aux < (2/5)*lim){
                
                System.out.println("2° num: "+ i );

            } else if(aux >= (2/5)*lim && aux < (3/5)*lim){
                
                System.out.println("3° num: "+ i );

            } else if(aux >= (3/5)*lim && aux < (4/5)*lim){
                
                System.out.println("4° num: "+ i );

            } else if(aux >= (4/5)*lim && aux <= lim){
                
                System.out.println("5° num: "+ i );

            }

*/

}//fim classe
