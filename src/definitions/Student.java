/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private long rollNumber;
    private int numberOfBooksIssued;
    private Book[] booksNameIssuedByStudent;

    public Student() {
        firstName = "Not Available";
        numberOfBooksIssued = 1;
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

    public void setNumberOfBooksIssued(int numbersOfBooksIssued) {
        this.numberOfBooksIssued = numbersOfBooksIssued;
    }

    public Book[] getBooksNameIssuedByStudent() {
        return booksNameIssuedByStudent.clone();
    }

    public void setBooksNameIssuedByStudent(Book[] booksNameIssuedByStudent) {
        this.booksNameIssuedByStudent = booksNameIssuedByStudent;
    }

    @Override
    public String toString() {
        return "Student{ " + "\n" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' + "\n" +
                "rollNumber=" + rollNumber + "\n" +
                "numberOfBooksIssued= " + numberOfBooksIssued + "\n" +
                "booksNameIssuedByStudent=" + Arrays.toString(booksNameIssuedByStudent) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber &&
                numberOfBooksIssued == student.numberOfBooksIssued &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(middleName, student.middleName) &&
                Objects.equals(lastName, student.lastName) &&
                Arrays.equals(booksNameIssuedByStudent, student.booksNameIssuedByStudent);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, middleName, lastName, rollNumber, numberOfBooksIssued);
        result = 31 * result + Arrays.hashCode(booksNameIssuedByStudent);
        return result;
    }

    /**
     * This method prints the all books issued by student.
     */
    public void printAllBooksIssuedByStudent() {
        for (Book bookName : booksNameIssuedByStudent) {
            System.out.println(bookName);
        }
    }

    /**
     * This method prints the whether the books were returned or not.
     *
     * @param numberOfBooksIssued the number of books which were issued.
     **/
    public void doReturn(int numberOfBooksIssued) {
        if (this.numberOfBooksIssued <= numberOfBooksIssued) {
            System.out.println("The books get returned.");
        }
    }

}
