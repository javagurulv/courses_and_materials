package student_aleksey_kodin.lessonx.bank_account.part_2_expense_analyser.task_25;

class BankAccountMinBalanceFinder {

    public int find(BankAccount bankAccount) {
        int minBalance = 0;
        int currentTransaction = 0;
        Transaction[] transactions = bankAccount.getTransactions();

        for (Transaction simpleTransaction : transactions) {
            if (simpleTransaction.isDeposit()) {
                currentTransaction += simpleTransaction.getAmount();
            }
            if (simpleTransaction.isWithdrawal()) {
                currentTransaction -= simpleTransaction.getAmount();
            }
            if (currentTransaction < minBalance) {
                minBalance = currentTransaction;
            }
        }
        return minBalance;
    }
}
