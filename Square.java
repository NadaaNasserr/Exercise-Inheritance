public class Square  extends Rectangle {



    public Square(){
    }
    public Square(double width){

        super(width);
    }

    public Square(String color, boolean filled, double width , double length) {
        super(color, filled, width , length);
    }

    public void setSide(double width) {

         super.setWidth(width);

    }
    public double getSide(){

    return super.getWidth();
    }

    @Override
    public String toString() {


        return super.toString();
    }
}
