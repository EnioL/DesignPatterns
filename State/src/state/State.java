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
public class State {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mario mario = new Mario();
        mario.pegarFlor();
        mario.levarDano();
        mario.pegarCogumelo();
        mario.levarDano();
        mario.levarDano();
        mario.pegarCogumelo();
    }
    
}
