import java.util.Scanner;
public class Gomb{
    private double radius;

public Gomb(double radius){
this.radius=radius;
}
public double felszin(){
    return 4*Math.PI*(radius*radius);
}
public double terfogat(){
    return (4.0/3.0)*Math.PI*(radius*radius*radius);
}
public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Kérem adja meg a gömb sugarát: ");
    double radius=scanner.nextDouble();
    Gomb gomb=new Gomb(radius);
    System.out.println("A gömb felszíne: " +gomb.felszin());
    System.out.println("A gömb térfogata: " +gomb.terfogat());
    scanner.close();
 }
}


