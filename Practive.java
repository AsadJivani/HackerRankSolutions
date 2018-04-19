/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practive;



import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author asadj
 */
public class Practive {

     public static void quickSortInDescendingOrder (int[] numbers, int low, int high)
    {
 
        int i=low;
        int j=high;
        int temp;
        int middle=numbers[(low+high)/2];
 
        while (i<j)
        {
            while (numbers[i]>middle)
            {
                i++;
            }
            while (numbers[j]<middle)
            {
                j--;
            }
            if (j>=i)
            {
                temp=numbers[i];
                numbers[i]=numbers[j];
                numbers[j]=temp;
                i++;
                j--;
            }
        }
 
 
        if (low<j)
        {
            quickSortInDescendingOrder(numbers, low, j);
        }
        if (i<high)
        {
            quickSortInDescendingOrder(numbers, i, high);
        }
    }

   
   
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int rank;
        int[] result=new int[alice.length];
        int[] level=new int[scores.length+1];
        System.arraycopy(scores, 0, level, 0, scores.length);
        int temp;
        
        for (int k = 0; k < alice.length; k++) {
        
            rank=0;
            level[scores.length]=alice[k];
             quickSortInDescendingOrder(level,0,level.length-1);

    
                for (int i = 0; i < level.length; i++) {
                
                    if(i==0){
                     rank++;
                        if (level[i]==alice[k]) {
                            result[k]=rank;
                            break;
                        }
                     
                    }
                    
                    else{
                       
                        if (level[i-1]!=level[i]) {
                            rank++;
                        }
                          if (level[i]==alice[k]) {
                            result[k]=rank;
                            break;
                        }
                        
                    
                    }
                    
                }
       
         
       
        
      }      
        
   
        
        return result;
       
    }
    
  
    static int[] climbingLeaderboard1(int[] scores, int[] alice) {
        int rank = 0;
        int[] result=new int[alice.length];
        int[] Rank = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {

            if (i == 0) {
                rank++;
                
            
        }else {

                if (scores[i - 1] != scores[i]) {
                    rank++;
                }
              
            }
            
            Rank[i]=rank;

    }
        
        
        
        
        
        
        for (int i = 0; i < alice.length; i++) {
      
        int low = 0; 
        int high = scores.length - 1; 
        int middle=0;
        boolean found=false;
        while (high >= low) { 
            middle = (low + high) / 2; 
            if (scores[middle] == alice[i]) 
            { 
                found=true;
                break; 
            }
            else if (scores[middle] < alice[i]) 
            { 
                high = middle - 1; 
                
            
            } else if (scores[middle] > alice[i]) 
        
            { 
                low = middle + 1; 
                
            
            } 
        }
        
        
        if(found){
            result[i]=Rank[middle];
        }
        else{
           if(high==-1){
          result[i]=1;  
           }else    
            result[i]=Rank[high]+1;    
          
           }
        
        


        }

return result;
    }
        
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
      
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i = 0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i = 0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        int[] result = climbingLeaderboard1(scores, alice);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
    
}
