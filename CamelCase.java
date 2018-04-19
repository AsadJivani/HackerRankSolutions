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
public class CamelCase {
   
    static int camelcase(String s) {
       int count=1;
       char[] letters=s.toCharArray();
        for(int i=0; i<letters.length; i++){
            int asc1=(int) letters[i];
            
            if((asc1>=65) && (asc1<=90))
                count++;
            
        }
        return count;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
    
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    } 
}
