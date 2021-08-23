package student_diana_miranovica.lesson_9.homeworks.day_5.task_28;

 class FraudRule5 extends FraudRules{

    public FraudRule5(String ruleName){
        super(ruleName);
    }

    public  boolean isFraud(Transaction t){
        return t.getTraderCountry().equals("Germany") && t.getAmount()>1000;
    }
}
