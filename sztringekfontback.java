public class sztringekfontback {
    private static String frontBack(String a, String b) {
    int aKozep = (a.length() + 1) / 2;
    int bKozep = (b.length() + 1) / 2;

    return a.substring(0, aKozep)
         + b.substring(0, bKozep)
         + a.substring(aKozep)
         + b.substring(bKozep);
}
}
