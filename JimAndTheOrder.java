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
public class JimAndTheOrder {
     static void jimOrders(int[][] orders) {
    
        
        
       
      
        
        for (int i = 0; i < orders.length; i++)
        {
            
            int min_idx = i;
            for (int j = i+1; j < orders.length; j++)
                if (orders[j][0] < orders[min_idx][0])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            
        
            int temp = orders[min_idx][1];
            orders[min_idx][1] = orders[i][1];
            orders[i][1] = temp;
            
            temp = orders[min_idx][0];
            orders[min_idx][0] = orders[i][0];
            orders[i][0] = temp;
        }
        
        
       for(int i=0; i<orders.length; i++)
           System.out.print(orders[i][1]+" ");
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] orders = new int[n][2];
        for(int orders_i = 0; orders_i < n; orders_i++){
          
                orders[orders_i][0] = in.nextInt()+in.nextInt();
                orders[orders_i][1]=orders_i+1;
        }
       jimOrders(orders);
       

        in.close();
    }
}
