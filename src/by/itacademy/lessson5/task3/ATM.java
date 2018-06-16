package by.itacademy.lessson5.task3;

public abstract class ATM implements NumberNote, ShowAmount, ShowBankName {
    private int note20;
    private int note50;
    private int note100;
    private Addition addition = new Addition();
    private Withdraw withdraw = new Withdraw();

    @Override
    public void numberNotes() {
        System.out.println("notes \"100\" : " + this.note100);
        System.out.println("notes \"50\" : " + this.note50);
        System.out.println("notes \"20\" : " + this.note20);
    }

    @Override
    public void Amount() {
        System.out.println("ATM amount " + ((this.note20 * 20) + (this.note50 * 50) + (this.note100 * 100)));
    }

    public void addition(int amount) {
        if ((amount == 30 || amount % 10 != 0 || amount < 20)) System.out.println("error input");
        else {
            int note100 = addition.getNote100(amount);
            int note50 = addition.getNote50();
            this.note20 = addition.getNote20();
            this.note100 += note100;
            this.note50 += note50;
        }
    }

    public void withdrawal(int amount) {
        if (((amount == 30 || amount % 10 != 0 || amount < 20)) || (amount > (this.note20 * 20) + (this.note50 * 50) + (this.note100 * 100)))
            System.out.println("error input");
        else {
            int note100 = withdraw.getNote100(amount, this.note100);
            int note50 = withdraw.getNote50(this.note50);
            int note20 = withdraw.getNote20(this.note20);
            if (this.note100 >= note100 && this.note50 >= note50 && this.note20 >= note20) {
                this.note100 -= note100;
                this.note50 -= note50;
                this.note20 -= note20;
            } else System.out.println("not enough banknotes");
        }
    }
}
