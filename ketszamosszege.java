import java.util.Scanner;

public class ketszamosszege {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Add meg az első számot: ");
            int elsoSzam = scanner.nextInt();

            System.out.print("Add meg a második számot: ");
            int masodikSzam = scanner.nextInt();

            long osszeg = (long) elsoSzam + masodikSzam;
            System.out.println("A két szám összege: "+osszeg);
        }
    }
}