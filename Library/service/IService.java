package Lesson13.Library.service;

import java.util.ArrayList;
import java.util.Scanner;

public interface IService <T>{
    T insert(Scanner scanner);
    void delete(Scanner scanner, ArrayList<T> obis);
}
