// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Shape sh1 = new Shape();
        Shape sh2 = new Shape("green" , true);


        System.out.println("--Circle--");

        Circle c1 =new Circle();
        Circle c2 =new Circle(8);
        Circle c3 =new Circle("green" , true ,8);
        System.out.println(c3.toString());
        System.out.println("Area of the Circle " + c3.getArea());
        System.out.println("Perimeter of the Circle " +c3.getPerimeter());


        System.out.println("--Rectangle--");

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10.0,5.0);
        Rectangle r3 = new Rectangle("green" , true , 10.0 ,5.0);
        System.out.println("Area of the rectangle " + r3.getWidth() + " x " + r3.getLength() + " = " + r3.getArea());
        System.out.println("Perimeter of the rectangle " + r3.getPerimeter());
        System.out.println(r3.toString());


        System.out.println("--Square--");

        Square s1 = new Square();
        Square s2 = new Square(6);
        Square s3 = new Square("green" , true , 9 , 9);
        System.out.println("Area of the Square " + s3.getWidth() + " x " + s3.getLength() + " = " + s3.getArea());
        System.out.println(s3.toString());






    }
}