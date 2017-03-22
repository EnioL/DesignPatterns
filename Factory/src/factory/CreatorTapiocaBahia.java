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
public class CreatorTapiocaBahia implements CreatorTapioca {

    @Override
    public TapiocaSalgada factoryMethod(String tipo){
        switch (tipo) {
            case "Presunto":
                return new TapiocaPresunto();
            case "Carne":
                return new TapiocaCarne();
            default:
                return null;
        }
    }
    
  
    @Override
    public TapiocaDoce factoryMethod2(String tipo){
        switch (tipo) {
            case "Sorvete":
                return new TapiocaSorvete();
            case "Banana":
                return new TapiocaBanana();
            default:
                return null;
        }
    }
}
