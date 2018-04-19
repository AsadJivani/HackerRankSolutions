/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practive;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author asadj
 */
public class GameOfThrones1 {

    static void gameOfThrones(String str){

        //add every character first and if it occurs again remove it.
        //therefore if a character is odd, then it will be present in the set
        //since one charactter is odd or all will be event in the give string therefore it will have a angram which will be odd.
        //to make a palindrome anagram from a string is that one character should be odd in or all of should be even frequcney
            Set<Character> set = new HashSet<Character>();
            for(Character ch : str.toCharArray()){
                if(set.contains(ch)){
                    set.remove(ch);
                }else{
                    set.add(ch);
                }
            }

            System.out.println((set.size()<=1)?"YES":"NO");


 
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
       gameOfThrones(s);
      
    }
    
}
