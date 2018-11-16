/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsefile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author Chenxiao Zhi
 */
public class Parsefile {
    public class Parse{
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(new BufferedReader(new FileReader("/Users/nines/NetBeansProjects/parsefile/src/parsefile/shortwords.txt")));
        HashMap<String, Integer> shortwords = new HashMap<>();
        while(s.hasNext()){
            shortwords.put(s.next(),1);
        }
        Scanner a = new Scanner(new BufferedReader(new FileReader("/Users/nines/NetBeansProjects/parsefile/src/parsefile/Frankenstein.txt")));
        String artical = "";
        while(a.hasNextLine()){
            artical += a.nextLine();
        }
        String[] words = artical.split(" ");
        HashMap<String, Integer> parse = new HashMap<>();
        for(int i = 0;i < words.length;i++){
            if(shortwords.containsKey(words[i])){
                if(parse.containsKey(words[i-1])){
                    parse.put(words[i-1],parse.get(words[i-1])+1);
                }
                else{
                    parse.put(words[i-1],1);
                }
                if(parse.containsKey(words[i+1])){
                    parse.put(words[i+1],parse.get(words[i+1])+1);
                }
                else{
                    parse.put(words[i+1],1);
                }
            }
        }
        System.out.println(parse.keySet());
        for(String key1:parse.keySet()){
            if(parse.get(key1)>=50){
                System.out.println(key1+">==>"+parse.get(key1));
            }
        }
        /*for (String w : words){
            System.out.println(w);
        }*/
    }
}
