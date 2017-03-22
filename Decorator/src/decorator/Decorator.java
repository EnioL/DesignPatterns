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
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coquetel meuCoquetel = new Cachaca();
        System.out.println(meuCoquetel.getNome()+ "=" + meuCoquetel.getPreco());
        meuCoquetel = new Refrigerante(meuCoquetel);
        System.out.println(meuCoquetel.getNome()+ "=" + meuCoquetel.getPreco());
        
                
        Coquetel meuCoquetel3 = new Rom();
        meuCoquetel3 = new Gelo(meuCoquetel3);
        meuCoquetel3 = new Acucar(meuCoquetel3);
        System.out.println(meuCoquetel3.getNome()+ "=" + meuCoquetel3.getPreco());
        
        Coquetel meuCoquetel2 = new Vodka();
        meuCoquetel2 = new Refrigerante(meuCoquetel2);
        System.out.println(meuCoquetel2.getNome()+ "=" + meuCoquetel2.getPreco());
    }
    
}
