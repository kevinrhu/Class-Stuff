/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;

/**
 *
 * @author Pineapplelord
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the line of 3 words: ");
        String s1 = scanner.next();
        String s2 = scanner.next();
        String s3 = scanner.next();
        scanner.nextLine();

        System.out.print("Please input your line: ");
        String line = scanner.nextLine();

        System.out.print("Please put in 3 integers: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        System.out.print("PLease input 3 real numbers: ");
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        double d3 = scanner.nextDouble();

        System.out.print("Please input 2 hex numebers:: ");
        int h1 = scanner.nextInt(16);
        int h2 = scanner.nextInt(16);

    
        
        System.out.printf("The words you have inputed: %s,%s,%s \n", s1,s2,s3);
        System.out.printf("The line you have inputed is: %s\n", line);
        System.out.printf("The integers you have inputed are: %d,%d,%d \n", n1,n2,n3);
        System.out.printf("The real number you have inputed are: %f %f %f \n", d1, d2, d3);
        System.out.printf("The hex number you have inputed are: %d %d \n", h1, h2);

        // TODO code application logic here
    }

}