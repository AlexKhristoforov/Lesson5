package by.itacademy.lessson5.task3;


public class Withdraw implements Withdrawal {
    private int tempAmount;

    @Override
    public int getNote100(int amount, int note100) {
        int numberNote = (int) Math.ceil(amount / 100);
        if (((amount - numberNote * 100) == 10 || (amount - numberNote * 100) == 30)) numberNote--;
        if (numberNote > note100) numberNote = 0;
        tempAmount = amount - numberNote * 100;
        return numberNote;
    }

    @Override
    public int getNote50(int note50) {
        int numberNote = (int) Math.ceil(tempAmount / 50);
        if (((tempAmount - numberNote * 50) == 10 || (tempAmount - numberNote * 50) % 30 == 0) && (tempAmount - numberNote * 50) % 50 != 0)
            numberNote--;
        if (note50 < numberNote) numberNote = 0;
        tempAmount = tempAmount - numberNote * 50;
        return numberNote;
    }

    @Override
    public int getNote20(int note20) {
        return (int) Math.ceil(tempAmount / 20);

    }

}
