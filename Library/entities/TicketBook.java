package Lesson13.Library.entities;

import java.time.LocalDate;

public class TicketBook {
    private int id;
    private static int autoId;
    private int bookId;
    private int customerId;
    private int quantity;
    private LocalDate borrowDate;

    public TicketBook( int bookId, int customerId, int quantity) {
        this.id = ++autoId;
        this.bookId = bookId;
        this.customerId = customerId;
        this.quantity = quantity;
        this.borrowDate = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        TicketBook.autoId = autoId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    @Override
    public String toString() {
        return "TicketBook{" +
                "id=" + id +
                ", bookId=" + bookId +
                ", customerId=" + customerId +
                ", quantity=" + quantity +
                ", borrowDate=" + borrowDate +
                '}';
    }
}
