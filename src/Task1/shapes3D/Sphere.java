package Task1.shapes3D;


import Task1.SpaceShape;
import Task1.Vertex;

public class Sphere extends SpaceShape {
    double radius;

    public Sphere(Vertex vertex, double radius) {
        vertexList.add(vertex);
        this.radius = radius;
        findArea();
        findVolume();
    }

    private void findArea() {
        this.area = Math.PI * 4 * Math.pow(radius, 2);
    }

    private void findVolume() {
        this.volume = (Math.PI * 4 * Math.pow(radius, 3)) / 3;

    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Shape: Sphere\n"
                + "Vertex : x = " + vertexList.get(0).getX() + "\n"
                + "y = " + vertexList.get(0).getY() + "\n"
                + "Area = " + this.area + "\n"
                + "Volume = " + this.volume + "\n";
    }
}
