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
public class LisaWorkBook {
      static int workbook(int n, int k, int[] arr) {
     
        int pageno=1;
        int count=0;
        
        for(int i=1; i<=n; i++){
           
            for(int j=1; j<=arr[i-1]; j++){
                if(j==pageno)
                    count++;
                
                 if(j!=arr[i-1]&&j%k==0)
                    pageno++;
                
            }
            
            pageno++;
            
            
            
        }
        return count;
        
        
        
        
        
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = workbook(n, k, arr);
        System.out.println(result);
        in.close();
    }
}
