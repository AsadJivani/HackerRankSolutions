/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practive;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author Omar Faheem
 */
public class MaxPermutation {


    /*
     * Complete the function below.
     */
    static String maximumPermutation(String w, String s) {

        HashMap<String, Integer> Table = new HashMap<>();

        for (int i = 0; i < s.length() - w.length() + 1; i++) {
            String sub = "";
            for (int j = i; j < i + w.length(); j++) {
                sub += s.charAt(j);
            }

            if (Table.get(sub) == null) {
                Table.put(sub, 1);
            } else {
                Table.put(sub, Table.get(sub) + 1);
            }

        }

        for (int i = 0; i < Table.size(); i++) {
          int maxValueInMap=(Collections.max(Table.values())); 
          String max=null;
        for (Entry<String, Integer> entry : Table.entrySet()) {  
            if (entry.getValue()==maxValueInMap) {
                max=entry.getKey();
            }
        }
            int j;
            for (j = 0; j < max.length(); j++) {
                   if(!w.contains(String.valueOf(max.charAt(j)))){
                               Table.remove(max);
                               break;
                   }
            }
                    if(j==max.length())
                        return max;
        }
        
        
        

        return "-1";
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        String[] result = new String[t];

        for (int i = 0; i < t; i++) {
            String w = scan.next();
            String s = scan.next();
            result[i] = maximumPermutation(w, s);

        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
