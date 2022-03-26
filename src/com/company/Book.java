package com.company;

/**
 * @author Amela Karasalihovic
 */
public class Book {

    public int serialNo;
    public String name;
    public String author;
    public String genre;
    public boolean status;

    public Book(int serialNo, String name, String author, String genre, boolean status) {
        this.serialNo = serialNo;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.status = status;
    }

    public void borrowBook() {
        if (status) {
            System.out.println(name + " is already borrowed.");
        } else {
            status = true;
            System.out.println("We are borrowing you " + name + " book.");
        }
    }
}
