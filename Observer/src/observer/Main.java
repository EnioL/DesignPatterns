/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Enio
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Observer observer1 = new Observer();
        Observer observer2 = new Observer();
        Observer observer3 = new Observer();
        
        Subject subject = new Subject();
        
        subject.adicionarObserver(observer1);
        subject.adicionarObserver(observer2);
        subject.adicionarObserver(observer3);
        
        
        subject.setAtributo1("Mudei");
        subject.notificar();
    }
    
}
