/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private long rollNumber;
    private int numberOfBooksIssued;
    private Book[] booksNameIssuedByStudent;

    public Student() {
        firstName = "Not Available";
        numberOfBooksIssued = 3;
        booksNameIssuedByStudent = new Book[numberOfBooksIssued];
        for (int index = 0; index < numberOfBooksIssued; index++) {
            booksNameIssuedByStudent[index] = new Book();
        }
    }

    public Student(String firstName, String middleName, String lastName, long rollNumber, int numberOfBooksIssued, Book[] booksNameIssuedByStudent) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.booksNameIssuedByStudent = booksNameIssuedByStudent;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getMiddleName() {

        return middleName;
    }

    public void setMiddleName(String middleName) {

        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(long rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int booksIssued) {
        this.numberOfBooksIssued = booksIssued;
    }

    public Book[] getBooksNameIssuedByStudent() {
        return booksNameIssuedByStudent;
    }

    public void setBooksNameIssuedByStudent(Book[] booksNameIssuedByStudent) {
        this.booksNameIssuedByStudent = booksNameIssuedByStudent;
    }

}
