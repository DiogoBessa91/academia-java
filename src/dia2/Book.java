package dia2;

public class Book {
	
	static String isbn;
	
	public Book(String isbn) {
		super();
		this.isbn = isbn;
	}

	public static void main(String[] args) {
		Book book1 = new Book("s");
		Book book2 = new Book("s");
		
		System.out.println(book1.equals(book2));
	}
	
	@Override
	public boolean equals(Object book2) {
		
		if (this == book2)
			return true;
		
		if (book2 == null)
			return false;
		
		if (getClass() != book2.getClass())
			return false;
		
		Book other = (Book) book2;
		
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

}
