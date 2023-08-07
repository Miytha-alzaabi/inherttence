public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name ="lily";
        a.color = "white";
        a.type ="cats";
        a.speed =10;
        a.age = 2;
        System.out.println(a.name);
        System.out.println(a.color);
        System.out.println(a.speed);
        System.out.println(a.age);
        double s =  a.speedCal();
        System.out.println(s);

    }
}
class Animal extends Cats
{
    //    String name;
//    String color;
    String type;

}
class Cats
{
    String name;
    String color;
    double speed;
    int age;
    double speedCal()
    {
        speed = speed - age;
        return speed;

    }

}