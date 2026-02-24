package com.ElOuedUniv.maktaba.data.repository

import com.ElOuedUniv.maktaba.data.model.Book

/**
 * Repository for managing book data
 * This follows the Repository pattern to abstract data sources
 */
class BookRepository {

    /**
     * TODO for Students (TP1 - Exercise 1):
     * Complete the book information for each book in the list below.
     * Add the following information for each book:
     * - isbn: Use a valid ISBN-13 format (e.g., "978-3-16-148410-0")
     * - nbPages: Add the actual number of pages
     *
     * Example:
     * Book(
     *     isbn = "978-0-13-468599-1",
     *     title = "Clean Code",
     *     nbPages = 464
     * )
     */
    private val booksList = listOf(
        Book(isbn = "978-1-234-56789-78", title = "Clean Code", nbPages = 255),
        Book(isbn = "978-2-234-56789-58", title = "The Pragmatic Programmer", nbPages = 500),
        Book(isbn = "978-3-234-56789-41", title = "Design Patterns", nbPages = 350),
        Book(isbn = "978-7-234-56789-87", title = "Refactoring", nbPages = 205),
        Book(isbn = "978-2-234-56789-4", title = "Head First Design Patterns", nbPages = 320),
        Book(isbn = "978-3-234-56789-245", title = "كورس كوتلن", nbPages = 280),
        Book(isbn = "978-8-234-56489-222", title = "أنماط تصميم", nbPages = 410),
        Book(isbn = "978-9-234-56789-100", title = "طريق إلى البرمجة", nbPages = 320),
        Book(isbn = "978-0-234-56789-240", title = "طريق إنشاء مشروع", nbPages = 350)
    )

    /**
     * TODO for Students (TP1 - Exercise 2):
     * Add 5 more books to the list above.
     * Choose books related to Computer Science, Programming, or any topic you like.
     * Remember to include complete information (ISBN, title, nbPages).
     *
     * Tip: You can find ISBN numbers for books on:
     * - Google Books
     * - Amazon
     * - GoodReads
     */

    /**
     * Get all books from the repository
     * @return List of all books
     */
    fun getAllBooks(): List<Book> {
        return booksList
    }

    /**
     * Get a book by ISBN
     * @param isbn The ISBN of the book to find
     * @return The book if found, null otherwise
     */
    fun getBookByIsbn(isbn: String): Book? {
        return booksList.find { it.isbn == isbn }
    }
}
