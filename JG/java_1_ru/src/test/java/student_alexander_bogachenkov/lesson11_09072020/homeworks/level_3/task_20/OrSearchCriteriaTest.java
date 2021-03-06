package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_3.task_20;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrSearchCriteriaTest {

    @Test
    public void shouldReturnTrue_whenBookFullyMatches() {
        OrSearchCriteria criteria = new OrSearchCriteria(new AuthorSearchCriteria("Robert Martin"),
                                                            new TitleSearchCriteria("Clean Code"));
        boolean actual = criteria.match(new Book("Robert Martin", "Clean Code", "2009"));
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrue_whenBookPartiallyMatches() {
        OrSearchCriteria criteria = new OrSearchCriteria(new AuthorSearchCriteria("Robert Martin"),
                new TitleSearchCriteria("Clean Code"));
        boolean actual = criteria.match(new Book("Robert Martin", "Clear Code", "2009"));
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenBookDoesNotMatch() {
        OrSearchCriteria criteria = new OrSearchCriteria(new AuthorSearchCriteria("Robert Martin"),
                new TitleSearchCriteria("Clean Code"));
        boolean actual = criteria.match(new Book("Martin Robert", "Clear Code", "2009"));
        boolean expected = false;
        assertEquals(expected, actual);
    }
}