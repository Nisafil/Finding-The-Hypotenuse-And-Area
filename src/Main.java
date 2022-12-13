import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        double c,u,perimeter,area;
        Scanner input = new Scanner (System.in);

        System.out.print("Write The Length Of The First Side :");
        a = input.nextInt();
        System.out.print("Write The Length Of The Second Side :");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("The Hypotenuse : " + c);

        //Area Calculation
        u = (a+b+c)/2;
        perimeter = 2*u;
        System.out.println("Perimeter Of The Triangle : " + perimeter);
        area = Math.sqrt((u*(u-a)*(u-b)*(u-c)));
        System.out.print("Area Of The Triangle : " + area);

    }
}