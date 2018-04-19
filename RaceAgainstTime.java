/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practive;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Scanner;

/**
 *
 * @author asadj
 */
public class RaceAgainstTime {
    static long raceAgainstTime(int[] heights, int[] prices) {

        
        int sourceindex=0;
        int destinationindex=1;
        int currentcarrier=heights[sourceindex];
        int price=Math.abs(currentcarrier-heights[destinationindex])+prices[destinationindex]+(destinationindex-sourceindex);
        int i=0;
        ArrayList<Integer> amount=new ArrayList<>();
        long totalexpense=0;
        
        while(i<heights.length){
           // System.out.println(currentcarrier);
            sourceindex=i;
            currentcarrier=heights[i];
            destinationindex=i+1;
           while(destinationindex<heights.length && currentcarrier>heights[destinationindex] ){
             
               price=Math.abs(currentcarrier-heights[destinationindex])+prices[destinationindex]+(destinationindex-sourceindex);
               int cc=currentcarrier;
               int k=destinationindex;
               if(destinationindex+1<heights.length && heights[destinationindex]<=heights[destinationindex+1] ){
                        
                       cc=heights[k];
                        while(k+1<heights.length && cc<=heights[k+1]){
                             price+=Math.abs(cc-heights[k+1])+prices[k+1]+1;
                             cc=heights[k+1];
                             k++;
                        }
               
               
               
               }
              
               amount.add(price);
               amount.add(k);
               destinationindex++;
               
               
          }
           
           
           if(destinationindex==heights.length){
                amount.add(destinationindex-sourceindex);     
                amount.add(destinationindex);
           }
           
           if(destinationindex!=heights.length  &&currentcarrier<=heights[destinationindex]){
               price=Math.abs(currentcarrier-heights[destinationindex])+prices[destinationindex]+(destinationindex-sourceindex);
               amount.add(price);
               amount.add(destinationindex);
           }
           int temp=amount.get(0);
           int minIndex=0;
            for (int j = 0; j < amount.size()-2; j+=2) {
                
                if(temp>=amount.get(j+2)){
                    temp=amount.get(j+2);
                    minIndex=j+2;
                            
                }
                    
                
            }
       
           totalexpense+=amount.get(minIndex);
           i=amount.get(minIndex+1);
           amount.clear();
                  
                   
            
        
        }
      
        return totalexpense;
        
        
    }
    
 
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mason_height = in.nextInt();
        int[] heights = new int[n];
        heights[0]=mason_height;
        for(int heights_i = 1; heights_i < n; heights_i++){
            heights[heights_i] = in.nextInt();
        }
        int[] prices = new int[n];
        prices[0]=0;
        for(int prices_i = 1; prices_i < n; prices_i++){
            prices[prices_i] = in.nextInt();
        }
        long result = raceAgainstTime( heights, prices);
        System.out.println(result);
        in.close();
    }
}
