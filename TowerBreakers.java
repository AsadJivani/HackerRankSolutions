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
public class TowerBreakers {
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] towers=new int[t];
        int[] hieghts=new int[t];
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            towers[a0]=n;
            hieghts[a0]=m;
           
        }
        for (int i = 0; i < t; i++) {
          int result = towerBreakers(towers[i], hieghts[i]);
            System.out.println(result);
     }
        
        in.close();
    } 
 
 
 static int towerBreakers(int nooftowers,int hieght){
 
 
     if(nooftowers%2==0)
         return 2;
     else
         return 1;
     
 }
 
 
}
