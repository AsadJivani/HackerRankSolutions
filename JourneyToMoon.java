/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practive;

import java.awt.Point;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author asadj
 */
public class JourneyToMoon {
 static int ci;
    static boolean ArrayComparsion(ArrayList<Long> arr,long value){
        for (ci = 0; ci < arr.size(); ci++) {
                    if(arr.get(ci)==value)
                       return true;
        }
        return false;
    }
 
  
     static Long journeyToMoon(Long n, ArrayList<ArrayList<Long>> astronaut,int p) {
       for (int i = 0; i < astronaut.size(); i++) {
             for (int k = 0; k < astronaut.get(i).size(); k++) {
                 
             
         
            long c_astro=astronaut.get(i).get(k);
            
             for (int j = i+1; j < astronaut.size(); j++) {
                
                   if(ArrayComparsion(astronaut.get(j), c_astro)){
                         if(ci==0)
                             ci=1;
                         else
                             ci=0;
                       if(!astronaut.get(i).contains(astronaut.get(j).get(ci))) {
                         astronaut.get(i).add(astronaut.get(j).get(ci));
                         
                       }
                       
                       astronaut.remove(j);
                      j--;
                   
                   }
             }
             
             }
             
             
 
              
             
         }
         
         
        long totallinks=(n*(n-1))/2;
         for (int i = 0; i < astronaut.size(); i++) {
             totallinks-=(astronaut.get(i).size()*(astronaut.get(i).size()-1))/2;
         }
           
                
         return totallinks;
     
       
         
         
         
         
         
         
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int p = in.nextInt();
        ArrayList<ArrayList<Long>> astronaut=new ArrayList<>();
        for(int astronaut_i = 0; astronaut_i < p; astronaut_i++){
            ArrayList<Long> temp=new ArrayList<>();
            for(int astronaut_j = 0; astronaut_j < 2; astronaut_j++){
                temp.add(in.nextLong());
            }
            astronaut.add(temp);
        }
        Long result = journeyToMoon(n, astronaut,p);
        System.out.println(result);
        in.close();
    }

}
