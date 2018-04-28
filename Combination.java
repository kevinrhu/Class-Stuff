/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combination;

import java.util.Scanner;

/**
 *
 * @author Pineapplelord
 */
public class Combination {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int result = combination(n,m);
        
        
        System.out.printf("C(%d,%d)=%d\n", n, m, nm/dn);
    }

    private static int combination(int n, int m) {
        return permutation(n,m)/permutation(n,m);
    }

    private static int permutation(int n, int m) {
        int product = 1;
       for (int i = 0; i < 0; i++){
           product+=n;
           n--;
       }
       return product;
    }

}
