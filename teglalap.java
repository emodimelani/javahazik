import java.util.Scanner;

public class teglalap {
    private int a;
    private int b;

    public teglalap(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int kerulet() {
        return 2 * (this.a + this.b);
    }

    public int terulet() {
        return this.a * this.b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem a téglalap 'a' oldalának hosszát (egész szám): ");
        int a = scanner.nextInt();

        System.out.print("Kérem a téglalap 'b' oldalának hosszát (egész szám): ");
        int b = scanner.nextInt();

        teglalap t = new teglalap(a, b);

        System.out.println("A téglalap kerülete: " + t.kerulet());
        System.out.println("A téglalap területe: " + t.terulet());

        scanner.close();
    }
}