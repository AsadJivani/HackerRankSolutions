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
public class HighestValuePalindrome {
    static String highestValuePalindrome(String value, int n, int k) {
    
    boolean[] changed=new boolean[n];
    char[] s = value.toCharArray();
    
    for(int i=0; i<n/2; i++){
        
        if(s[i]==s[n-i-1])
            continue;
        else if(s[i]>s[n-i-1]){
            s[n-i-1]=s[i];
            changed[n-i-1]=true;
            k--;
        }
        else{
             s[i]=s[n-i-1];
            changed[i]=true;
            k--;
        }
        
        if(k<0)
            return "-1";
        
    }
    
    
    int pos=0;
    
    while(pos<n/2 && k>=0){
        
        if(s[pos]=='9'){
            pos += 1;
            continue;
        }
        
       
        if(k>=1 && (changed[pos] || changed[n-pos-1])){
        s[pos]='9';
        s[n-pos-1]='9';
        k-=1;
        }
        else if(k>=2){
        s[pos]='9';
        s[n-pos-1]='9';
        k-=2;
        }
        
    pos += 1;
    }
    
        if (n%2!=0 && k>0)
            s[n/2] = '9';
    return String.valueOf(s);

        
    

    
    
   
}





    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        
        
        Scanner input=new Scanner(System.in);
       
        int n = input.nextInt();

        int k = input.nextInt();

        String s = input.next();

        String result = highestValuePalindrome(s, n, k);

        System.out.println(result);
       
    }
}
