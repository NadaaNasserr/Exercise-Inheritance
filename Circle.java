public class Circle extends Shape {

    private double radius = 1.0;

    public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {


        this.radius = radius;
    }

    public double getArea(){

        return Math.PI * (radius/2) * (radius/2);
    }
    public double getPerimeter(){

        return Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}' + super.toString();
    }
}

