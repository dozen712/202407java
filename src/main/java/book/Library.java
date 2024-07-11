package book;

import java.util.ArrayList;

public class Library {
    private ArrayList<BookDTO> bookDTOS;

    public Library() {
        bookDTOS =new ArrayList<>();
    }
    public void addBook(String title, String author, int isbn, boolean isForBook){

        BookDTO bookDTO = new BookDTO(title,author,isbn,isForBook);
        bookDTOS.add(bookDTO);
    }

    public BookDTO getBook(int isbn){

        for (int i = 0; i < bookDTOS.size(); i++) {
            BookDTO bookDTO = bookDTOS.get(i);
            if (bookDTO.getIsbn() == isbn) {
                return bookDTO;
            }
        }
        return null;

    }

    public BookDTO updateBook(int isbn, String title1) {
        for(int i = 0; i< bookDTOS.size(); i++){
            BookDTO bookDTO = bookDTOS.get(i);
            if(bookDTO.getIsbn() ==isbn){
                bookDTOS.get(i).setTitle(title1);
                return bookDTOS.get(i);
            }

        }
        return null;
    }

    public boolean deleteBook(int isbn){

        for(int i = 0; i< bookDTOS.size(); i++){
            if(bookDTOS.get(i).getIsbn()==isbn){
                bookDTOS.remove(i);
                return true;
            }

        }
        return false;
    }
    public ArrayList<BookDTO> getAllBooks(){
        return bookDTOS;
    }

}