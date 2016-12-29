/**
 * Created by spoonyforky on 29/12/16.
 */
public class doubleChar {
/*
    Given a string, return a string where for every char in the original, there are two chars.

            doubleChar("The") → "TThhee"
    doubleChar("AAbb") → "AAAAbbbb"
    doubleChar("Hi-There") → "HHii--TThheerree"*/


    public String doubleChar(String str) {
        String msg="";
        for (int i = 0; i < str.length(); i++){
            msg= msg +  str.charAt(i) + str.charAt(i);
        }
        return msg;
    }

}
