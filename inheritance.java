class vehicles{
    int noOfwheels;
    String fuelType;
    protected void year1()
    {
        System.out.println("these are vehilces");
    }
    
}
class bike extends vehicles{
    bike(){
    noOfwheels=2;
    fuelType="petorl";
    year1();
    year1();
    year1();
    int year=2023;
    }
    String engineType;
    public void years(int year)
    {
        System.out.println("it has "+noOfwheels+" wheels and fuel type:"+fuelType);
        System.out.println("this is "+year+" model");
    }
    
}
class sportsbike extends bike{
    sportsbike(){
    noOfwheels=2;
    fuelType="petorl";
    int year=2024;
    year1();
    year1();
    year1();
    String engineType="4 storke engine";
    }
    public void year(int year)
    {
        System.out.println("it has "+noOfwheels+" wheels and fuel type:"+fuelType);
        System.out.println("this is "+year+" model the engine type is: "+engineType);
    }
    
}
class nakedbikes extends sportsbike{
    nakedbikes()
    {
    year1();
    year1();
    year1();
    }
    
    void display(){
    System.out.println("this is naked bikes");
    }
}
class vintagebieks extends nakedbikes
{
    vintagebieks()
    {
        year1();
    year1();
    year1();
    }
    void display1(){
        System.out.println("this is vintage bikes");
    }
}


public class main{
    public static void main(String[] args){
       
        // sportsbike spb = new sportsbike();
        vintagebieks spb = new vintagebieks();
        spb.display();
        spb.year(2024);
        spb.years(2024);
        spb.year1();
        spb.display1();
    }
}
