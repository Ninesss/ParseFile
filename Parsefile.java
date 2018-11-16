/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsefile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author nines
 */
public class Parsefile {
    public class Parse{
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(new BufferedReader(new FileReader("/Users/nines/NetBeansProjects/parsefile/src/parsefile/Frankenstein.txt")));
        String art = "";
        while(s.hasNextLine()){
            art += s.nextLine();
        }
        String[] words = art.split(" ");
        HashMap<String, integer> short = 
        for (int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
        /*for (String w : words){
            System.out.println(w);
        }*/
    }
    
}
