/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ragaman;

import java.util.Scanner;

/**
 *
 * @author Pineapplelord
 */
public class Ragaman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char c;
        String output = sc.nextLine();
        for (int i = 0; i < output.length(); i++) {
            c = output.charAt(i);
            if (c == ('*')) {
                check = true;
            }
        }
        if (check == true) {
            System.out.print("A");
        } else if (check == false) {
            System.out.print("N");
        }

    }

}
