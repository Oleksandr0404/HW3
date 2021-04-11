package Task1.shapes3D;


import Task1.SpaceShape;
import Task1.Vertex;

public class SquarePyramid extends SpaceShape {
    double width;
    double height;

    public SquarePyramid(Vertex vertex, double width, double height) {
        vertexList.add(vertex);
        this.width = width;
        this.height = height;
        findArea();
        findVolume();
    }


    private void findArea() {
        double s = ((width / 2) * (width / 2)) + (height * height);
        this.area = ((2 * width * s) + (width * width)) * 4;
    }

    public void findVolume() {
        this.volume = ((width * width) * height) / 3;
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
        return "Shape: SquarePyramid\n"
                + "Vertex : x = " + vertexList.get(0).getX() + "\n"
                + "y = " + vertexList.get(0).getY() + "\n"
                + "Width = " + this.width + "\n"
                + "Height = " + this.height + "\n"
                + "Area = " + this.area + "\n"
                + "Volume = " + this.volume + "\n";
    }
}
