/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Enio
 */
public class MarioMorto implements MarioState {
    
    @Override
    public MarioState pegarCogumelo(){    
        System.out.println("Fim de Jogo");
        return this;
    }
    
    @Override
    public MarioState pegarFlor(){
        System.out.println("Fim de Jogo");
        return this;
    }
    
    @Override
    public MarioState pegarPena(){
        System.out.println("Fim de Jogo");
        return this;
    }
    
    @Override
    public MarioState levarDano(){
        System.out.println("Fim de Jogo");
        return this;
    }
}
