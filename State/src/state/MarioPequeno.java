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
public class MarioPequeno implements MarioState {
    
    @Override
    public MarioState pegarCogumelo(){
        System.out.println("Mario Grande");
        return new MarioGrande();
    }
    @Override
    public MarioState pegarFlor(){
        System.out.println("Mario grande com fogo");
        return new MarioFogo();
    }
    
    @Override
    public MarioState pegarPena(){
        System.out.println("Mario grande com capa");
        return new MarioCapa();
    }
    
    @Override
    public MarioState levarDano(){
        System.out.println("Mario morto");
        return new MarioMorto();
    }
}
