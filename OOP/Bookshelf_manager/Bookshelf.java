package project.testing.bank.package2;

import java.util.Scanner;

public class Bookshelf {

    private Book[] books = new Book[10];
    private int bookCoutner = 0;


    public void searchBook(String matchedBook){
        int counter = 0;
        for(int i = 0;i<bookCoutner;i++){
            if(matchedBook.equalsIgnoreCase(books[i].getTitle())){
                counter++;
                System.out.println(matchedBook +" " + "Exists in the warehouse");
            }
        }
        if(counter <=0){
            System.out.println("There's no such book" + " \"" + matchedBook + "\"");

        }
        else{
            System.out.println("In total there are " + counter +  " " +  "of the books you searched" );
        }





    }
    public void addBook(Book book){
        books[bookCoutner] = book;
        bookCoutner++;
        System.out.println("The book with " +  book.getAuthor() + " "  +  book.getGenre() + " " +  book.getTitle() +
                " Has been added.");
    }

    public void displayBooks() {
        for (int i = 0; i < bookCoutner; i++) {
            Book currentBook = books[i];
            System.out.println("Title: " + currentBook.getTitle() + ", Author: "
                    + currentBook.getAuthor() + ", Genre: " + currentBook.getGenre());

        }
    }

        public void replaceBook (Book book) {
            for (int i = 0; i < bookCoutner; i++) {
                if (book.equals(books[i])) {
                    books[i].blankFields();
                }
            }
            editBook(book);
        }

        private void editBook(Book book){
        Scanner console = new Scanner(System.in);
        book.setTitle(console.nextLine());
        book.setAuthor(console.nextLine());
        book.setGenre(console.nextLine());

        }

    public void deleteBook(Book bookToDelete) {
        int indextodelete = 0;
        for(int i = 0;i<bookCoutner;i++){
            if(bookToDelete.equals(books[i])){
                indextodelete = i;
                books[indextodelete] = null;
            }

        }
        for(int i = indextodelete  ;i <bookCoutner -1;i++){
            books[i] = books[i+1];
        }
        bookCoutner--;
        System.out.println(bookToDelete.getTitle() + " Has been deleted");



    }


}
