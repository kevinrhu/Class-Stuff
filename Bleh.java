/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bleh;

import java.util.Scanner;

/**
 *
 * @author Pineapplelord
 */
public class Bleh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String m = sc.nextLine();
            String[] b = m.split(" ");
            int numbers = b.length;
            num = num + numbers;
        }

        System.out.print("words:" + num);

    }

}
