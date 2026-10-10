
public class egyenloek{
    
}
    
    


public static boolean isEqual(int[] tomb1,int[] tomb2){
    if (tomb1==tomb2){
        return true;
    }
    if (tomb1==null||tomb2==null||tomb1.length!=tomb2.length){
        return false;

    }
    for(int i=0;i<tomb1.length;i++){
        if(tomb1[i]!=tomb2[i]){
            return false;
        }
    }
    return true;


}

public static void main(String[] args) {
    int[] tomb1={1,2,4,5};
    int[] tomb2={5,7,8,9};
    boolean allitas=isEqual(tomb1,tomb2);
    System.out.println(allitas);
}
