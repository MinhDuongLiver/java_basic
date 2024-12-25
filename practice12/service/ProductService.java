package Lesson12.practice12.service;

import Lesson12.practice12.entities.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    public void createProduct(Scanner scanner, ArrayList<Product> products) {
        System.out.println("nhap ten san pham");
        String name = scanner.nextLine();
        System.out.println("nhap gia");
        BigDecimal price = new BigDecimal(scanner.nextLine());
        Product product = new Product(name, price);
        products.add(product);


    }
}
