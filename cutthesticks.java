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
public class cutthesticks {

   
    static ArrayList<Integer> cutTheSticks(ArrayList<Integer> arr) {

        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr.size());

        while (arr.size() != 1) {
            int cut = arr.get(0);
            for (int i : arr) {
                cut = cut < i ? cut : i;
            }
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) - cut > 0) {
                    arr.set(i, arr.get(i) - cut);
                } else {
                    arr.remove(i);
                    i--;
                }

            }
            result.add(arr.size());

        }
     

        return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr.add(in.nextInt());
        }
        ArrayList<Integer> result = cutTheSticks(arr);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + (i != result.size() - 1 ? "\n" : ""));
        }
        System.out.println("");

        in.close();
    }
}
