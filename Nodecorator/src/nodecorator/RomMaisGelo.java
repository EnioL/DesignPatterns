/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodecorator;

/**
 *
 * @author Enio
 */
public class RomMaisGelo extends Coquetel {
    
    public RomMaisGelo(){
        nome="Rom + Gelo";
        Coquetel umCoquetel = new Rom();        
        Coquetel umCoquetel3 = new Gelo();
    
    
        preco = umCoquetel.preco + umCoquetel3.preco;
    }
    
}
