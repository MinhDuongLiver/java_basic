package Lesson13.Library.service;

import Lesson13.Library.entities.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookService implements IService<Book>{

    @Override
    public Book insert(Scanner scanner) {
        System.out.println("moi ban nha ten sach");
        String name = scanner.nextLine();
        System.out.println("{moi ban nhap so luong sach");
        int quantity = Integer.parseInt(scanner.nextLine());
        return new Book(name, quantity);
    }

    @Override
    public void delete(Scanner scanner, ArrayList<Book> obis) {
        System.out.println("moi ban nhap id sach");
        int id = Integer.parseInt(scanner.nextLine());
        for (Book book:obis){
            if(id== book.getId()){
                obis.remove(book);
            }
        }
    }
}
