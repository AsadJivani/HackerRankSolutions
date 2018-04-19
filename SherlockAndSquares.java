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
public class SherlockAndSquares {
       static int squares(int a, int b) {
      int count=0;
     for(int i=a; i<=b; i++)
         if(Math.sqrt(i)%1==0){
             count++;
             i=i+2*(int) (Math.sqrt(i));
         }
     return count;   
   }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int result = squares(a, b);
            System.out.println(result);
        }
        in.close();
    }
}
