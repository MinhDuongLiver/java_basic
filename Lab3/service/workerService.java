package Lesson9.Lab3.service;

import Lesson9.Lab3.entities.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class workerService {
    public Worker inputInfo(Scanner scanner){
        System.out.println("nha ten cong nhan : ");
        String name = scanner.nextLine();
        System.out.println("moi ban nhap tuoi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("moi ban nhap luong : ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("moi ban nhap noi lam viec : ");
        String workPlace = scanner.nextLine();

        return new Worker(name, age, salary, workPlace);
    }
    public void modifySalary(Scanner scanner, ArrayList<Worker> workers, String type){
        System.out.println("moi ban nhap id : ");
        int id = Integer.parseInt(scanner.nextLine());
        Worker worker = findByid(id, workers);
        if(worker == null){
            System.out.println("khong tim thay cong nhan nao cos id : "+ id);
        } else {
            if(type.equals("-")){
                System.out.println("moi ban nhap tien muon giam");
                double money = Double.parseDouble(scanner.nextLine());
                worker.setSalary(worker.getSalary() - money);
            } else {
                System.out.println("moi ban nhap tien muon tang");
                double money = Double.parseDouble(scanner.nextLine());
                worker.setSalary(worker.getSalary() + money);
            }
        }
    }

    private Worker findByid(int id, ArrayList<Worker> workers) {
        for (Worker worker: workers){
            if(worker.getId()==id){
                return worker;
            }
        }
        return null;
    }
}
