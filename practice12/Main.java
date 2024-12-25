package Lesson12.practice12;

import Lesson12.practice12.entities.Product;
import Lesson12.practice12.entities.User;
import Lesson12.practice12.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();
        users.add(new User("duong","123","duong@gamil.com",0));
        users.add(new User("hieu","123","duong@gamil.com",2));
        users.add(new User("dat","123","duong@gamil.com",1));
        Menu menu = new Menu();
        do{
            menu.displayMenu(scanner, users, products);
        }while (true);

    }
}
