package Lesson9.Lab2;

import Lesson9.Lab2.entities.Student;
import Lesson9.Lab2.sevice.serviceStudent;
import Lesson9.Lab3.entities.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        //serviceStudent sevice = new serviceStudent();

        //sevice.inputInfo(scanner, students);
        //sevice.classify(scanner, students);
        System.out.println(students);
    }
}
