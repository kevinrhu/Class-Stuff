/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsinfo;

/**
 *
 * @author Pineapplelord
 */
class Student {

    int id;
    String name;
    int age;
    char gender;
    String school;
    String program;
    String nationaity;

    void printInfo() {
        System.out.println("id " + this.id);
        System.out.println("name " + this.name);
        System.out.println("age" + this.age);
        System.out.println("gender" + this.gender);
        System.out.println("school" + this.school);
        System.out.println("program" + this.program);
        System.out.println("nationality" + this.nationaity);
    }

    void deserialize(String student) {
        String[] sStudents = sStudent.split("&");
        this.id = Integer.parseInt(sStudents[0]);
        this.name = sStudents[1];
        this.age = Integer.parseInt(sStudents[2]);
        this.gender = sStudents[3].charAt(0);
        this.school = sStudents[4];
        this.program = sStudents[5];
        this.nationaity = sStudents[6];
    }
    
    String serialize(){
        String sRet =
                this.id +"&" + this.name+"&"+this.age+"&"+this.gender+"&"+this.school+"&"+this.program+"&"+this.nationaity;
        return sRet;
    }

}
