/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Enio
 */
public class Subject{

    /**
     * @param args the command line arguments
     */
    List <Observer> observer = new ArrayList<Observer>();   
    
    private String atributo1;
    private String atributo2;

    
    
    public void adicionarObserver(Observer observer){
        this.observer.add(observer);
    }
    
    
    public void removerObserver(Observer observer){
        this.observer.remove(observer);
    }
           
    public void notificar(){
        for(int i=0; i<observer.size();i++)
            observer.get(i).atualizar();
    }
    
    
    
    
    public String getAtributo1() {
        return atributo1;
    }
        
    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    public String getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }
    
}
