import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("-----------------------------------");
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("-----------------------------------");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("-----------------------------------");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println("-----------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter width of rectangle:");
        double width = scan.nextDouble();
        System.out.println("Enter height of rectangle:");
        double height = scan.nextDouble();
        System.out.println("Rectangle area: " + String.format("%.5f",area(width,height)));
        System.out.println("-----------------------------------");
        System.out.println("Enter radius of circle:");
        double rad = scan.nextDouble();
        System.out.println("Circle area: " + String.format("%.5f",area(rad)));
    }


    public static boolean shouldWakeUp(boolean isBark, int time) {

        if (time < 0 || time > 23) return false;
        if (!isBark) return false;
        return time < 8 || time >= 20;

    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        return age1 > 13 && age1 <= 19 || age2 > 13 && age2 <= 19 || age3 > 13 && age3 <= 19;


    }
public static boolean isCatPlaying(boolean season, int temp) {

    if (!season) return temp >= 25 && temp <= 35;
 else return temp >= 25 && temp <= 45 ;

}

public static double area(double x, double y){

if (x <=0 || y <=0) {
    System.out.println("Values must be greater then 0 (zero)!");
    return -1;

}
 return x*y;
}

    public static double area(double r){

        if (r <=0) {
            System.out.println("Value must be greater then 0 (zero)!");
            return -1;

        }
        return r*r*Math.PI;
    }

}