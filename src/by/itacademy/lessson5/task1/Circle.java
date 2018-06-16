package by.itacademy.lessson5.task1;

public class Circle extends Figure {

    public Circle(float x) {
        super(x);
    }

    @Override
    public float calculationArea() {
        return (float) (PI * Math.pow(x, 2));
    }
}
