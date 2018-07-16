/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoSO;

/**
 *
 * @author MathM
 */
public class ManipuladorThreads implements Runnable {

    private int key;
    private final String nome;
    public Thread t;
    
    Manipulador man = new Manipulador();
    
    public ManipuladorThreads(String nome){
    
        this.nome = nome;
        this.t = new Thread(this);
    
    }
    
    @Override
    public void run() {
        
        System.out.println(nome + " Numero: " + key);
       
    }
    
    public void setKey(int key){
        this.key = key; 
    }
    
    public int getKey(){
        return this.key;
    }
    
}
