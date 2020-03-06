package test;

public class Test {
    public static void main(String[] args) {
        Integer integer = 127;
        Integer integer2 = 127;
        changeInteger(integer);
        System.out.println(integer);
        System.out.println(integer == integer2);
    }

    public static void changeInteger(Integer integer){
        integer = 3;
    }
}
