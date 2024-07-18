//Dahyun Eom
//dahyun.eom@stonybrook.edu
public class Car implements Comparable{

    protected String make;
    protected String model;
    protected int year;
    protected String color;
    protected String owner;
    protected int odometer;
    protected int numRepairs;


    public Car(String make, String model, int year, String color, String owner, int odometer, int numRepairs){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.owner = owner;
        this.odometer = odometer;
        this.numRepairs = numRepairs;
    }

    public String getOwner(){
        return owner;
    }

    public int getNumREpairs(){
        return numRepairs;
    }

    public void sellTo(String name){
        owner = name;           //----> no need for setOwer(...)
    }

    public void repair(){
        numRepairs++;           //---> no need foe setRepair(...)
    }

    public void travel(int miles){
        odometer += miles;
    }

    public boolean isRealiable(){
        return (double)numRepairs/(2023-year) <= 2;
    }

    public boolean isHighMilage(){
        return (double)odometer/(2023-year) > 12000;
    }

    public int compareTo(Object o) {
        if (((Car)o).make.compareTo(this.make) == 0){
            return ((Car)o).model.compareTo(this.model);
        }
        return ((Car)o).make.compareTo(this.make);
    }

    public String toString(){
        return make + ", " + model;
    }

    public static void swap( Car[] arr, int i, int j){
        Car temp = arr[i];
        arr [i] = arr[j];
        arr[j] = temp;

    }


    public static void main(String[] args) {
        Car car1 = new Car ("Kia", "Ray", 2008, "mint", "Dahyun", 20000, 3);
        Car car2 = new Car ("Hyundai", "Santafe", 2021, "white", "Taedong", 11000, 5);
        Car car3 = new Car ("Hyundai", "Palisade", 2021, "blue", "Sanghoon", 10000, 4);
        Car car4 = new Car ("Toyota", "Camry", 2016, "silver", "EJ", 45000, 12);
        Car car5 = new Car ("Ford", "Taurus", 2009, "black", "TD", 20780, 32);
        Car car6 = new Car ("Ford", "Explorer", 2013, "red", "Jerry", 30200, 5);
        Car car7 = new Car ("Chevy", "Malibu", 2014, "siler", "Jerry", 20400, 4);
        Car car8 = new Car ("Chevy", "Corvette", 2016, "white", "Tom", 194000, 3);
        
        

        ///////////////test cases for compareTo method///////////////////////////

        Car[] arrayOfCars = {car1, car2, car3, car4};
        Car[] arrayOfCars2 = {car5, car6, car7, car8};

        ////////before sorting arrayofCars/////////////////////////
        System.out.println("before sorting arrayofCars");
        for (int p=0; p<arrayOfCars.length; p++){
            System.out.println(arrayOfCars[p].toString());
        }

        for (int i=0; i<arrayOfCars.length; i++){
            for (int j=i+1; j<arrayOfCars.length; j++){
                if (arrayOfCars[i].compareTo(arrayOfCars[j]) < 0){
                    swap(arrayOfCars, i, j);
                }
            }            
        }
        System.out.println();
        System.out.println();
        ////////after sorting arrayofCars/////////////////////////
        System.out.println("after sorting arrayofCars");
        for (int h=0; h<arrayOfCars.length; h++){
            System.out.println(arrayOfCars[h].toString());
        }

        System.out.println();
        System.out.println();


        ///////////before sorting arrayofCars2////////////////////
        System.out.println("before sorting arrayofCars2");
        for (int p=0; p<arrayOfCars2.length; p++){
            System.out.println(arrayOfCars2[p].toString());
        }

        for (int i=0; i<arrayOfCars2.length; i++){
            for (int j=i+1; j<arrayOfCars2.length; j++){
                if (arrayOfCars2[i].compareTo(arrayOfCars2[j]) < 0){
                    swap(arrayOfCars2, i, j);
                }
            }            
        }
        System.out.println();
        System.out.println();

        ////////after sorting arrayofCars2/////////////////////////
        System.out.println("after sorting arrayofCars2");
        for (int h=0; h<arrayOfCars2.length; h++){
            System.out.println(arrayOfCars2[h].toString());
        }

        System.out.println();
        System.out.println();



        ///////tests for sellTo()//////////////////////
        System.out.println("The owner of car6 is " + car2.getOwner());
        car2.sellTo("Dahyun");
        System.out.println("Now, the owner of car6 is " + car2.getOwner());

        System.out.println("The owner of car6 is " + car6.getOwner());
        car6.sellTo("Amy");
        System.out.println("Now, the owner of car6 is " + car6.getOwner());
        

        ///////////tests for repair()/////////////
        System.out.println("car1's total number of repairs: " + car1.getNumREpairs());
        car1.repair();
        car1.repair();
        car1.repair();
        System.out.println("car1's total number of repairs after additional 3 times of repair: " + car1.getNumREpairs());

        System.out.println("car5's total number of repairs: " + car5.getNumREpairs());
        car5.repair();
        car5.repair();
        car5.repair();
        System.out.println("car5's total number of repairs after additional 3 times of repair: " + car5.getNumREpairs());

        
        ////// tests for travel() & isHighMilage()////////////////

        car3.travel(400);
        System.out.println("is car3 high milage? :" + car3.isHighMilage());
        
        car8.travel(300);
        System.out.println("is car8 high milage? :" + car8.isHighMilage());

        ////////tests for isRealiable()///////////////

        System.out.println("is car5 reliable? :" + car5.isRealiable());
        System.out.println("is car8 reliable? :" + car8.isRealiable());


    }
}