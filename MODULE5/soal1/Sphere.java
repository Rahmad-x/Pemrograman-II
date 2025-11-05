package MODULE5.soal1;

public class Sphere extends Shape {
    private Double radius;

    public Sphere(Double radius) {
        super("Sphere");
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + " of radius " + radius;
    }
}