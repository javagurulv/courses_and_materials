package student_aleksey_kodin.lessonx.bank_account.part_1_basic.task_15;

class BankAccount {
    private final Transaction[] transactions;
    private int creditLimit = 0;

    public BankAccount(Transaction[] transactions) {
        this.transactions = transactions;
    }

    public BankAccount(Transaction[] transactions, Integer creditLimit) {
        this.transactions = transactions;
        this.creditLimit = creditLimit;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
}
