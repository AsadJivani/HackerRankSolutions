/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practive;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author asadj
 */
public class ElectronicsShop {
      static long getMoneySpent(long[] keyboards, long[] drives, long s){
        long[] total=new long[(keyboards.length*drives.length)+1];
        total[0]=s;
        int index=0;
        for(int i=0; i<keyboards.length; i++){
           long keyboard=keyboards[i];
           for(int j=0; j<drives.length; j++){
               index++;
               total[index]=keyboard+drives[j];
               
           }
        
        }
        Arrays.sort(total);
        int in=-1; 
        for (int i = 0; i < total.length; i++) {
              if(total[i]==s)
                 in=i;
        }
       
        if(in==-1)
            return in;
        else 
            return total[in-1];
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        long[] keyboards = new long[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextLong();
        }
        long[] drives = new long[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextLong();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        long moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
