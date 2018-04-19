/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author asadj
 */
public class WinningHandsOfCard {

   static int winningHands(int m, int x, int[] a) {
        int count=0;
        Arrays.sort(a); 
        int min=a[0];
        int max=1;
        for (int i = 0; i < a.length; i++) {
           max*=a[i];
       }
         min=min+(x-min%m); 
             
         if(max%m!=x)
             max=max-((m-x)-max%m);
        
       for (int i = min; i <=max; i+=m) {
       
           for (int j = 0; j < a.length; j++) {
          String answer="";
               if(i<a[j])
                   break;
               
               
               if(i==a[j] && i%a[j]==0){
                   count++;
                   System.out.println(a[j]);
                   }
              if(i>a[j] && i%a[j]==0){
                        
                 int ans=i/a[j];
                 answer+=""+a[j];
                 
                if(j<a.length-1) 
                    for (int k = j+1; k < a.length; k++) {
                       while(ans>=a[k]){ 
                        
                         if(ans==a[k]){
                             answer+=""+a[k];
                             System.out.println(answer);
                             count++;
                             break;
                         }
                         else if(ans>=a[k] && ans%a[k]==0){
                             
                             
                             ans=ans/a[k];
                             answer+=""+a[k];
                             
                             
                         }
                       }
                     }
                 
                 
                 
               
               
               
               
               
               
               
               
               
               }
               
           }
           
       }
       
       
        return count;
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int x = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = winningHands(m, x, a);
        System.out.println(result);
        in.close();
    }
}
