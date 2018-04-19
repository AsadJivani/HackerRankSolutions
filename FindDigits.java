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
public class FindDigits {
       static int findDigits(int n) {
       int counter=0;
       int divisor; 
       int dividend=n;
        
       while(n!=0){
           divisor=n%10;
           n=n/10;
           
           if(divisor != 0 && dividend%divisor==0){
               counter++;
               
           }
               
           
           
           
       }
        
        return counter;
        
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = findDigits(n);
            System.out.println(result);
        }
        in.close();
    }
}
