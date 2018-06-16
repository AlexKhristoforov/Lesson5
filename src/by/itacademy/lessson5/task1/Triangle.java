package by.itacademy.lessson5.task1;

public class Triangle extends Figure {

    private float h;

    Triangle(float x, float h) {
        super(x);
        this.h = h;
    }

    @Override
    public float calculationArea() {
        return (x*h)/2;
    }
}
