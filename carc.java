public class car{
    String model;
    String colr;
    int year;
void car_info(String model,String color,int y)
{
    model=m;
    color=c;
    year=y;
    
}
String getmodel()
{
    return model;
}
String getcolor()
{
    return color;
}
int getyear()
{
    return year;
}
class Democar{
    public static void main(String [] args)
    {
        Car car1=new car1();
        Car car2=new car2();
        car1.CarInfo("Toyoto","Red","2020");
        car2.CarInfo("carpo","PINK","2030");
        System.out.println(car1.getmodel());
        System.out.println(car2.getyear());
    }
}
}
