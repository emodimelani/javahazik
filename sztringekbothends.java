import java.util.Scanner;

public class sztringekbothends {
    static String bothEnds(String str) {
        if(str.length() < 2 ){
            return "";
        }else{
            String elsoKetto =str.substring(0,2);
            String utolsoKetto= str.substring(str.length()-2);
            return elsoKetto+utolsoKetto;
        }
    }


public static void main(String [] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.print("Adjon meg egy sztringet: ");
    String sztring=scanner.nextLine();
    scanner.close();
    System.out.println(bothEnds(sztring));
   }
}
