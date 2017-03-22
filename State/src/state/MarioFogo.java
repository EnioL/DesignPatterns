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
public class MarioFogo implements MarioState {
    
    @Override
    public MarioState pegarCogumelo(){    
        System.out.println("Mario ganhou 1000 pontos");
        return this;
    }
    
    @Override
    public MarioState pegarFlor(){
        System.out.println("Mario ganhou 100 pontos");
        return this;
    }
    
    @Override
    public MarioState pegarPena(){
        System.out.println("Mario ganhou 1000 pontos");
        return new MarioCapa();
    }
    
    @Override
    public MarioState levarDano(){
        System.out.println("Mario grande");
        return new MarioGrande();
    }
    
}
