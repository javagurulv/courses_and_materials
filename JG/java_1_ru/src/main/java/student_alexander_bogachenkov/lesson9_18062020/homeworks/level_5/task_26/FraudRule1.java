package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_5.task_26;

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTraderFullName().equals("Pokemon");
    }

}