package edu.fra.uas;

import edu.fra.uas.inheritance.Article;
import edu.fra.uas.inheritance.Book;
import edu.fra.uas.inheritance.CD;
import edu.fra.uas.inheritance.Camera;
import edu.fra.uas.inheritance.Cassette;

public class AppInheritance {

    public static void main(String[] args) throws Exception {
		AppInheritance app = new AppInheritance();
		app.createBook();
		//app.compatible();
        //app.articles();
    }

	public void createBook() {
		Book b = new Book(123, 10, "Tolkien", "Lord of the Rings");
		b.print();
	}

	public void compatible() {
		Article a = new Book(124, 21, "Tanenbaum", "Computer Networks");

		//System.out.println(a.code);
		//System.out.println(a.price);

		Book book = null;
		if(a instanceof Book) { // instanceof prüft zur Laufzeit, ob a ein Objekt der Klasse Book ist
			book = (Book)a;		// Typecast
		}
		if(book != null) {
			System.out.println(book.code);
			System.out.println(book.price);
			System.out.println(book.author);
			System.out.println(book.title);
		}
	}

	public void articles() {
		Article[] articles = new Article[5];
		articles[0] = new Book(123, 10, "Tolkien", "Lord of the Rings");
		articles[2] = new Book(124, 21, "Tanenbaum", "Computer Networks");
		articles[1] = new Cassette(2322, 12, 8, 78.43);
		articles[4] = new CD(555, 12, 25, "Heino");
		articles[3] = new Camera(765, 322, "Leica");
		printArticles(articles);
	}

	public void printArticles(Article[] articles) {
		for(Article article : articles) {
			if(article.available()) {
				article.print();
				System.out.println();	// new line
			}
		}
	}

}
