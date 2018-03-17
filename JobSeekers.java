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
public class JobSeekers extends Base{
            String[] str= {"Ali looks for a job", 
                "Elias has changed his job five times last year.", 
                "Rose Loves her job."};

    @Override
    protected void search(String word) {
        for (String s: str){
            if (s.toLowerCase().contains(word.toLowerCase()))
            {
                System.out.println(s+"..... in JobSeekers");
            }
        }
    }
}
