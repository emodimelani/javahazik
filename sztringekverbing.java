public class sztringekverbing {
    private static String Verbing(String srt) {
        if(srt.length() >=3){
            if (srt.endsWith("ing")){
                return srt+"ly";
            } else{
                return srt+"ing";
            }
        } else {
            return srt;

            }
        }
    }
    

