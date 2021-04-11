package Task1.shapes2D;

import Task1.PlaneShape;
import Task1.Vertex;

public class Circle extends PlaneShape {
    double radius;

    public Circle(Vertex vertex, double radius) {
        vertexList.add(vertex);
        this.radius = radius;
        findArea();
        findPerimeter();
    }

    private void findPerimeter() {
        this.perimeter = 2 * Math.PI * radius;
    }

    private void findArea() {
        this.area = Math.PI * Math.pow(radius, 2);

    }

    @Override
    public String toString() {
        return "Shape: Circle\n"
                + "Vertex : x = " + vertexList.get(0).getX() + "\n"
                + "y = " + vertexList.get(0).getY() + "\n"
                + "Area = " + this.area + "\n"
                + "Perimeter = " + this.perimeter + "\n";
    }
}
