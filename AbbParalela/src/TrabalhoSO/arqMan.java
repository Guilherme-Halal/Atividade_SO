/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoSO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author MathM
 */
public class arqMan {
    
    public arqMan (){
    }
    
    public void guardaVetor(int vetor[]){
        //Função responsável por escrever o vetor no arquivo de texto.
        
        
        //Nessa linha, preciso que entre em sua pasta ArquivosTXT onde quer que ela esteja em seu PC e copie o diretório dela e cole substituindo este diretório que está aqui.
        Path caminho = Paths.get("V:\\Faculdade\\Sistemas Operacionas\\GitClone\\Atividade_SO\\ArquivosTXT\\vetor.txt");
        String string = "";
        
            for(int i = 0 ; i < vetor.length ; i++){
                    
                
                string = string + vetor[i] + " ";
                
            }
            
         byte[] stringByte = string.getBytes();
            
         try {
             
            Files.write(caminho, stringByte);
            
         } catch (IOException err){
             
             System.out.println(err);
             
         }
    
    }
    
    public int[] carregaVetor(){
        //Função responsável por carregar o vetor do arquivo de texto.
    
       
        String texto = "";
        
        //Nessa linha, preciso que entre em sua pasta ArquivosTXT onde quer que ela esteja em seu PC e copie o diretório dela e cole substituindo este diretório que está aqui.
        Path caminho = Paths.get("V:\\Faculdade\\Sistemas Operacionas\\GitClone\\Atividade_SO\\ArquivosTXT\\vetor.txt");

            try {
                
                byte[] stringByte = Files.readAllBytes(caminho);
                texto = new String(stringByte);
                
            } catch (IOException err){
            
                System.out.println(err);
            
            }

            String[] textoSplited = texto.split(" ");
             int []vetor = new int[textoSplited.length];
            
            for(int i = 0 ; i < textoSplited.length ; i++){
                
                vetor[i] = Integer.parseInt(textoSplited[i]);
            
            }
            
        
    return vetor;
    }
    
}
