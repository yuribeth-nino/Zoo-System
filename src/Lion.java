/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author yuri1
 */
public abstract class Lion extends Animals implements Mammal {
  
    public String name;
    
    public Lion(String name ){
        //super();
        this.name=name;
    }
       
    @Override
  public void canSwim(){
      
  }  
}
