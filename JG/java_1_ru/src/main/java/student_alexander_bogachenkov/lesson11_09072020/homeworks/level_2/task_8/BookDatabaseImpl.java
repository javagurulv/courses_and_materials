package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_2.task_8;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements BookDatabase {

    private final List<Book> books = new ArrayList<>();
    private long lastId = 0;

    @Override
    public Long save(Book book) {
        long id = nextId();
        book.setId(id);
        this.books.add(book);
        return id;
    }

    @Override
    public boolean delete(Long bookId) {
        if (hasTheSameId(bookId)) {
            for (Book book : books) {
                if (book.getId().equals(bookId)) {
                    books.remove(book);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        if (hasTheSameBook(book)) {
            books.remove(book);
            return true;
        } else {
            return false;
        }
    }

    private Long nextId() {
        return ++lastId;
    }

    private boolean hasTheSameId(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasTheSameBook(Book book) {
        for (Book value : books) {
            if (value.equals(book)) {
                return true;
            }
        }
        return false;
    }

}
