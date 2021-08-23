package student_igors_mihejevs.lesson_11.homework.level_7.search_criterias;

import student_igors_mihejevs.lesson_11.homework.level_7.domain.Book;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AndSearchCriteria implements SearchCriteria {

    private final SearchCriteria leftCondition;
    private final SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        return (this.leftCondition.match(book)) && (this.rightCondition.match(book));
    }

}
