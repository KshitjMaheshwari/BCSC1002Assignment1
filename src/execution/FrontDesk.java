/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int NEW_ISSUED_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int ALL_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student studentDetails = new Student();
        System.out.println("Enter your name:");
        studentDetails.setFirstName(scanner.next());
        studentDetails.setMiddleName(scanner.next());
        studentDetails.setLastName(scanner.next());
        System.out.println("Enter your university roll number:");
        studentDetails.setRollNumber(scanner.nextLong());
        int studentInput;
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter the choice (1..4)");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case NEW_ISSUED_BOOK:
                    System.out.println("enter the number of books you want to issue:");
                    studentDetails.setNumberOfBooksIssued(scanner.nextInt());
                    System.out.println("Enter the name of book:");
                    scanner.nextLine();
                    String[] books = new String[studentDetails.getNumberOfBooksIssued()];
                    for (int index = 0; index < studentDetails.getNumberOfBooksIssued(); index++) {
                        books[index] = scanner.nextLine();
                    }
                    System.out.println("Name of student: " + studentDetails.getFirstName() + " " + studentDetails.getMiddleName() + " " + studentDetails.getLastName());
                    System.out.println("Student roll number: " + studentDetails.getRollNumber());
                    System.out.print("you have issued " + studentDetails.getNumberOfBooksIssued() + " books named: ");
                    for (String book : books) {
                        System.out.print(book + " ");
                    }
                    System.out.println();
                    break;
                case RETURN_BOOK:
                    System.out.println("Enter the number of book you want to return:");
                    int numberOfReturnedBooks = scanner.nextInt();
                    studentDetails.doReturn(numberOfReturnedBooks);
                    break;
                case ALL_ISSUED_BOOKS:
                    studentDetails.printAllBooksIssuedByStudent();
                    break;
                case EXIT:
                    System.out.println("Thank you for coming.");
                    break;
                default:
                    System.out.println("Wrong Choice.");
            }
        } while (studentInput != EXIT);
    }
}