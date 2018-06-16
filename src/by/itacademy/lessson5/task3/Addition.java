package by.itacademy.lessson5.task3;


public class Addition {
    private int tempAmount;

    public int getNote100(int amount) {
        int notes = 0;
        if (amount >= 100 && amount % 100 != 10 && amount % 100 != 30)
            notes = (int) Math.ceil(amount / 100);
        tempAmount = amount - notes * 100;
        return notes;
    }

    public int getNote50() {
        int notes = (int) Math.ceil(tempAmount / 50);
        if (((tempAmount - notes * 50) == 10 || (tempAmount - notes * 50) % 30 == 0) && (tempAmount - notes * 50) % 50 != 0)
            notes--;
        tempAmount = tempAmount - notes * 50;
        return notes;
    }

    public int getNote20() {
        return (int) Math.ceil(tempAmount / 20);
    }

}
