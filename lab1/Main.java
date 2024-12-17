package Lesson9.lab1;

import Lesson9.lab1.entities.Student;
import Lesson9.lab1.sertice.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService service = new StudentService();
        ArrayList<Student> students = new ArrayList<>();

        do {
            Student student = service.inputInfo(scanner);
            students.add(student);
            System.out.println("b co muon nhap nua k");
            String choose = scanner.nextLine();
            if(choose.equalsIgnoreCase("N")){
                break;
            }
        }while (true);
        System.out.println(students);
    }
}
