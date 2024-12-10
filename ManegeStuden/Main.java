package ManegeStuden;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten : ");
        String name = sc.nextLine();
        System.out.println("nhap tuoi : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("nhap diem : ");
        double marks = Double.parseDouble(sc.nextLine());

        Studen studen = new Studen(name,age, marks);
        studen.classify();
        studen.display();
        sc.close();
    }

}
