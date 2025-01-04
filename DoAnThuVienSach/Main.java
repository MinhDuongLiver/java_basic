package DoAnThuVienSach;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Thêm sách
        library.addBook(new Book("B001", "Java Programming", "John Doe", 29.99));
        library.addBook(new Book("B002", "Python Programming", "Jane Doe", 24.99));

        // Thêm khách hàng
        library.addCustomer(new Customer("C001", "Alice", "123456789"));
        library.addCustomer(new Customer("C002", "Bob", "987654321"));

        // Hiển thị danh sách sách
        System.out.println("Danh sách sách:");
        library.displayBooks();

        // Mượn sách
        library.borrowBook("B001", "C001", new Date());

        // Hiển thị danh sách giao dịch
        System.out.println("Danh sách giao dịch:");
        library.displayTransactions();

        // Trả sách
        library.returnBook("transactionId", new Date());

        // Hiển thị danh sách giao dịch sau khi trả sách
        System.out.println("Danh sách giao dịch sau khi trả sách:");
        library.displayTransactions();
    }
}
