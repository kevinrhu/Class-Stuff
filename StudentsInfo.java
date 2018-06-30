/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsinfo;

import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Pineapplelord
 */
public class StudentsInfo {

    private static Student[] readStudentsFromFile() {
        Student[] sts = new Student[5];
        Scanner scanner;
        try {
            File file = new File("C:\\Users\\Pineapplelord\\Documents\\students.txt");
            scanner = new Scanner(new BufferedReader(new FileReader(file)));    
        } catch (Exception e) {
            return null;
        }
        for (int i = 0; i < 5; i++) {
            Student student = new Student();
            student.id = Integer.parseInt(scanner.nextLine());
            student.name = scanner.nextLine();
            student.age = Integer.parseInt(scanner.nextLine());
            student.gender = scanner.nextLine().charAt(0);
            student.school = scanner.nextLine();
            student.program = scanner.nextLine();
            student.nationaity = scanner.nextLine();
            sts[i] = student;
        }
        return sts;
    }

    static Student[] students;
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        students = readStudentsFromFile();
        if (students == null) {
            System.out.println("File is not Found");
            return;
        }
        int id = Integer.parseInt(sc.nextLine());
        while (id > 0) {
            Student student = findStudentWithId(id);
            if (student == null) {
                System.out.println("the id input is not correct. Please input Integer from 1-5");
            } else {
                student.printInfo();
            }
            id = Integer.parseInt(sc.nextLine());
        }
    }

    private static Student findStudentWithId(int id) {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student.id == id) {
                return student;
            }
        }
        return null;
    }

}
