package by.itacademy.lessson5.task3;

public class Main {
    public static void main(String[] args) {
        SingleATM exampleATM = new SingleATM("MTBank");

        exampleATM.addition(2170);
        exampleATM.numberNotes();
        exampleATM.Amount();
        exampleATM.withdrawal(850);
        exampleATM.numberNotes();
        exampleATM.Amount();
        exampleATM.showBankName();

    }
}

