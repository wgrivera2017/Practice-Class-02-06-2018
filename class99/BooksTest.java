package class99;

public class BooksTest {

	public static void main(String[] args) {

		Books books1 = new Books("George Orwell", 1949, "9780451524935", 6.18 );

		System.out.println(books1.BAuthor);

		System.out.println(books1.BYP);

		System.out.println(books1.isbn);

		System.out.println(books1.bookprice);

		Books books2 = new Books("Lewis Carroll", 1865, "1503222683", 13.49);

		System.out.println(books2.BAuthor);

		System.out.println(books2.BYP);

		System.out.println(books2.isbn);

		System.out.println(books2.bookprice);




	}

}
