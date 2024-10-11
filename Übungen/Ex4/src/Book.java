public class Book implements Comparable<Book> {

    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public int compareTo(Book otherBook) {
        if (this.publicationYear < otherBook.publicationYear) {
            return -1;
        } else if (this.publicationYear > otherBook.publicationYear) {
            return 1;
        } else {
            return 0;
        }
    }

}
