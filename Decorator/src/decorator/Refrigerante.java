/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Enio
 */
public class Refrigerante extends CoquetelDecorator {
    
    public Refrigerante(Coquetel umCoquetel){
        super(umCoquetel);
        nome = "Refrigerante";
        preco = 1.0;
    }
}





