package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book[] books = new Book[5];
        books[0] = new Book(11, "123-456", "Jack Reacher", true, "Alex");
        books[1] = new Book(12, "456-789", "Casino royale",false, "");
        books[2] = new Book(13, "123-789", "Journey to the center of the Earth", false, "");
        books[3] = new Book(14, "234-567", "The Mysterious Island", true, "John");
        books[4] = new Book(15, "567-890", "The Martian", false, "");
        System.out.println("Choose from the following options:");
        System.out.println("1. Show available books");
        System.out.println("2. Show checked out books");
        System.out.println("3. Exit");
        int options = input.nextInt();
        switch (options) {
            case 1:
                for (Book book : books){
                    if (!book.isCheckedOut()){
                        book.display();
                    }
                }
                break;
            case 2:
                for (Book book : books){
                    if (book.isCheckedOut()){
                        book.display();
                    }
                }
                break;
            case 3:
                System.out.println("Exiting the program");
                break;
            default:
                System.out.println("Invalid option");
        }
        input.close();

    }
}