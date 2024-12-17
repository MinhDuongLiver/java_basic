package Lesson9.Lab3;

import Lesson9.Lab3.entities.Worker;
import Lesson9.Lab3.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Worker> workers = new ArrayList<>();

        Menu menu = new Menu();
        do {
            menu.displayMenu(scanner, workers);
        }while (true);
    }
}
