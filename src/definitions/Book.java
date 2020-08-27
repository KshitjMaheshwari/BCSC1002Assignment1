/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

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

    /**
     * This method returns the name of the book.
     *
     * @return The name of the book.
     */
    public String getBookName() {

        return bookName;
    }

    /**
     * This method sets the name of the book.
     *
     * @param bookName The name of the book.
     */

    public void setBookName(String bookName) {

        this.bookName = bookName;
    }

    /**
     * This method returns the name of the book.
     *
     * @return The author of the book.
     */
    public String getBookAuthor() {

        return bookAuthor;
    }

    /**
     * This method sets the name of the book.
     *
     * @param bookAuthor The name of the book.
     */
    public void setBookAuthor(String bookAuthor) {

        this.bookAuthor = bookAuthor;
    }

    /**
     * This method returns the name of the book.
     *
     * @return The ISBN number of the book.
     */
    public String getBookISBNNumber() {

        return bookISBNNumber;
    }

    /**
     * This method sets the name of the book.
     *
     * @param bookISBNNumber The name of the book.
     */
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
}
