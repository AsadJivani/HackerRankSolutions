/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auniqueart;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author asadj
 */
public class AUniqueArt {

 
 
    static void initialize(int[] t) {
       
       

    }

    /*
     * Complete the student function below.
     */
    static int student(int i, int j) {
 
        int check=t[i-1];
        int count=j-i+1;
        
        for(int k=i; k<j; k++){
            
            if(check==t[k]){
                count-=2;
                if(k<j-3){
                    check=t[k+1];
                    k++;
                }else
                    break;
            }
            
            
            
        }
        
        return count;
     
    }


    private static final Scanner scan = new Scanner(System.in);
    static int[] t;
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        t = new int[n];

        String[] tItems = scan.nextLine().split(" ");

        for (int tItr = 0; tItr < n; tItr++) {
            int tItem = Integer.parseInt(tItems[tItr].trim());
            t[tItr] = tItem;
        }

        initialize(t);
        int q = Integer.parseInt(scan.nextLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String[] ij = scan.nextLine().split(" ");

            int i = Integer.parseInt(ij[0].trim());

            int j = Integer.parseInt(ij[1].trim());

            int result = student(i, j);

            System.out.println(result);
        }
    }

}
