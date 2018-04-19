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
public class q1 {
      
    
    
    
    
      static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
     
         int larry_score=0;
         int sam_score=0;
         
          for (int i = 0; i < apples.length; i++) {
              
          int totaldistance=a+apples[i];
          if(totaldistance>=s && totaldistance<=t){
          larry_score++;
          }
          
          
          
          
          }
          
          for (int i = 0; i < oranges.length; i++) {
          int totaldistance=b+oranges[i];
          if(totaldistance>=s && totaldistance<=t){
          sam_score++;
          }
          
          
             
          
          
          
          
          }
          
          
           System.out.println(larry_score);
          System.out.println(sam_score);
          
          
    }
      
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
    
         Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
      
    }
    
    
    
}
