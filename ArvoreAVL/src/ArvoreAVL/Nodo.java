package ArvoreAVL;

public class Nodo {
	
	private Nodo esq;
	private Nodo dir;
	private Nodo ant;
	
	private int key;
	
	//Métodos construtores
	Nodo(int key){
		
		this.key = key;
		this.ant = null;
		this.esq = null;
		this.dir = null;
		
	}
	
	Nodo(int key, Nodo esq, Nodo dir){
		
		this.key = key;
		this.dir = dir;
		this.esq = esq;
		this.ant = null;
		
		
	}
	
	Nodo(int key, Nodo esq, Nodo dir, Nodo ant){
		
		this.key = key;
		this.esq = esq;
		this.dir = dir;
		this.ant = ant;
		
	}
	
	Nodo(int key, Nodo esq){
		
		this.key = key;
		this.esq = esq;
		this.dir = null;
		this.ant = null;
		
	}
	
	//Setters
	void setEsq(Nodo esq){
		this.esq = esq;
	}
	
	void setDir(Nodo dir){
		this.dir = dir;
	}
	
	void setAnt(Nodo ant){
		this.ant = ant;
	}
	
	void setKey(int key){
		this.key = key;
	}
	
	//Getters
	Nodo getDir(){
		return this.dir;
	}
	
	Nodo getEsq(){
		return this.esq;
	}
	
	Nodo getAnt(){
		return this.ant;
	}
	
	int getKey(){
		return this.key;
	}
}
