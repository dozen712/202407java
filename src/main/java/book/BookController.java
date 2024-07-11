package book;

import java.util.ArrayList;

public class BookController {

    private Library library = new Library();
    private BookView bookView =new BookView();
    public void addBook(String title, String author, int isbn, boolean isForBook){
        library.addBook(title, author, isbn, isForBook);
        bookView.displayMessage("도서가 추가 되었습니다.");
    }

    public void getBook(int isbn){
        BookDTO bookDTO = library.getBook(isbn);
        if(bookDTO !=null){
            bookView.displayBook(bookDTO);
        }else{
            bookView.displayMessage("일치하는게 없습니다.");
        }
    }
    public void updateBook(int isbn, String title1) {
        BookDTO bookDTO =library.updateBook(isbn, title1);
        if(bookDTO !=null){
            bookView.displayBook(bookDTO);
        }else{
            bookView.displayMessage("일치하는게 없습니다.");
        }
    }
    public void deleteBook(int isbn){

        Boolean isDelete =library.deleteBook(isbn);
        if(isDelete){
            bookView.displayMessage("삭제하는데 성공");
        }else{
            bookView.displayMessage("일치하는게 없습니다.");
        }
    }
    public ArrayList<BookDTO> getAllBooks(){
        return library.getAllBooks();

    }

}