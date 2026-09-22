import java.util.Scanner;

public class gomb {
    private double sugar;

    public gomb(double sugar) {
        this.sugar = sugar;
    }

    public double felszin() {
        return 4.0 * Math.PI * Math.pow(this.sugar, 2);
    }

    public double terfogat() {
        return (4.0 / 3.0) * Math.PI * Math.pow(this.sugar, 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem, adja meg a gömb sugarát: ");
        double r = scanner.nextDouble();

        gomb g = new gomb(r);

        System.out.println("A gömb felszíne: " + g.felszin());
        System.out.println("A gömb térfogata: " + g.terfogat());

        scanner.close();
    }
}