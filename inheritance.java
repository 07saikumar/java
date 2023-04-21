class vehicles{
    int noOfwheels;
    String fuelType;
    public void year(int year)
    {
        System.out.println("these are vehilces");
    }
    
}
class bike extends vehicles{
    bike(){
    noOfwheels=2;
    fuelType="petorl";
    
    int year=2023;
    }
    String engineType;
    public void year(int year)
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
    
    engineType="4 storke engine";
    }
    public void year(int year)
    {
        System.out.println("it has "+noOfwheels+" wheels and fuel type:"+fuelType);
        System.out.println("this is "+year+" model the engine type is: "+engineType);
    }
}

public class main{
    public static void main(String[] args){
        bike Bike = new bike();
        Bike.year(2023);
        sportsbike spb = new sportsbike();
        spb.year(2024);
    }
}
