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
public class Memoria {
    public void load (int position, String info){
        System.out.println("Memory Load");        
    } 
    public void free(int position, String info){
        System.out.println("Memory Free");
    }
}
