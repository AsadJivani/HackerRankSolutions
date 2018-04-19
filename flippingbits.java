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
public class flippingbits {
    
    static long flippingBits(long N) { int[] bits=new int[32];
            for(int i=0; i<32; i++){

               if(N%2==1)
                   bits[i]=0;
                else
                    bits[i]=1;

                N=N/2;
            }
            long signed=0;

            int j=32;                          
            for(int i=0; i<32; i++){
                
                signed+=Math.pow(2,i)*bits[i];

            } // Complete this function
                                      
         return signed;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            long N = in.nextLong();
            long result = flippingBits(N);
            System.out.println(result);
        }
        in.close();
    }
}
