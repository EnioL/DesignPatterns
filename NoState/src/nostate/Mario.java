/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nostate;

/**
 *
 * @author Enio
 */
public class Mario {
    protected int estado;
    
    public Mario(){
        System.out.println("Mario Pequeno");
        estado = 0;
    }    
    
    public void pegarCogumelo(){
        
        if(estado==4)
            System.out.println("Fim de Jogo");
        else if (estado==0){
            System.out.println("Mario Grande");
        }
        else
            System.out.println("Mario ganhou 1000 pontos");
        
        estado = 1;
    }
    
    public void pegarFlor(){        
        
        if(estado==4)
            System.out.println("Fim de Jogo");
        else if (estado==2){
            System.out.println("Mario ganhou 1000 pontos");            
        }
        else
            System.out.println("Mario Grande com Fogo");
        estado=2;
    }
    
    public void pegarPena(){
        
        if(estado==4)
            System.out.println("Fim de Jogo");
        else if (estado==3){
            System.out.println("Mario ganhou 1000 pontos");            
        }
        else
            System.out.println("Mario Grande com Fogo");
            estado=3;
    }
    public void levarDano(){
        if(estado==0){                    
            System.out.println("Mario morto");
            estado=4;
        }
        else if (estado==1){
            System.out.println("Mario Pequeno");
            estado=0;
        }
        else{            
            System.out.println("Mario Grande");
            estado=1;
        }    
    }
}
