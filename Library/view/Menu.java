package Lesson13.Library.view;

import Lesson13.Library.entities.Customer;
import Lesson13.Library.service.CustomerService;

import java.util.Scanner;

public class Menu {
    public void displayMenu(Scanner scanner) {
        System.out.println("1_ Them sach");
        System.out.println("2- Sua sach");
        System.out.println("3- Xoa sach");

        System.out.println("4- Them khach hang");
        System.out.println("5- Sua khach hang");
        System.out.println("6- Xoa khach hang");

        System.out.println("7- Them phieu muon");
        System.out.println("8- Sua phieu muon");
        System.out.println("9- Xoa phieu muon");
        selectMenu(scanner);
    }
    public void selectMenu(Scanner scanner){
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1 :
                CustomerService.
                break;
            case 2 :
//                System.out.print("Enter Book ID: ");
//                String bookId = scanner.nextLine();
//                System.out.print("Enter Book Title: ");
//                String bookTitle = scanner.nextLine();
//                System.out.print("Enter Author: ");
//                String bookAuthor = scanner.nextLine();
//                library.addBook(bookId, bookTitle, bookAuthor);
                break;
            case 3 :
                break;
            case 4 :
                break ;
//            default:
//                return;
        }
    }
}
