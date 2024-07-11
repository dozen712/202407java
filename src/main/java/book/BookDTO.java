package book;

import java.util.Objects;

public class BookDTO {
    private String title;
    private String author;
    private int isbn;
    private boolean isForeBook;

    public BookDTO() {
    }

    public BookDTO(String title, String author, int isbn, boolean isForeBook) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isForeBook = isForeBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public boolean isForeBook() {
        return isForeBook;
    }

    public void setForeBook(boolean foreBook) {
        isForeBook = foreBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDTO bookDTO = (BookDTO) o;
        return isbn == bookDTO.isbn && isForeBook == bookDTO.isForeBook && Objects.equals(title, bookDTO.title) && Objects.equals(author, bookDTO.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, isbn, isForeBook);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", isForeBook=" + isForeBook +
                '}';
    }
}
