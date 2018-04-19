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
public class MigratoryBirds {
        static int migratoryBirds(int n, int[] ar) {
       int[] count=new int[5];
        
       for(int i=1; i<6; i++){
          for(int j=0; j<n; j++) {
           if(ar[j]==i)
               count[i-1]++;
          }
       }
        
        int max=count[0];
        int index=0;
        for(int i=0; i<5; i++){
           if(max<count[i]){
              max=count[i]; 
              index=i;
           }
        }
        
       return  index+1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
