package DoAnThuVien.service;
import DoAnThuVien.entities.Book;
import DoAnThuVien.entities.BorrowRecord;
import DoAnThuVien.entities.Customer;

import java.util.*;

public class LibraryManagerImpl implements LibraryManager {
    private Map<String, Book> books;
    private Map<String, Customer> customers;
    private List<BorrowRecord> borrowRecords;

    public LibraryManagerImpl() {
        books = new HashMap<>();
        customers = new HashMap<>();
        borrowRecords = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    @Override
    public void removeBook(String bookId) {
        books.remove(bookId);
    }

    @Override
    public void updateBook(Book book) {
        books.put(book.getId(), book);
    }

    @Override
    public Book findBookById(String bookId) {
        return books.get(bookId);
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    @Override
    public void borrowBook(String bookId, String customerId) {
        Book book = books.get(bookId);
        Customer customer = customers.get(customerId);
        if (book != null && customer != null && book.isAvailable()) {
            book.setAvailable(false);
            borrowRecords.add(new BorrowRecord(UUID.randomUUID().toString(), book, customer, new Date()));
        }
    }

    @Override
    public void returnBook(String bookId) {
        Book book = books.get(bookId);
        if (book != null) {
            book.setAvailable(true);
            for (BorrowRecord record : borrowRecords) {
                if (record.getBook().getId().equals(bookId) && record.getReturnDate() == null) {
                    record.setReturnDate(new Date());
                    break;
                }
            }
        }
    }

    @Override
    public List<BorrowRecord> getBorrowRecords() {
        return borrowRecords;
    }

    @Override
    public double calculateRevenue() {
        double revenue = 0;
        for (BorrowRecord record : borrowRecords) {
            if (record.getReturnDate() != null) {
                revenue += 10; // Giả sử mỗi lần mượn sách tính phí 10 đơn vị tiền tệ
            }
        }
        return revenue;
    }

    @Override
    public List<Book> getBestSellingBooks() {
        // Giả sử sách bán chạy là sách được mượn nhiều nhất
        Map<Book, Integer> bookBorrowCount = new HashMap<>();
        for (BorrowRecord record : borrowRecords) {
            bookBorrowCount.put(record.getBook(), bookBorrowCount.getOrDefault(record.getBook(), 0) + 1);
        }

        List<Map.Entry<Book, Integer>> list = new ArrayList<>(bookBorrowCount.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        List<Book> bestSellingBooks = new ArrayList<>();
        for (Map.Entry<Book, Integer> entry : list) {
            bestSellingBooks.add(entry.getKey());
        }

        return bestSellingBooks;
    }


    /// /


}
