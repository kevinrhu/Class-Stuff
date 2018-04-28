/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass.stuff;

import java.util.Scanner;

/**
 *
 * @author Pineapplelord
 */
public class ClassStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        
        for (int i = 0; i < n; i++){
            sum += a;
            a += b;
        }
        System.out.println("Sum" + sum);

    }
    
}
//