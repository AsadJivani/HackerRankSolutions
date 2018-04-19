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
public class beautifuldaysatthemovies {
    static int beautifulDays(int i, int j, int k) {
       int count=0;
       int reversed=0;
       int divisor;
       int save=i;
       while(i<=j){
          save=i;
          reversed=0;
           while(save!=0){
                  reversed=reversed*10;                 
                  divisor=(save%10);
                  reversed+=divisor;
                  save=save/10; 
           }
           
          
           if(Math.abs(i-reversed)%k==0)
               count++;
           
        
           
        i++;   
       } 
       return count; 
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}
