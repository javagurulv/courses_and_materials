package student_igors_mihejevs.lesson_9.homework.level_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class FraudRule {
    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

    String getRuleName() {
        return ruleName;
    }
}
