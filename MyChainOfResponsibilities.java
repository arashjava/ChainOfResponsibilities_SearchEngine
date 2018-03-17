/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mychainofresponsibilities;

import java.util.Scanner;

/**
 *
 * @author arash
 */
public class MyChainOfResponsibilities {
      private static Base getOurChain(){

      Base gamblers = new Gamblers();
      Base runners = new Runners();
      Base houseHunters = new HouseHunters();
      Base jobSeekers = new JobSeekers();

      gamblers.setNextOne(runners);
      runners.setNextOne(houseHunters);
      houseHunters.setNextOne(jobSeekers);


      return gamblers;	
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Base base = getOurChain();

      System.out.println("Please enter a word to search in our activities:");
      Scanner sc=new Scanner(System.in);
      String s= sc.nextLine();
      base.findWord(s);

    }
    
}
