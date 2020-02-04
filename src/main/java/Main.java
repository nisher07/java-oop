public class Main {

    public static void main(String[] args) {
        String s1 = "table";
        String s2 = "ablte";


        boolean b = AnagramChecker.isAnagram(s1, s2);
        System.out.println(b);
    }
}
