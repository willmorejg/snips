/**
  * Reverse a Java String without using a StringBuffer or StringBuilder.
  */
public class ReverseString {
    public static void main(String[] args) {
        String original = "zyxwvutsrqponmlkjihgfedcba";
        char chars[] = original.toCharArray();
        char result[] = new char[original.length()];

        for(int c = chars.length - 1; c >= 0; c--) {
            int idx = chars.length - 1 - c;
            result[idx] = chars[c];
        }

        System.out.println(new String(result));
    }
}
