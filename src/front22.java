/**
 * Created by spoonyforky on 28/12/16.
 */
public class front22 {
    /*
Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"*/

    public String front22(String str) {
        //num of chars
        int take =2;
        if (take > str.length()){
            // maybes its only 1 letter
            take = str.length();
        }
        String front = str.substring(0,take);
        return front +str +front;

    }

}
