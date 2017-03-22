package nofacade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enio
 */
public class Cpu {
    public void start(){
        System.out.println("Iniciando Sistema");
    }
    public void execute(){
        System.out.println("Executando");
    }
    public void load(){
        System.out.println("Carregando");
    }
    public void free(){
        System.out.println("Memória Livre");
    }
}
