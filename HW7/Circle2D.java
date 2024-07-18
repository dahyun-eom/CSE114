public class Circle2D {

    private double x;
    private double y;
    private double radius;

    /////////constructor////////////
    public Circle2D(){  //default constructor
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle2D(double x, double y, double radius){   
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    //////////getter & setter/////////////////

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getRadius(){
        return radius;
    }
    //////////////methods////////////////

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public boolean contains(double x, double y){
        double initX = this.x;
        double initY = this.y;

        return Math.sqrt(Math.pow((initX-x), 2) + Math.pow((initY-y), 2)) <= radius;  
    }

    public boolean contains (Circle2D circle){
        double initX = x;
        double initY = y;

        return Math.sqrt(Math.pow((initX-circle.x), 2) + Math.pow((initY-circle.y), 2))+circle.radius <= radius;
    }

    public boolean overlaps(Circle2D circle){
        double initX = this.x;
        double initY = this.y;

        return Math.sqrt(Math.pow((initX-circle.x), 2) + Math.pow((initY-circle.y), 2)) < radius + circle.radius;
    }
    
}
