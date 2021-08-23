package lesson_10.core.requests;

public class FindBookByTitleRequest {

    private String bookTitle;

    public FindBookByTitleRequest(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

}
