import java.util.Scanner;

public class ketszamkozulnagyobb {
    public static int melyikanagyobb(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Add meg az első számot: ");
            int a = scanner.nextInt();

            System.out.print("Add meg a második számot: ");
            int b = scanner.nextInt();

            if (a == b) {
                System.out.println("A két szám egyenlő.");
            } else {
                int nagyobbszam = melyikanagyobb(a, b);
                System.out.println("A nagyobb szám: " + nagyobbszam);
            }
        }
    }
}
