//Dahyun Eom
//dahyun.eom@stonybrook.edu

public class PassengerCar extends Car {
    public int numPassengers;
    private int numDoors;
    private String transmissionType;

    public PassengerCar(String make, String model, int year, String color, String owner, int odometer, int numRepairs, int numPassengers, int numDoors, String transmissionType){
        super(make, model, year, color, owner, odometer, numRepairs);
        this.numPassengers = numPassengers;
        this.numDoors = numDoors;
        this.transmissionType = transmissionType;
    }

    public boolean isComfortable(){
        return (numPassengers>=4) && (numDoors>=4) && (2023-year<=7);
    }

    public boolean isHardToDrive(){
        return transmissionType.equals("manual");
    }

    public static void main(String[] args){

        PassengerCar passengerCar1 = new PassengerCar("Kia", "Carnival", 2008, "mint", "Dahyun", 2000, 3, 8, 4, "manual");
        System.out.println("is passengerCar1 comfortable? :"+ passengerCar1.isComfortable());
        System.out.println("is passengerCar1 hard to drive? :"+ passengerCar1.isHardToDrive());

        System.out.println();
        System.out.println();
        
        PassengerCar passengerCar2 = new PassengerCar("Hyundai", "Santafe", 2021, "white", "Taedong", 11000, 5, 5, 4, "automatic");
        System.out.println("is passengerCar2 comfortable? :" + passengerCar2.isComfortable());
        System.out.println("is passengerCar2 hard to drive? :" + passengerCar2.isHardToDrive());
    }

    
}
