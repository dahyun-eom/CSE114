//Dahyun Eom
//dahyun.eom@stonybrook.edu
public class SportsCar extends Car{


    private int maxSpeed;
    private int seconds;
    private boolean isConvertible;


    public SportsCar(String make, String model, int year, String color, String owner, int odometer, int numRepairs, int maxSpeed, int seconds, boolean isConvertible) {
        super(make, model, year, color, owner, odometer, numRepairs);
        this.maxSpeed = maxSpeed;
        this.seconds = seconds;
        this.isConvertible = isConvertible;
    }

    public boolean isSnazzy(){
        return maxSpeed > 150 && isConvertible ==true && (color=="red" || color == "purple"|| color=="yellow");
    }
    public static void main(String[] args) {
        SportsCar sportsCar1 = new SportsCar("Porche", "Cayman", 2022, "red", "Dahyun", 100000, 3, 200, 3, true);
        System.out.println("is sportsCar1 snazzy? :" + sportsCar1.isSnazzy());

        SportsCar sportsCar2 = new SportsCar("Porche", "Cayman", 2019, "green", "Jerry", 130000, 6, 190, 4, true);
        System.out.println("is sportsCar2 snazzy? :" + sportsCar2.isSnazzy());
        
    }
    
}
