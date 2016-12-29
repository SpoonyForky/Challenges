/**
 * Created by spoonyforky on 28/12/16.
 */
public class Concat {
/*
    Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

    conCat("abc", "cat") → "abcat"
    conCat("dog", "cat") → "dogcat"
    conCat("abc", "") → "abc"*/

        public String conCat(String a, String b) {
            int lengthA = a.length();
            int lengthB = b.length();
            if (lengthA > 0 && lengthB > 0)
                if (a.charAt(lengthA-1) == b.charAt(0)) {
                    a = a.substring(0, lengthA - 1);
                }
            return a + b;
        }

}
