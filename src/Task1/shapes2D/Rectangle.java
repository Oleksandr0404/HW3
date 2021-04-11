package Task1.shapes2D;


import Task1.PlaneShape;
import Task1.Vertex;

public class Rectangle extends PlaneShape {
    double width;
    double height;

    public Rectangle(Vertex vertex, double width, double height) {
        vertexList.add(vertex);
        this.width = width;
        this.height = height;
        findArea();
        findPerimeter();
    }

    private void findPerimeter() {
        this.perimeter = width * 2 + height * 2;
    }

    private void findArea() {
        this.area = width * height;

    }

    @Override
    public String toString() {
        return "Shape: Rectangle\n"
                + "Vertex : x = " + vertexList.get(0).getX() + "\n"
                + "y = " + vertexList.get(0).getY() + "\n"
                + "Width = " + this.width + "\n"
                + "Height = " + this.height + "\n"
                + "Area = " + this.area + "\n"
                + "Perimeter = " + this.perimeter + "\n";
    }
}
