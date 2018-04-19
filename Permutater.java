/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practive;

/**
 *
 * @author asadj
 */
public class Permutater {

    public static void main(String[] args) {

        int[] sample = {0,1, 2, 3, 4, 5, 6};
        int digits = 3;
        int count=0;
        int counteven=0;
        int countodd=0;
        String pattern = "";

        for (int i = 0; i < sample.length; i++) {

           if(sample[i]!=0){
            
            pattern += sample[i];

            for (int j = 0; j < sample.length; j++) {

                if (j != i) {
                    pattern += sample[j];

                    for (int k = 0; k < sample.length; k++) {

                        if(k!=i && k!=j){
                        
                            int no=Integer.parseInt(pattern+sample[k]);
                            if(no%2==0)
                                counteven++;
                            else
                                countodd++;
                        count++;
                        }

                    }
                    pattern = String.valueOf(sample[i]);
                
               
                }
                
            }
             pattern = "";
           }
        }
        
        System.out.println(count);
        System.out.println(counteven);
        System.out.println(countodd);
    }
    

}
