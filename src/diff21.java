/**
 * Created by spoonyforky on 28/12/16.
 */
public class diff21 {
/*
    Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0 */
    public int diff21(int n) {
        if ((21 -n) > 0){
            return 21-n;
        } else {
            return Math.abs((21-n)*2);
        }
    }

}
