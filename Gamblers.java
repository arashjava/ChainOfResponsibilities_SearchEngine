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
public class Gamblers extends Base{
        String[] str= {"Allan is a looser", 
                "Eli hates gambling", 
                "Rose says I gamble for fun!"};

    @Override
    protected void search(String word) {
        for (String s: str){
            if (s.toLowerCase().contains(word.toLowerCase()))
            {
                System.out.println(s+"..... in Gamblers");
            }
        }
    }

    
}
