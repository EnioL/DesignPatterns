/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noobserver;

import static java.lang.Thread.sleep;

/**
 *
 * @author Enio
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Subject subject = new Subject();
        
        Observer observer1 = new Observer();        
        Observer observer2 = new Observer();
        Observer observer3 = new Observer();
        
        observer1.atu = subject.getAtributo1();
        observer2.atu = subject.getAtributo1();
        observer3.atu = subject.getAtributo1();
        
                       
        subject.setAtributo1("Mudei");
        new Thread(){
            //@Override
            public void run(){
                
                while(true){                    
                    try{
                        if (!observer1.atu.equals(subject.getAtributo1())){
                            observer1.atualizar();
                            observer1.atu=subject.getAtributo1();
                        }                            
                        if (!observer2.atu.equals(subject.getAtributo1())){
                            observer2.atualizar();
                            observer2.atu=subject.getAtributo1();
                        }
                        if (!observer3.atu.equals(subject.getAtributo1())){
                            observer3.atualizar();
                            observer3.atu=subject.getAtributo1();
                        }
                    }catch(Exception e){
                        
                    }
                   
                }
            }
        }.start();
        
        //sleep(2000);
        
        subject.setAtributo1("yuiuyi");
        
        
    }
    
}
