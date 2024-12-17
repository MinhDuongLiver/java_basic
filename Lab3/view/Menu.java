package Lesson9.Lab3.view;

import Lesson9.Lab3.entities.Worker;
import Lesson9.Lab3.service.workerService;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    workerService workerservice = new workerService();
    public void displayMenu(Scanner scanner, ArrayList<Worker> workers){
        System.out.println("== worker manager ==");
        System.out.println("1.tao cong nhan");
        System.out.println("2.tang luong");
        System.out.println("3.giam luong");
        System.out.println("4.hien thi thong tin cong nhan : ");
        System.out.println("5.thoat");
        //System.out.println("6.moi ban lua chon");
        selectMenu(scanner, workers);
    }
    public void selectMenu(Scanner scanner, ArrayList<Worker> workers){
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                Worker worker = workerservice.inputInfo(scanner);
                workers.add(worker);
                break;
            case 2:
                workerservice.modifySalary(scanner, workers, "+");
                break;
            case 3:
                workerservice.modifySalary(scanner, workers, "-");
                break;
            case 4:
                System.out.println(workers);
                break;
            default:
                System.exit(0);
        }
    }
}
