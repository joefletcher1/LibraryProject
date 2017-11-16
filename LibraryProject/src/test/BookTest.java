package test;
import main.Book;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class BookTest {

	private Book book;

	@Before
	public void instantantiateBook(){
		book = new Book();
	}

	@Test
	public void emptyBookAuthorIsNull() {
		assertNull(book.getAuthor());
	}

	@Test
	public void setAuthorTest() {
		book.setAuthor("Example");
		assertEquals("Example", book.getAuthor());
	}

}
