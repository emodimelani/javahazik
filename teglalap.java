import java.util.Scanner;

public class teglalap {
    private int a;
    private int b;

    public teglalap(int a, int b) {
        this.a=a;
        this.b=b;
    }
    public int kerulet() {
        return 2*(a+b);

    }
    public int terulet() {
        return a*b;

    }
public static void main( String[] args) {
  Scanner scanner= new Scanner (System.in);
  System.out.println("Add meg a téglalap a oldalának a hosszát (egész szám): ");
  int a = scanner.nextInt();
  System.out.println("Add meg a téglalap b oldalának a hosszát(egész szám): ");
   int b= scanner.nextInt();
   teglalap teglalap= new teglalap(a,b);
   System.out.println("A téglalap kerülete: " + teglalap.kerulet());
   System.out.println("A téglalap területe: "+teglalap.terulet());
   scanner.close();

}
}
