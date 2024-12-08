import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Shape3DInterface[] shapes = new Shape3DInterface[10];

        for (int i = 0; i < shapes.length; i++) {
            int shapeType = random.nextInt(3);
            switch (shapeType) {
                case 0: // Sphere
                    double radius = 1 + random.nextDouble() * 9;
                    shapes[i] = new Sphere(radius);
                    break;
                case 1: // Cylinder
                    double cylRadius = 1 + random.nextDouble() * 9;
                    double height = 5 + random.nextDouble() * 15;
                    shapes[i] = new Cylinder(cylRadius, height);
                    break;
                case 2: // Cube
                    double side = 1 + random.nextDouble() * 9;
                    shapes[i] = new Cube(side);
                    break;
            }
        }

        for (Shape3DInterface shape : shapes) {
            System.out.println(shape);
            System.out.printf("Surface Area: %.2f%n", shape.surfaceArea());
            System.out.printf("Volume: %.2f%n%n", shape.volume());
        }
    }
}
