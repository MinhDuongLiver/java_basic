import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("moi ban nhap ten : ");
//        String name = sc.nextLine();
//        System.out.println("ten cua ban la : "+name);
//        System.out.println("moi ban nhap tuoi : ");
//        int age = Integer.parseInt((sc.nextLine()));
//        System.out.println("tuoi cua ban la : "+ age);
//        System.out.println("moi ban nhap email : ");
//        String mail = sc.nextLine();
//        System.out.println("email cua ban la : "+ mail);

//        LocalDate today = LocalDate.now();
//        System.out.println(today.plusDays(5));

//        String dateTime = " 28/11/2024";
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println("ngay gio hien tai la : "+dateTime);
//        System.out.println("thoi gian 3 ngay sau : "+dateTime.plusDays(3));
        Scanner sc = new Scanner(System.in);

        System.out.println("moi ban nhap ngay thang nam (yyyy/MM/dd) : ");
        String dateString = sc.nextLine();
        LocalDate lcd = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(dateString);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("ngay hom nay la : "+dt);
        System.out.println("ngay sau 3 hom : "+dt.plusDays(3));




    }
}
