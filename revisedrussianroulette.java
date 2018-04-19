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
public class revisedrussianroulette {

   
    static int[] revisedRussianRoulette(int[] doors) {
       int min=0;
       int max=0;
        
        
       for(int i=0; i<doors.length; i++){
          if(doors[i]==1){
               max++;
         }
     } 
        
        
         for(int i=0; i<doors.length; i++){
           if(doors[i]==1){
              if(i<doors.length-1){ 
               if(doors[i+1]==1){
                    min++;
                    i=i+1;
               }
               else 
                   min++;
                
                 
             }else
                  min++;
         }
           }
           
           
        
        
        
        int[] answer={min,max};
        
        return answer;
        
        
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] doors = new int[n];
        for(int doors_i = 0; doors_i < n; doors_i++){
            doors[doors_i] = in.nextInt();
        }
        int[] result = revisedRussianRoulette(doors);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }   
}
