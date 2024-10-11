import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Ex4 {

    private static List<Book> books = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 1997);
        Book book2 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book4 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book5 = new Book("1984", "George Orwell", 1949);

        addToList(book1);
        addToList(book2);
        addToList(book3);
        addToList(book4);
        addToList(book5);

        useCompareTo();
        printList();

        System.out.println("--------------------------------------------------");
        // Teil zwei
        books = new ArrayList<>();

        addToList(book1);
        addToList(book2);
        addToList(book3);
        addToList(book4);
        addToList(book5);

        useCollectionsSort();
        printList();
        
    }

    private static void addToList(Book book) {
        books.add(book);
    }

    private static void useCompareTo() {
        for(int i = 0; i < books.size(); i++) {
            for(int j = i + 1; j < books.size(); j++) {
                if(books.get(i).compareTo(books.get(j)) > 0) {
                    Book temp = books.get(i);
                    books.set(i, books.get(j));
                    books.set(j, temp);
                }
            }
        }
    }

    private static void printList() {
        for (Book book : books) {
            System.out.println(book.getAuthor() + ": " + book.getTitle() + " (" + book.getPublicationYear() + ")");
        }
    }

    private static void useCollectionsSort() {
        Collections.sort(books);
    }

}
