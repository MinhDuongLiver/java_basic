package DoAnThuVienSach;


import java.util.*;

public class Library {
    private List<Book> books;
    private List<Customer> customers;
    private List<Transaction> transactions;

    public Library() {
        books = new ArrayList<>();
        customers = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    // Thêm sách
    public void addBook(Book book) {
        books.add(book);
    }

    // Xóa sách
    public void removeBook(String bookId) {
        books.removeIf(book -> book.getId().equals(bookId));
    }

    // Tìm kiếm sách
    public Book findBookById(String bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }

    // Hiển thị danh sách sách
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Thêm khách hàng
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Tìm kiếm khách hàng
    public Customer findCustomerById(String customerId) {
        for (Customer customer : customers) {
            if (customer.getId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }

    // Mượn sách
    public void borrowBook(String bookId, String customerId, Date borrowDate) {
        Book book = findBookById(bookId);
        Customer customer = findCustomerById(customerId);

        if (book != null && customer != null && book.isAvailable()) {
            book.setAvailable(false);
            transactions.add(new Transaction(UUID.randomUUID().toString(), book, customer, borrowDate));
        } else {
            System.out.println("Không thể mượn sách.");
        }
    }

    // Trả sách
    public void returnBook(String transactionId, Date returnDate) {
        for (Transaction transaction : transactions) {
            if (transaction.getId().equals(transactionId)) {
                transaction.setReturnDate(returnDate);
                transaction.getBook().setAvailable(true);
                break;
            }
        }
    }

    // Hiển thị danh sách giao dịch
    public void displayTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }


}