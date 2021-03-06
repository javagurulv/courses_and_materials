package student_dmitrijs_visuns.homeworks.lesson_14.level_6.task_36;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldFindMinValue300 () {
        TransactionAnalysisService testService = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        OptionalInt result = testService.findMinTransactionValue(testData.getTransactions());
        assertTrue (OptionalInt.of(300).equals(result));
    }

    @Test
    public void shouldReturnEmptyOptional () {
        TransactionAnalysisService testService = new TransactionAnalysisService();
        List<Transaction> testData = new ArrayList<>();

        OptionalInt result = testService.findMaxTransactionValue(testData);
        assertTrue (result.isEmpty());
    }

}