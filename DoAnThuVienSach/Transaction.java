package DoAnThuVienSach;


import java.util.Date;

public class Transaction {
    private String id;
    private Book book;
    private Customer customer;
    private Date borrowDate;
    private Date returnDate;

    public Transaction(String id, Book book, Customer customer, Date borrowDate) {
        this.id = id;
        this.book = book;
        this.customer = customer;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", book=" + book +
                ", customer=" + customer +
                ", borrowDate=" + borrowDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
