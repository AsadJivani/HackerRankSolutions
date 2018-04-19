/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practive;

import java.util.Scanner;
import static practive.TowerBreakers.towerBreakers;

/**
 *
 * @author asadj
 */
public class AChessboardGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] x = new int[t];
        int[] y = new int[t];
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int m = in.nextInt();
            x[a0] = n;
            y[a0] = m;

        }
        for (int i = 0; i < t; i++) {
            String result = chessboardGame(x[i], y[i]);
            System.out.println(result);
        }

        in.close();
    }

    static String chessboardGame(int x, int y) {

     if(x*y>=15)
        return "First";
     else
         return "Second";
    }
}
