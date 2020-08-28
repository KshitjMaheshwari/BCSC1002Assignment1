/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private final static int CAPACITY_OF_BOOKS_STORED_IN_LIBRARY = 120;
    private Book[] currentlyAvailableBooks;

    public Library() {
        currentlyAvailableBooks = new Book[CAPACITY_OF_BOOKS_STORED_IN_LIBRARY];
        for (int index = 0; index < CAPACITY_OF_BOOKS_STORED_IN_LIBRARY; index++) {
            currentlyAvailableBooks[index] = new Book();
        }
    }

    public Library(Book[] currentlyAvailableBooks) {
        this.currentlyAvailableBooks = currentlyAvailableBooks;
    }

    public Book[] getCurrentlyAvailableBooks() {
        return currentlyAvailableBooks.clone();
    }

    public void setCurrentlyAvailableBooks(Book[] currentlyAvailableBooks) {
        this.currentlyAvailableBooks = currentlyAvailableBooks;
    }
}
