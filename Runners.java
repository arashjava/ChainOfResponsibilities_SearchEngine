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
public class Runners extends Base {
    String[] str= {"Allan runs well", 
                "Elizabeth runs slower than the others", 
                "Rose is great in running"};

    @Override
    protected void search(String word) {
        for (String s: str){
            if (s.toLowerCase().contains(word.toLowerCase()))
            {
                System.out.println(s+"..... in Runners");
            }
        }
    }
    
}
