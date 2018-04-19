/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practive;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author asadj
 */
public class FibonacciModified {
    
    static BigInteger fibonacciModified(BigInteger t1, BigInteger t2, int n) {
       BigInteger temp=new BigInteger("0");
       for(int i=0; i<n-2; i++){
           temp=t2;
          
           t2=new BigInteger(String.valueOf(t1.add(t2.multiply(t2))));
           t1=temp;
          
       }
       return  t2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger t1 = new BigInteger(in.next());
        BigInteger t2 = new BigInteger(in.next());
        int n = in.nextInt();
        BigInteger result = fibonacciModified(t1, t2, n);
        System.out.println(result);
        in.close();
    }
}
