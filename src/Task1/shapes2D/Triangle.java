package Task1.shapes2D;


import Task1.PlaneShape;
import Task1.Vertex;

public class Triangle extends PlaneShape {
    public Triangle(Vertex vertex1, Vertex vertex2, Vertex vertex3) {
        vertexList.add(vertex1);
        vertexList.add(vertex2);
        vertexList.add(vertex3);
        findPerimeter();
        findArea();
    }

    private void findPerimeter() {
        double sideA = vertexList.get(0).getDistance(vertexList.get(1));
        double sideB = vertexList.get(1).getDistance(vertexList.get(2));
        double sideC = vertexList.get(2).getDistance(vertexList.get(0));

        this.perimeter = sideA + sideB + sideC;
    }

    private void findArea() {
        double sideA = vertexList.get(0).getDistance(vertexList.get(1));
        double sideB = vertexList.get(1).getDistance(vertexList.get(2));
        double sideC = vertexList.get(2).getDistance(vertexList.get(0));

        double halfPerimeter = perimeter / 2;

        this.area = Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));

    }

    @Override
    public String toString() {
        return "Shape: Triangle\n"
                + "Vertex 1: x = " + vertexList.get(0).getX() + "\n"
                + "y = " + vertexList.get(0).getY() + "\n"
                + "Vertex 2: x = " + vertexList.get(1).getX() + "\n"
                + "y = " + vertexList.get(1).getY() + "\n"
                + "Vertex 3: x = " + vertexList.get(2).getX() + "\n"
                + "y = " + vertexList.get(2).getY() + "\n"
                + "Area = " + this.area + "\n"
                + "Perimeter = " + this.perimeter + "\n";
    }
}
