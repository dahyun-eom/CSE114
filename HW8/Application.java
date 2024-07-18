//Dahyun Eom
//dahyun.eom@stonybrook.edu
public class Application {
    private int id;
    private String name;
    private String addr;
    private String city;
    private String state;
    private String zipcode;
    private String phoneNumber;
    private String intendedMajor;
    private double gpa;
    private String scholarship;
    

    public Application(int id, String name, String addr, String city, String state, String zipcode, String phoneNumber, String intendedMajor, double gpa, String scholarship){

        this.id = id;
        this.name = name;
        this.addr = addr;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phoneNumber = phoneNumber;
        this.intendedMajor = intendedMajor;
        this.gpa = gpa;
        this.scholarship = scholarship;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAddr(){
        return addr;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getZipcode(){
        return zipcode;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getIntendedMajor(){
        return intendedMajor;
    }
    public double getGpa(){
        return gpa;
    }
    public String getScholarship(){
        return scholarship;
    }

}