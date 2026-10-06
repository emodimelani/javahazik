public class sztringekmixup {
    static String mixUp(String a, String b) {
        if (a.length() <2 || b.length() <2) {
            return a+" "+b;
        } else {
            return b.substring(0,2) + a.substring(2) + " " + a.substring(0,2) + b.substring(2) + "";

        }

    }
    
}
