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
public class CachacaMaisRefrigerante extends Coquetel {
    
    public CachacaMaisRefrigerante(){
        nome="Cachaça mais Refrigerante";
        Coquetel umCoquetel = new Cachaca();
        Coquetel umCoquetel2 =  new Refrigerante();
    
    
    
        preco = umCoquetel.preco + umCoquetel2.preco;
    }
    
   
           
    
}
