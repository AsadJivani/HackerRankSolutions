/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practive;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asadj
 */
public class HackerRankInAString {
    static String hackerrankInString(String s) {
  char[] name={'h','a','c','k','e','r','r','a','n','k',};
    if(s.length()<10)
            return "NO";
    else{
       boolean found=false; 
       int i=0;
       for(int j=0; j<s.length(); j++ ){
               if(name[i]==s.charAt(j)){
                     found=true;
                     
                     i++;
                    if(i==10)
                        break;
                 }else
                   found=false;
               
           }
           if(found && i==10)
               found=false;
           else
               return "NO";
           
           
       } 
        
    
        return "YES";
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        ArrayList<String> s=new ArrayList<>();
    
        for(int a0 = 0; a0 < q; a0++){
            s.add(in.next());
                 
        }
        for(int i=0; i<q; i++){
            
             String result = hackerrankInString(s.get(i));
            System.out.println(result);
        }
        
        
        in.close();
    }
}
