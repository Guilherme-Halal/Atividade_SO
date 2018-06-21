package ArvoreAVL;

public class Manipulador {

	private Nodo prox;
	private Nodo novo;

	public Nodo criarArvore(int key){

		Nodo novo = new Nodo(key);

		return novo;

	}

	public void inserir(Nodo raiz, int key){	

			if((raiz.getKey()) < key){
				//Vai para direita

					if((raiz.getDir()) == null){//Verifica se poderá inserir na direita ou se terá que percorrer para a próxima.

						this.novo = new Nodo(key);

							novo.setAnt(raiz);

								raiz.setDir(this.novo);

									return;

					} else {

						this.inserir(raiz.getDir(),key);

							return;
					}

			} if ((raiz.getKey()) > key){
				//Vai para esquerda

					if((raiz.getEsq()) == null){

						this.novo = new Nodo(key);

							novo.setAnt(raiz);

								return;

					} else {

						this.inserir(raiz.getEsq(), key);

							return;

					}

			} else {
				//Numero igual... Pensar em algum tratamento.
				return;
			}

	}


}
