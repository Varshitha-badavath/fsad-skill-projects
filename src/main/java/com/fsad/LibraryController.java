package com.fsad;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryController {

    private List<Book> bookList = new ArrayList<>();

    // 1. Welcome message
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Online Library System!";
    }

    // 2. Total book count
    @GetMapping("/count")
    public int count() {
        return 150;
    }

    // 3. Sample book price
    @GetMapping("/price")
    public double price() {
        return 299.99;
    }

    // 4. List of book titles
    @GetMapping("/books")
    public List<String> getBooks() {
        List<String> books = new ArrayList<>();
        books.add("Clean Code");
        books.add("The Pragmatic Programmer");
        books.add("Effective Java");
        return books;
    }

    // 5. Book details by ID
    @GetMapping("/books/{id}")
    public String getBookById(@PathVariable int id) {
        return "Book details for ID: " + id + " - Title: Effective Java, Author: Joshua Bloch";
    }

    // 6. Search by title (request param)
    @GetMapping("/search")
    public String searchBook(@RequestParam String title) {
        return "Search result for: " + title + " - Book found in library!";
    }

    // 7. Author info by name
    @GetMapping("/author/{name}")
    public String getAuthor(@PathVariable String name) {
        return "Author " + name + " has written multiple bestselling books.";
    }

    // 8. Add a book (POST)
    @PostMapping("/addbook")
    public String addBook(@RequestBody Book book) {
        bookList.add(book);
        return "Book added successfully: " + book.getTitle();
    }

    // 9. View all added books
    @GetMapping("/viewbooks")
    public List<Book> viewBooks() {
        return bookList;
    }
}