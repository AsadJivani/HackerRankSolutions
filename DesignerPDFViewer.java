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
public class DesignerPDFViewer {
     
    static int designerPdfViewer(int[] h, String word) {
    
        int[] wheight=new int[word.length()];
        char[] words=word.toCharArray();
        
        for(int i=0; i<words.length; i++){
            
            int asc=(int) words[i];
            wheight[i]=h[asc-97];
            
            
        }
        
        
        int max=wheight[0];
        
        for(int i=0; i<wheight.length; i++){
            
            if(max<wheight[i])
               max=wheight[i];
        }
        
        return (max*(word.length()));
            
        
        
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i = 0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        in.close();
    } 
}
