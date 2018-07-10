package ArvoreAVL;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Manipulador {

	private Nodo prox;

	public Nodo criarArvore(int key){

		Nodo novo = new Nodo(key);

		return novo;

	}

	public Nodo iniciaArvore(){

		return null;

	}

	//Arvore Binaria
	public void inserirBin(Nodo raiz, int key){	

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

			} else if ((raiz.getKey()) > key){
				//Vai para esquerda

					if((raiz.getEsq()) == null){

						this.novo = new Nodo(key);

							novo.setAnt(raiz);

								raiz.setEsq(this.novo);

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
	
	//Arvore AVL
	public Nodo inserirAvl(Nodo raiz, int key){	

		if(raiz == null){

			Nodo novo = new Nodo(key);
			novo.setPeso(0);

				return novo;
		}else if(raiz.getKey() != key){//checa se o elemento já existe.

			if(raiz.getKey() > key){//Irá para a esquerda, pois a chave é menor.

				raiz.setPeso(raiz.getPeso() + 1);//Aumenta em 1 o peso atual do nó em questão.

					raiz.setEsq(inserirAvl(raiz.getEsq(),key));

						if(raiz.getPeso() > 1){
							//Balanceamento necessário
								if(raiz.getEsq().getPeso() > 0){
									//Significa que é positiva, então vamos fazer uma rotação simples a Direita.
										return direitaSimples(raiz);

								} else if(raiz.getEsq().getPeso() < 0){
									//Significa que é negativa, então vamos fazer uma rotação dupla a direita.
										raiz.setEsq(esquerdaSimples(raiz.getEsq()));

											return direitaSimples(raiz);

								}


						}
			return raiz;
			}

			if(raiz.getKey() < key){

					raiz.setPeso(raiz.getPeso() + 1);

						raiz.setDir(inserirAvl(raiz.getDir(), key));

							if(raiz.getPeso() < -1){
								//Precisa de algum balanceamento

									if(raiz.getDir().getpeso < 0){
										 //Significa que é negativo, portanto vamos fazer uma rotação simples a esquerda.

										return esquerdaSimples(raiz);

									} else if(raiz.getDir().getPeso() > 0){
										//significa que é positiva, portanto temos que fazer uma rotação dupla a esquerda.
											raiz.setDir(direitaSimples(raiz.getDir()));

												return esquerdaSimples(raiz);
									}

							}


			}

		return raiz;

		} else {

			System.out.println("Elemento já existe na arvore");

		}


	return raiz;
	}

	private Nodo esquerdaSimples(Nodo noDes){//Passando como parametro o nó desbalanceado

		System.out.println("Um giro simples à esquerda foi realizado.");

			Nodo aux = noDes.getDir();
				
				noDes.setDir(aux.getEsq());
				aux.setEsq(noDes);
				noDes.setPeso(0);
				aux.setPeso(0);

		return aux;
	}

	private Nodo direitaSimples(Nodo noDes){//Passando como parametro o nó desbalanceado

		System.out.println("Um giro simples para a direita realizado.");

			Nodo aux = noDes.getEsq();

				noDes.setEsq(aux.getDir());
				aux.setDir(noDes);
				noDes.setPeso(0);
				aux.setPeso(0);
			
		return aux;

	}


}
