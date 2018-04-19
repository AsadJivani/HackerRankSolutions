/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practive;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author asadj
 */
public class samandsubstrings {

    

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
//        int[] s = Arrays.stream(sc.next().split("")).mapToInt(Integer::parseInt).toArray();
//        long sum=0;
//        int length = s.length;
//        long ones = 1;
//        long mod=1000000007;
//        for(int i=0;i<length;i++){
//            sum = (sum + s[length-i-1]*(length-i)*ones ) % mod;
//            ones = (ones*10 +1) % mod;
//        }
//         System.out.println(sum);
         long mod=1000000007;
         String n=sc.next();
         long sum=0;
         long[] sumi =new long[n.length()];
         sumi[0]=Integer.parseInt(String.valueOf(n.charAt(0)));
         sum=sumi[0];
         for(int i=1; i<n.length(); i++){
         
             sumi[i]=(Integer.parseInt(String.valueOf(n.charAt(i)))*(i+1))+10*sumi[i-1];
             sumi[i]=sumi[i]%mod;
             sum=(sum+sumi[i])%mod;
             
         }
                 System.out.println(sum%mod);
    }
   //answerathttps://www.hackerrank.com/challenges/sam-and-substrings/editorial
}
