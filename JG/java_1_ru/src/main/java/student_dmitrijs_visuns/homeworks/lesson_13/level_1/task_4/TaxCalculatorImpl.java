package student_dmitrijs_visuns.homeworks.lesson_13.level_1.task_4;

import java.math.BigDecimal;

public class TaxCalculatorImpl implements TaxCalculator {

    @Override
        public BigDecimal calculateTax(BigDecimal income) {
            return income.multiply(new BigDecimal("0.25"));
        }



}


