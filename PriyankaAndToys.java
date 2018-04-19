/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/** 
 *
 * @author asadj
 */
public class PriyankaAndToys {
  
   

    static int toys(ArrayList<Integer> result){
         Collections.sort(result);
        int counter=0;
        while(result.size()>0){
            
            int search=result.get(0);
            int range=search+4;
            result.remove(0);
            for(int i=0; i<result.size(); i++){
                
                if(result.get(i)>=search && result.get(i)<=range){
                    result.remove(i);
                    i=-1;
                }
                
            }
            
            counter++;
            
           
        }
        
        
        
        return counter;
        
        
    }
   

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       ArrayList<Integer> w=new ArrayList<>();
        for(int w_i = 0; w_i < n; w_i++){
            w.add(in.nextInt());
        }
        int result = toys(w);
        System.out.println(result);
        in.close();
    }
}
