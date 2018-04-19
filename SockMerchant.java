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
public class SockMerchant {
    
    static int sockMerchant(int n, ArrayList<Integer> arrayList) {
        
     
      int pairs=0;
      for(int i=0; i<arrayList.size()-1; i++){
         int color=arrayList.get(i);
           for(int j=i+1; j<arrayList.size(); j++){
                if(color==arrayList.get(j)){
                    pairs++;
                     arrayList.remove(j);
                    arrayList.remove(i);
                   
                   i=-1;
                   break;
                    
                    
                }
               
               
           }
          
          
          
          
          
          
      }
        
        return pairs;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
         ArrayList<Integer> ar = new ArrayList<>();
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar.add(in.nextInt());
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
