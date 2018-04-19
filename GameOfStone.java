/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practive;

import java.util.Scanner;

/**
 *
 * @author asadj
 */



public class GameOfStone {
 
static boolean turn;    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] n=new int[t];
        for(int a0 = 0; a0 < t; a0++){
            n[a0]=in.nextInt();
        }
         for(int a0 = 0; a0 < t; a0++){
            int no=n[a0];
            String result;
            result=gameOfStones(no);
            
            System.out.println(result);
        }
        in.close();
    } 
    
    
 
    
    static String gameOfStones(int gems) {
   
        if(gems%7>=2)
            return "First";
        else 
            return "Second";
        
    
    
    }
}