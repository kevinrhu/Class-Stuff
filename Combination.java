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
        int nm = 1;
        int dn = 1;
        int v1 = n;
        int v2 = m;

        for (int i = 0; i < m; i++) {
            nm*=v1;
            v1--;
            dn*= v2;
            v2--;

        }
        System.out.printf("C(%d,%d)=%d\n", n, m, nm/dn);
    }

}
