import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       double pi=3.14;
       double r,a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter central angle:");
        a= scan.nextDouble();
        System.out.print("Enter radius:");
        r= scan.nextDouble();
        double area = (pi*(r*r)*a)/360;
        System.out.println("Area of circle:"+area);
    }
}