/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author Enio
 */
public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CreatorTapioca fabrica = new CreatorTapiocaBahia();
        TapiocaSalgada tapioca = fabrica.factoryMethod("Presunto");
        TapiocaDoce tap = fabrica.factoryMethod2("Banana");
        tap.exibirinformacao();
        tapioca.exibirinformacao();
    }
    
}
