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
public class ServerRoom {
 
 
   static String checkAll(int n, int[] height, int[] position) {
        boolean left=false;
      boolean right=false; 
      //for left
      int i=0;
      for (i = 0; i < n-1; i++) {
          if(position[i]+height[i]>=position[i+1]){
             if(position[i]+height[i]!=position[i+1]) {
              int total=position[i]+height[i];
              for (int j = i+2; j < n; j++) {
                  
                  if(total<position[j]){
                    i=n-j-1;
                    break;
                      
                  }
                   if(j==n-1)
                      i=n-2;
                      
                  
              }
              
              
          }  
              
          }else
              break;
              
      }
      
      if(i==n-1)
        left=true;
      
      
      
      
      
      
      
      int j=n-1;
      for (j = n-1; j>0; j--) {
          
          if(position[j]-height[j]<=position[j-1]){
              
            int total=position[j]-height[j];
              for (int k =j-2 ; k >=0; k--) {
                  if (total<position[k]) {
                      k=n-k;
                      break;
                  }
                
                  if(k==0)
                      j=1;
              }
              
          }else
              break;
      }
      
      
      
      if (j==0) {
          right=true;
      }
      
      if (right && left) 
          return "BOTH";
      else if(!right && left)
          return "LEFT";
      else if (right && !left) 
          return "RIGHT";
      else
          return "NONE";
    
    }
 

  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] position = new int[n];
        for(int position_i = 0; position_i < n; position_i++){
            position[position_i] = in.nextInt();
        }
        int[] height = new int[n];
        for(int height_i = 0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        String ret = checkAll(n, height, position);
        System.out.println(ret);
        in.close();
    } 
      
}
    