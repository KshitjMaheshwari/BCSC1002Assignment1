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

}
