/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Enio
 */
public class Observer implements ObserverInterface {
    
    @Override
    public void atualizar(){
        System.out.println("Fui atualizado");    
    }
    
}
