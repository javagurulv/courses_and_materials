package student_vadims_vladisevs.lesson_11.level_2.task_10;

import java.util.List;

class BookDatabaseDemo {
    public static void main(String[] args) {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades");
        Book secondBook = new Book("William Golding", "Lord of the Flies");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        List<Book> listByAuthor = bookDatabase.findByAuthor("Erich Maria Remarque");


        for (Book book : listByAuthor){
            System.out.println("[" + book.getId() + "] " +
                    book.getAuthor() + " [" + book.getTitle() + "]");
        }
    }
}
