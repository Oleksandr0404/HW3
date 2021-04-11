package Task1;


import Task1.measurable.AreaMeasurable;
import Task1.measurable.VolumeMeasurable;

public class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    protected double area;
    protected double volume;

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getVolume() {
        return volume;
    }
}
