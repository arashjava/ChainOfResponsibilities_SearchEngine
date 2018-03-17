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
public class HouseHunters extends Base {
        String[] str= {"Lucy bought a condo this year.", 
                "Eli changed her house last yeat.", 
                "Sara rented a place lat month!"};

    @Override
    protected void search(String word) {
        for (String s: str){
            if (s.toLowerCase().contains(word.toLowerCase()))
            {
                System.out.println(s+"..... in HouseHunters");
            }
        }
  }
    
}
