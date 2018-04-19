/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practive;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asadj
 */
public class LonelyInteger {
 
    static int lonelyinteger(ArrayList<Integer> a) {
       
       
        
        
            
            for(int i=0; i<a.size(); i++){
                int search=a.get(i);
                for(int j=i+1; j<a.size(); j++){
                    
                    if(search==a.get(j)){
                        a.remove(i);
                        
                        a.remove(j-1);
                      
                        
                        
                        i=-1;
                        break;
                        
                    }
                    
                }
                
                
                
            }
            
            
            
        
        return a.get(0);
     
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int a_i = 0; a_i < n; a_i++){
            a.add(in.nextInt());
        }
        int result = lonelyinteger(a);
        System.out.println(result);
    }   
}
