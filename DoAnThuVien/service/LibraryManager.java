package DoAnThuVien.service;
import DoAnThuVien.entities.Book;
import DoAnThuVien.entities.BorrowRecord;
import DoAnThuVien.entities.Customer;

import java.util.List;

public interface LibraryManager {
    void addBook(Book book);
    void removeBook(String bookId);
    void updateBook(Book book);
    Book findBookById(String bookId);
    List<Book> getAllBooks();
    void borrowBook(String bookId, String customerId);
    void returnBook(String bookId);
    List<BorrowRecord> getBorrowRecords();
    double calculateRevenue();
    List<Book> getBestSellingBooks();

    void addCustomer(Customer customer1);
}
