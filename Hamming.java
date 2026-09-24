public class Hamming {

    public static int tavolsag(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return -1;
        }

        int elteres = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                elteres++;
            }
        }

        return elteres;
    }

    public static void main(String[] args) {
        String s1 = "toned";
        String s2 = "roses";

        int eredmeny = Hamming.tavolsag(s1, s2);

        if (eredmeny == -1) {
            System.out.println("Hiba: A két szó hossza eltér!");
        } else {
            System.out.println("Hamming-távolság: " + eredmeny);
        }
    }
}