package Lesson10.Login_logout_Registe;

import Lesson10.Login_logout_Registe.service.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("1.damg nhap");
            System.out.println("2.dang ky");
            System.out.println("3.thoat");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1 :
                    userService.login();
                    break;
                case 2 :
                    userService.register();
                    break;
                case 0:
                    System.out.println("Tạm biệt!");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
