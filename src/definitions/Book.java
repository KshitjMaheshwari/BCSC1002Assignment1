/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String bookAuthor;
    private String bookISBNNumber;

    public Book() {
        bookName = "Java A Beginner’s Guide, Eighth Edition";
        bookAuthor = "Herbert Schildt";
        bookISBNNumber = "1258_451_611_156";
    }

    public Book(String bookName, String bookAuthor, String bookISBNNumber) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookISBNNumber = bookISBNNumber;
    }

    public Book(String bookName) {
        this.bookName = bookName;
        this.bookAuthor = "Antti Laaksonen";
        this.bookISBNNumber = "1455_546_656_656";
    }

    public String getBookName() {

        return bookName;
    }

    public void setBookName(String bookName) {

        this.bookName = bookName;
    }

    public String getBookAuthor() {

        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {

        this.bookAuthor = bookAuthor;
    }

    public String getBookISBNNumber() {

        return bookISBNNumber;
    }

    public void setBookISBNNumber(String bookISBNNumber) {

        this.bookISBNNumber = bookISBNNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookISBNNumber='" + bookISBNNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(bookAuthor, book.bookAuthor) &&
                Objects.equals(bookISBNNumber, book.bookISBNNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookAuthor, bookISBNNumber);
    }
}
