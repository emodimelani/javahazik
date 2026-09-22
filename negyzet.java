import java.util.Scanner;

public class negyzet {
    private int oldal;

    public negyzet(int oldal) {
        this.oldal = oldal;
    }

    public int kerulet() {
        return 4 * this.oldal;
    }

    public int terulet() {
        return this.oldal * this.oldal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem a négyzet oldalának hosszát (egész szám): ");
        int a = scanner.nextInt();

        negyzet n = new negyzet(a);

        System.out.println("A négyzet kerülete: " + n.kerulet());
        System.out.println("A négyzet területe: " + n.terulet());

        scanner.close();
    }
}