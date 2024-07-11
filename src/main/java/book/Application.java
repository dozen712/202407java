package book;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookController bc = new BookController();
        while(true) {
            System.out.println("1. 도서를 추가");
            System.out.println("2. ISBN으로 도서를 조회");
            System.out.println("3. ISBN으로 도서를 전체조회");
            System.out.println("4. 도서를 수정");
            System.out.println("5. 도서를 삭제");
            System.out.println("6. 종료");
            System.out.print("원하시는 기능의 번호를 입력해주세요:");

            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1:
                    System.out.print("도서 이름:");
                    String title = sc.nextLine();
                    System.out.print("도서 저자:");
                    String author = sc.nextLine();
                    System.out.print("ISBN 입력:");
                    int isbn = sc.nextInt();
                    System.out.print("해외서적여부?(true/false):");
                    boolean isForeignBook = sc.nextBoolean();
                    bc.addBook(title, author, isbn, isForeignBook);
                    break;
                case 2:
                    System.out.print("ISBN 입력:");
                    isbn = sc.nextInt();
                    bc.getBook(isbn);
                    break;
                case 3:
                    List<BookDTO> allBookDTOS = bc.getAllBooks();
                    if (allBookDTOS.isEmpty()) {
                        System.out.println("등록된 도서가 없습니다.");
                    } else {
                        System.out.println("전체 도서 목록:");
                        for (BookDTO b : allBookDTOS) {
                            System.out.println("ISBN:" + b.getIsbn() + ",제목:" + b.getTitle() + ",저자:" + b.getAuthor());
                        }
                    }
                    break;

                case 4:
                    System.out.print("ISBN 입력:");
                    isbn = sc.nextInt();
                    sc.nextLine();
                    System.out.print("수정할 제목 입력:");
                    String title1 =sc.nextLine();
                    bc.updateBook(isbn,title1);
                    break;
                case 5:
                    System.out.print("삭제할 ISBN 입력:");
                    isbn = sc.nextInt();
                    bc.deleteBook(isbn);
                    break;
                case 6:
                    System.out.print("종료되었습니다.");
                    return;



            }
        }
    }
}
