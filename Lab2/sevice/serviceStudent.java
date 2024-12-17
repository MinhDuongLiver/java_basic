package Lesson9.Lab2.sevice;

import Lesson9.Lab2.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class serviceStudent {
    public Student inputInfo(Scanner scanner) {
        System.out.println("nhap ten : ");
        String name = scanner.nextLine();
        System.out.println("nhap diem toan : ");
        double math = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap diem ly : ");
        double physic = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap diem hoa : ");
        double chemistry = Double.parseDouble(scanner.nextLine());

        return new Student(name, math, physic, chemistry);
    }

    public String classify(Student student) {
        double avg_sore = (student.getScoreMath() + student.getScoreChemistry() + student.getScorePhysic()) / 3;
        if (avg_sore >= 8)
            return "A";
        else if (avg_sore >= 6.5)
            return "B";
        else return "C";
    }

    public void displayPercent(ArrayList<Student> students){
        double countA = 0, countB=0, countC=0;
        for (Student student : students){
            String type = classify(student);
            if (type.equals("A")){
                countA++;
            } else if (type.equals("B")) {
                countB++;
            } else countC++;
        }
        System.out.println("%A : "+ (countA/students.size()*100));
        System.out.println("%B : "+ (countB/students.size()*100));
        System.out.println("%C : "+ (countC/students.size()*100));
    }
}

