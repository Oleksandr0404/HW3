package Task1;


import Task1.shapes2D.Circle;
import Task1.shapes2D.Rectangle;
import Task1.shapes2D.Triangle;
import Task1.shapes3D.Cuboid;
import Task1.shapes3D.Sphere;
import Task1.shapes3D.SquarePyramid;

public class Start {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Triangle(new Vertex(10.0, 11.0), new Vertex(12.0, 13.0), new Vertex(14.0, 25.0));
        shapes[1] = new Circle(new Vertex(1.0, 1.0), 5);
        shapes[2] = new Rectangle(new Vertex(2.0, 2.0), 10, 5);
        shapes[3] = new Sphere(new Vertex(3.0, 3.0, 3.0), 5);
        shapes[4] = new Cuboid(new Vertex(5.0, 5.0, 5.0), 10, 5, 5);
        shapes[5] = new SquarePyramid(new Vertex(1.0, 1.0, 1.0), 5, 6);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString());
        }
    }
}
