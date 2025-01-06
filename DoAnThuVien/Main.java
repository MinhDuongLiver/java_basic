package DoAnThuVien;

import DoAnThuVien.entities.Book;
import DoAnThuVien.entities.Customer;
import DoAnThuVien.service.LibraryManager;
import DoAnThuVien.service.LibraryManagerImpl;

public class Main {
    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManagerImpl();

        // Thêm sách
        Book book1 = new Book("B001", "Java Programming", "John Doe", "Programming");
        Book book2 = new Book("B002", "Python Programming", "Jane Doe", "Programming");
        libraryManager.addBook(book1);
        libraryManager.addBook(book2);

        // Thêm khách hàng
        Customer customer1 = new Customer("C001", "Alice", "123456789");
        Customer customer2 = new Customer("C002", "Bob", "987654321");
        libraryManager.addCustomer(customer1);
        libraryManager.addCustomer(customer2);

        // Mượn sách
        libraryManager.borrowBook("B001", "C001");

        // Trả sách
        libraryManager.returnBook("B001");

        // Hiển thị danh sách sách
        System.out.println("Danh sách sách:");
        for (Book book : libraryManager.getAllBooks()) {
            System.out.println(book);
        }

        // Hiển thị doanh thu
        System.out.println("Doanh thu: " + libraryManager.calculateRevenue());

        // Hiển thị sách bán chạy
        System.out.println("Sách bán chạy:");
        for (Book book : libraryManager.getBestSellingBooks()) {
            System.out.println(book);
        }
    }

}
