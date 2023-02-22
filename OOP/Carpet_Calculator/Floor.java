package project.testing;

public class Floor {

    private double width;
    private double length;



    public Floor(double width, double length){
        this.width = width;
        this.length = length;
        if(width <=0){
            this.width = 0;
        }
        else if(length <=0){
            this.length = 0;
        }
    }


    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        double area = width*length;
        return area;
    }
}
