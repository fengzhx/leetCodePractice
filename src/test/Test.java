package test;

public class Test {
    public static void main(String[] args) {
        Boolean[] booleans = new Boolean[2];
        System.out.println(test(booleans));
        System.out.println(booleans[0]);
        System.out.println(booleans[1]);
    }

    public static boolean test(Boolean[] booleans) {
        return booleans[0] = false;
    }
}
