package lv.rvt;

class Book {
    String title;
    int pages;
    int year;

    // Constructor to initialize the book details
    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    // Method to return the book information as a string
    public String getBookInfo() {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }
}