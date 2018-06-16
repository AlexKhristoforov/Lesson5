package by.itacademy.lessson5.task3;

public class SingleATM extends ATM {
    private String bankName;

    public SingleATM(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void showBankName() {
        System.out.println("BankName : " + bankName);
    }
}
