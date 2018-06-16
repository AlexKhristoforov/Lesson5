package by.itacademy.lessson5.task1;

public class Square extends Figure {

    Square(float x) {
        super(x);
    }

    @Override
    public float calculationArea() {
        return (float) Math.pow(x, 2);
    }
}
