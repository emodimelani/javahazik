import java.util.Scanner;
public class circle {

    private double radius;

    public circle(double radius) {
        this.radius= radius;

    }
    public double kerulet() {
        return 2*Math.PI*radius;

    }
    public double terulet() {
        return Math.PI*radius*radius;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kérem adja meg a kör sugarát: ");
        double radius= scanner.nextDouble();
        circle circle= new circle(radius);
        System.out.println("A kör sugarának a kerülete: "+circle.kerulet());
        System.out.println("A kör sugarának a területe: " + circle.terulet());
        scanner.close();
    }
}