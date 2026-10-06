public class sztringtisztitas {

    public static String tisztitas(String szoveg) {
        return szoveg.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String cim = "192. 20.246.138:\n 6666";
        System.out.println(tisztitas(cim));
    }
}
