public class sztringeknotbad {
    private static String notBad(String srt) {
        if (srt.contains("not") && srt.contains("bad")){
            int notIndex = srt.indexOf("not");
            int badIndex= srt.indexOf("bad");
            if(notIndex < badIndex) {
                return srt.substring(0,notIndex) + "good" + srt.substring(badIndex+3);
            }else{
              return srt;
        }

    }
    return srt;
    
}
}
