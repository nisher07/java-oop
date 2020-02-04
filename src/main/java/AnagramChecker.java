import java.util.Arrays;

public class AnagramChecker {

    public static boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length()) return false;

        s1=sortString(s1);
        s2=sortString(s2);

        if (s1.equals(s2)) return true;
        else return false;

    }
    private static String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
