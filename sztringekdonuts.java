import java.util.Scanner;

public class sztringekdonuts {
    static String donuts(int n) {
        if(n >= 10) {
            return "Fánkok száma: sok";
        }else{
                return "Fánkok száma: " + n;
            }
        }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Adja meg a fánkok számát:");
        int darab= scanner.nextInt();
        System.out.print(donuts(darab));
        scanner.close();
    }
}

  
