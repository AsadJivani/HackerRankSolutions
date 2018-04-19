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
public class BirthdayChocalate {
 
    static int solve(int n, int[] s, int d, int m){
        int sum=0;
        int total=0;
      if(n!=1){  
        for(int i=0; i<=n-m; i++){
            sum=0;
            for(int j=i; j<(i+m); j++){
                sum+=s[j];
             
            }
               if(sum==d)
                    total++;
                
            
            
        }
           return total;
      }else{
          
          if(s[0]==d)
              total++;
          return total;
      }
       
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }   
}
