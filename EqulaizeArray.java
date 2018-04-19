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
public class EqulaizeArray {
     static int equalizeArray(int[] arr) {
        ArrayList<Integer> count=new ArrayList<>();
        Arrays.sort(arr);
        int counter=1;
        int n=arr.length;
        for(int i=0; i<n-1; i++){
          if(i!=n-2){ 
            if(arr[i]==arr[i+1]){
                counter++;
            }else{
                count.add(counter);
                count.add(arr[i]);
                counter=1;
            }
          }else{
              if(arr[i]==arr[i+1])
                counter++;
                
               count.add(counter);
                count.add(arr[i]);
              
              
          
          }
              
            
        }
        
        int max=count.get(0);
        int index=0;
        for(int i=0; i<count.size(); i+=2){
            if(max<count.get(i)){
                max=count.get(i);
                index=i;
                
            }
        }
        
        int deletes=0;
         for(int i=0; i<n; i++){
            if(arr[i]!=count.get(index+1))
                deletes++;
        }
                 
        return deletes;
        
    
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = equalizeArray(arr);
        System.out.println(result);
        in.close();
    }  
}
