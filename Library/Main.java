package Lesson13.Library;


import Lesson13.Library.view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu();
        do {
            menu.displayMenu(scanner);
        } while (true);
    }
}
