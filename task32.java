class Book {
    int bookId;
    String title;
    String author;
    Book(int bookId, String title) {
        this(bookId, title, "Unknown Author");
    }
    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
class task32 {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java");
        Book b2 = new Book(102, "Python", "James");
        b1.displayBook();
        b2.displayBook();
    }
}