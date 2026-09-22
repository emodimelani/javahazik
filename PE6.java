public class PE6 {
    public static void main(String[] args) {
        int negyzetosszeg = 0;
        int simaOsszeg = 0;

        for (int i = 1; i <= 100; i++) {
            negyzetosszeg += i * i; 
            simaOsszeg += i;        
        }

        int osszegNegyzete = simaOsszeg * simaOsszeg;

        int kulonbseg = osszegNegyzete - negyzetosszeg;

        System.out.println("A kulonbseg: " + kulonbseg);
    }
}