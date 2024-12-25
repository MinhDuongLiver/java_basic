package Lesson12.practice12.service;

import Lesson12.practice12.entities.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UserSevice {
    public User login(Scanner scanner, ArrayList<User> users){
        System.out.println("moi b nhap username");
        String username = scanner.nextLine();
        System.out.println("moi b nhap password");
        String password = scanner.nextLine();
        User user = findByUsernameAndPassword(username, password, users);
        if(user != null){
            System.out.println("login successfull");
        }else {
            System.out.println("login fail");
        }
        return user;
    }
    public User findByUsernameAndPassword(String username, String password, ArrayList<User> users){
        for(User user : users ){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
}
