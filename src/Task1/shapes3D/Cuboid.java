package Task1.shapes3D;

import Task1.SpaceShape;
import Task1.Vertex;

public class Cuboid extends SpaceShape {
    private double width;
    private double height;
    private double depth;

    public Cuboid(Vertex vertex, double width, double height, double depth) {
        vertexList.add(vertex);
        this.width = width;
        this.height = height;
        this.depth = depth;

        findArea();
        findVolume();
    }

    private void findArea() {
        this.area = (width + height + depth) * 2;
    }

    public void findVolume() {
        this.volume = width * height * depth;
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
        return "Shape: Cuboid\n"
                + "Vertex : x = " + vertexList.get(0).getX() + "\n"
                + "y = " + vertexList.get(0).getY() + "\n"
                + "Width = " + this.width + "\n"
                + "Height = " + this.height + "\n"
                + "Depth = " + this.depth + "\n"
                + "Area = " + this.area + "\n"
                + "Volume = " + this.volume + "\n";
    }
}
