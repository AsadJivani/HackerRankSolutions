/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practive;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author asadj
 */
public class CoinChange {
    
    static long makeChange(int[] coins,int money){
    return makeChange(coins, money, 0,new HashMap<String,Long>());
    
    }
    
    static long makeChange(int[] coins,int money, int index,HashMap<String,Long> memo){
        if (money==0) {
            return 1;
        }
        
        
        
        if (index>=coins.length) {
            return 0;
        }
        
        String key=money+"-"+index;
        
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int amountWithCoin=0;
        long ways=0;
        while(amountWithCoin<=money){
           int remaining=money-amountWithCoin;
           ways+=makeChange(coins, remaining, index+1,memo);
           amountWithCoin+=coins[index];
        
        }
        
        memo.put(key, ways);
        
        return ways;
                
            
     
        
        
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] c = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        long ways =makeChange(c, n);
        System.out.println(ways);
    }    
}
