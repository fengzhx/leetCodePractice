package test;

public class Load9 {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }
}

class Singleton {
    public static int a = 1;

    private Singleton() {
    }

    private static class LazyHolder {
        static {
            System.out.println("lazy holder");
        }

        private static final Singleton LAZYHOLDER = new Singleton();
    }

    public static Singleton getInstance() {
        return LazyHolder.LAZYHOLDER;
    }
}
