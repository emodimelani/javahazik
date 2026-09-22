import java.util.Scanner;

public class circle {
    private double sugar;


    public circle(double sugar) {
        this.sugar = sugar;
    }

    public double kerulet() {
        return 2 * this.sugar * Math.PI;
    }

    public double terulet() {
        return this.sugar * this.sugar * Math.PI;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem, adja meg a kör sugarát: ");
        double r = scanner.nextDouble();

        circle c = new circle(r);

        System.out.println("A kör kerülete: " + c.kerulet());
        System.out.println("A kör területe: " + c.terulet());

        scanner.close();
    }
}