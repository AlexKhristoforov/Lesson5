package by.itacademy.lessson5.task1;

public abstract class Figure {

    final double PI = 3.14;
    float x;

    Figure(float x) {
        this.x = x;
    }

    public abstract float calculationArea();
}
