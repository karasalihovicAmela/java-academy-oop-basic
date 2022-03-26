package com.company;

/**
 * @author Amela Karasalihovic
 */
public class Activity {

    public static void main(String[] args) {

        Book book1 = new Book(1, "40 pravila ljubavi",
        "Elif Safak", "roman", false);
        Book book2 = new Book(2, "Derviš i smrt",
                "Meša Selimović", "roman", true);

        book1.borrowBook();
        book2.borrowBook();
        book1.borrowBook();
    }
}
