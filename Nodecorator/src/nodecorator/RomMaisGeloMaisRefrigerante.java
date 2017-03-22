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
public class RomMaisGeloMaisRefrigerante extends Coquetel {
    
    public RomMaisGeloMaisRefrigerante(){
        nome="Rom + Refrigerante + Gelo";
        Coquetel umCoquetel = new Rom();
        Coquetel umCoquetel2 =  new Refrigerante();
        Coquetel umCoquetel3 = new Gelo();
    
    
        preco = umCoquetel.preco + umCoquetel2.preco + umCoquetel3.preco;
    }
    
}
