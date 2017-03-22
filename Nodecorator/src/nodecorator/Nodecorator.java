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
public class Nodecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coquetel meuCoquetel = new Cachaca();
        System.out.println(meuCoquetel.getNome()+ "=" + meuCoquetel.getPreco());
        Coquetel meuCoquetel2 = new CachacaMaisRefrigerante();
        System.out.println(meuCoquetel2.getNome()+ "=" + meuCoquetel2.getPreco());
        Coquetel meuCoquetel3 = new RomMaisGeloMaisRefrigerante();
        System.out.println(meuCoquetel3.getNome()+ "=" + meuCoquetel3.getPreco());
        Coquetel meuCoquetel4 = new VodkaMaisRefrigerante();
        System.out.println(meuCoquetel4.getNome()+ "=" + meuCoquetel4.getPreco());
        Coquetel meuCoquetel5 = new VodkaMaisRefrigeranteMaisGelo();
        Coquetel meuCoquetel6 = new RomMaisGelo();
    }
    
}
