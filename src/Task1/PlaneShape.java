package Task1;


import Task1.measurable.AreaMeasurable;
import Task1.measurable.PerimeterMeasurable;

public class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    protected double area;
    protected double perimeter;

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }
}
