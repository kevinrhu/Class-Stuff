/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutation;

import java.util.Scanner;

/**
 *
 * @author Pineapplelord
 */
public class Permutation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int product = 1;
        for (int i = 0;i<n;i++){
            product+=n;
            n--;
        }
        System.out.printf("P(%d,%d)=%d\n", n+n, m, product);
    }
    
}
