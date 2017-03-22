/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author Enio
 */
public class HardDrive {
    
    public String read (int Position, int Size){
        System.out.println("Hard Lendo");
        return "hd1";
    }
    public void write (int Position, String info){
        System.out.println("Hard Escrevendo");
    }
}
