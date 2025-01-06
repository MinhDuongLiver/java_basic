package DoAnThuVien.entities;

import java.util.Date;
public class BorrowRecord {
    private String id;
    private Book book;
    private Customer customer;
    private Date borrowDate;
    private Date returnDate;

    public BorrowRecord(String id, Book book, Customer customer, Date borrowDate) {
        this.id = id;
        this.book = book;
        this.customer = customer;
        this.borrowDate = borrowDate;
    }

    //BorrowRecord
    public String getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "BorrowRecord{" +
                "id='" + id + '\'' +
                ", book=" + book +
                ", customer=" + customer +
                ", borrowDate=" + borrowDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
