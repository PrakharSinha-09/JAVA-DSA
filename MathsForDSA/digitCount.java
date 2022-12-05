public class digitCount {
    public static void main(String[] args) {
        int x=3;
        int digits = Integer.toString(Math.abs(x)).trim().length();
        System.out.println(digits);
    }
}
