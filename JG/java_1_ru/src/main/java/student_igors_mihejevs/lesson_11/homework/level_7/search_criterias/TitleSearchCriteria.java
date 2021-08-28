package student_igors_mihejevs.lesson_11.homework.level_7.search_criterias;

import student_igors_mihejevs.lesson_11.homework.level_7.domain.Book;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TitleSearchCriteria implements SearchCriteria {

    private final String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getTitle().equals(this.titleToSearch);
    }

}