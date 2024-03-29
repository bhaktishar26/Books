package bookStore;

import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of books");
        int noOfBooks = scanner.nextInt();
        if (noOfBooks == 0) {
            System.out.println("N/A");
        } else {
            BookStore[] books = new BookStore[noOfBooks];
            scanner.nextLine().trim();
            for (int i = 0; i < noOfBooks; i++) {
                System.out.println("Enter book name");
                String bookName = scanner.nextLine().trim();
                System.out.println("Enter author name");
                String authorName = scanner.nextLine().trim();
                System.out.println("Enter ISBN");
                String isbn = scanner.nextLine().trim();
                books[i] = new BookStore(bookName, authorName, isbn);
            }
            for (int i = 0; i < books.length; i++) {
                System.out.println(books[i]);

            }
            scanner.close();

        }


    }

}


class BookStore {
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


