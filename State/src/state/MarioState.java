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
public interface MarioState {
    public MarioState pegarCogumelo();
    public MarioState pegarFlor();
    public MarioState pegarPena();
    public MarioState levarDano();
}
