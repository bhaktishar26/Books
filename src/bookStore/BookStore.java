package bookStore;

public class BookStore {
    private String bookName;
    private String authorName;
    private String isbn;

    public String getBookName() {
        return bookName;
    }

    public void setBookName() {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName() {
        this.authorName = authorName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn() {
        this.isbn = isbn;
    }

    public String toString() {
        return "-----------------------------\n" +
                "Book Name:\t" + getBookName() + "\n" +
                "AuthorName:\t" + getAuthorName() + "\n" +
                "ISBN:\t" + getIsbn() + "\n-----------------------------";
    }

    public BookStore(String bookName, String authorName, String isbn) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbn = isbn;
    }
}


class Books {
    public static void main(String[] args) {

    }

}





