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
public abstract class CoquetelDecorator  extends Coquetel{
    Coquetel coquetel;
    
    public CoquetelDecorator(Coquetel umCoquetel){
        coquetel = umCoquetel;
    }
    
    @Override   
    public String getNome(){
        return coquetel.getNome() + "+" + nome;
    }
    
    @Override
    public double getPreco(){
        return coquetel.getPreco() + preco;
    }
}   
    
