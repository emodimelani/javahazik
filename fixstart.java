import java.util.Scanner;

public class fixstart {
    static String fixStart(String srt){
    if (srt.length() <1 ) {
        return srt;
    }else{
        return srt.charAt(0)+srt.substring(1).replace(srt.charAt(0), '*');
    }
}

   public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);
    System.out.println("Adjon meg egy sztringet ");
    String sztring=scanner.nextLine();
    scanner.close();
    System.out.println(fixStart(sztring));
 }
}


