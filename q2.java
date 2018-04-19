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
public class q2 {
    
        
    static String timeConversion(String s) {
        
        String[] units=s.split(":");
 
        String lastpart=units[2];
        String seconds=lastpart.charAt(0)+""+lastpart.charAt(1);
        String amorpm=lastpart.charAt(2)+""+lastpart.charAt(3);
          int hour=Integer.parseInt(units[0]);
          
      if(amorpm.equals("AM") && hour==12)     
            hour=0;
           
      if(amorpm.equals("PM") && hour<12){  
        
          hour=hour+12;
 
        
      }
      String ans;
     if(hour<10)
       ans="0"+hour+":"+units[1]+":"+seconds;
      else
        ans=hour+":"+units[1]+":"+seconds;
     
        return ans;
        
    }
    
    
    
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
      }
      
}
