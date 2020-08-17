package student_diana_miranovica.lesson_9.homeworks.day_4.task_19;


public class FraudDetector {

    boolean isFraud(Transaction transaction) {
        if (transaction.getFullNameFromTrader().equals("Pokemon")) {
            return true;
        } else if (transaction.getAmount() >1000000) {
            return true;
        }else if (transaction.getTraderCity().equals("Sydney")){
            return true;
        }else {
            return false;
        }
    }
}
