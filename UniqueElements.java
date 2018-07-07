/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unique.elements;

import java.util.Scanner;

/**
 *
 * @author Pineapplelord
 */
public class UniqueElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 30001;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a != number){
                counter++;
            }
            number = a; 
        }
        System.out.print(counter);
    }
}
