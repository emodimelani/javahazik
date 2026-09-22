public class sztringekhazi {

//A, Donuts
    static String donuts(int n) {
        if (n >= 10) {
            return "Fánkok száma: sok";
        } else {
            return "Fánkok száma: " + n;
        }
    }

    private static void test(String got, String expected) {
        String prefix = got.equals(expected) ? " OK " : "  X ";
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    //B both ends

    static String both_ends(String s){
        if(s.length()<2){
            return "";
        }
        String eleje= s.substring(0,2);
        String vege= s.substring(s.length()-2);
        return eleje+vege;
    }
    

    
    // C. fix_start
    static String fix_start(String s) {
        if (s.length() <= 1) {
            return s;
        }

        char elsoBetu = s.charAt(0);
        String maradek = s.substring(1);

        String modositottMaradek = maradek.replace(elsoBetu, '*');

        return elsoBetu + modositottMaradek;
    }
    // D. mix_up
    static String mix_up(String a, String b) {
        String aEleje = a.substring(0, 2);
        String aMaradek = a.substring(2);

        String bEleje = b.substring(0, 2);
        String bMaradek = b.substring(2);

        String ujA = bEleje + aMaradek;
        String ujB = aEleje + bMaradek;

        return ujA + " " + ujB;
    }
    // E. verbing
    static String verbing(String s) {
        if (s.length() < 3) {
            return s;
        }

        if (s.endsWith("ing")) {
            return s + "ly";
        } else {
            return s + "ing";
        }
    }
    // F. not_bad
    static String not_bad(String s) {
        int idxNot = s.indexOf("not");
        int idxBad = s.indexOf("bad");

        if (idxNot != -1 && idxBad != -1 && idxBad > idxNot) {
            String eleje = s.substring(0, idxNot);
            String vege = s.substring(idxBad + 3); // "bad" hossza 3
            return eleje + "good" + vege;
        }

        return s;
    }
    // G. front_back
    static String front_back(String a, String b) {

        int aMid = (a.length() + 1) / 2;
        int bMid = (b.length() + 1) / 2;

        String aFront = a.substring(0, aMid);
        String aBack = a.substring(aMid);

        String bFront = b.substring(0, bMid);
        String bBack = b.substring(bMid);

        return aFront + bFront + aBack + bBack;
    }
    public static void main(String[] args) {
        System.out.println("donuts");
        test(donuts(4), "Fánkok száma: 4");
        test(donuts(9), "Fánkok száma: 9");
        test(donuts(10), "Fánkok száma: sok");
        test(donuts(99), "Fánkok száma: sok");

        System.out.println();
        System.out.println("both_ends");
        test(both_ends("spring"), "spng");
        test(both_ends("Hello"), "Helo");
        test(both_ends("a"), "");
        test(both_ends("xyz"), "xyyz");

        System.out.println();
        System.out.println("fix_start");
        test(fix_start("babble"), "ba**le");
        test(fix_start("aardvark"), "a*rdv*rk");
        test(fix_start("google"), "goo*le");
        test(fix_start("donut"), "donut");

        System.out.println();
        System.out.println("mix_up");
        test(mix_up("mix", "pod"), "pox mid");
        test(mix_up("dog", "dinner"), "dig donner");
        test(mix_up("gnash", "sport"), "spash gnort");
        test(mix_up("pezzy", "firm"), "fizzy perm");

        System.out.println("verbing");
        test(verbing("hail"), "hailing");
        test(verbing("swimming"), "swimmingly");
        test(verbing("do"), "do");

        System.out.println();
        System.out.println("not_bad");
        test(not_bad("This movie is not so bad"), "This movie is good");
        test(not_bad("This dinner is not that bad!"), "This dinner is good!");
        test(not_bad("This tea is not hot"), "This tea is not hot");
        test(not_bad("It's bad yet not"), "It's bad yet not");

        System.out.println();
        System.out.println("front_back");
        test(front_back("abcd", "xy"), "abxcdy");
        test(front_back("abcde", "xyz"), "abcxydez");
        test(front_back("Kitten", "Donut"), "KitDontenut");
    }
}
    
