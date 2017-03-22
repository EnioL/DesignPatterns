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
public class VodkaMaisRefrigerante extends Coquetel {
    
    public VodkaMaisRefrigerante(){
        nome="Vodka + Refrigerante";
        Coquetel umCoquetel = new Vodka();
        Coquetel umCoquetel2 =  new Refrigerante();
    
    
    
        preco = umCoquetel.preco + umCoquetel2.preco;
    }
    
}
