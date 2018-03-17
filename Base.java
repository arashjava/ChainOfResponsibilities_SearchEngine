/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mychainofresponsibilities;

/**
 *
 * @author arash
 */
public abstract class Base {
   protected Base nextOne;
   
   public void setNextOne(Base nextOne){
      this.nextOne = nextOne;
   }
   
   public void findWord(String word){
      search(word);
      if(nextOne !=null){
         nextOne.findWord(word);
      }
   }

   abstract protected void search(String word);
}
