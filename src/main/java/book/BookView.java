package book;

import java.util.List;

public class BookView {
    public void displayBook(BookDTO bookDTO){

        System.out.println(bookDTO);

    }
    public void displayBookList(List<BookDTO> bookDTOS){

        for (BookDTO bookDTO : bookDTOS) {
            System.out.println(bookDTO);
        }
    }
    public void displayMessage(String message){

        System.out.println(message);
    }
}