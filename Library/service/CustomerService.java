package Lesson13.Library.service;

import Lesson13.Library.entities.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService implements IService<Customer> {

    @Override
    public Customer insert(Scanner scanner) {
        System.out.println("moi b nhap khach hang");
        String name = scanner.nextLine();

        return new Customer(name);
    }

    @Override
    public void delete(Scanner scanner, ArrayList<Customer> objs) {
        System.out.println("moi ban nhap id sach");
        int id = Integer.parseInt(scanner.nextLine());
        for (Customer customer : objs){
            if (id == customer.getId()){
                objs.remove(customer);
            }
        }
    }
}
