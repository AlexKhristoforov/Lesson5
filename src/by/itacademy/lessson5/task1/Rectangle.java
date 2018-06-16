package by.itacademy.lessson5.task1;

public class Rectangle extends Figure {

    private float y;

    Rectangle(float x, float y) {
        super(x);
        this.y = y;
    }

    @Override
    public float calculationArea() {
        return x * y;
    }
}
