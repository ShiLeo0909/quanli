package oop2;

public class Hex2Dec {
    public static void main(String[] args) {
        String hextring = "1ABC";
        System.out.println(hex2DecUsingTerm(hextring));
        System.out.println(hex2DecUsingTerm(hextring));
        System.out.println(hex2DecUsingHorner(hextring));
    }
    public static boolean isHexstring(String myString){
        if(myString == null || myString == ""){
            return false;
        }
        for (int i = 0; i < myString.length(); i++) {
            if(valusIndex(myString.charAt(i)) == -1){
                return false;
            }
        }
        return true;
    }
    public static int valusIndex(char hexChar){
        final String HEX_STRING = "0123456789ABCDEF";
        return HEX_STRING.indexOf(hexChar);
    }
    public static int hex2DecUsingTerm(String hexString){
        if(!isHexstring(hexString)){
            return -1;
        }
        int sum = 0;
        int term = 1;
        for (int i = hexString.length()-1; i >=0 ; i--) {
            sum += valusIndex(hexString.charAt(i)) * term;
            term *= 16;
        }
        return sum;
    }
    public static int hex2DecUsingHorner (String hexString){
        if(!isHexstring(hexString)){
            return -1;
        }
        int sum = valusIndex(hexString.charAt(0));
        for (int i = 1; i < hexString.length(); i++) {
           sum = 16 * sum + valusIndex(hexString.charAt(i));
        }
        return sum;
    }
}
