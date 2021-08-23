package electronic_library.core.requests.book;

public class DeleteBookByAuthorRequest {

    private String bookAuthor;

    public DeleteBookByAuthorRequest(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }
}
