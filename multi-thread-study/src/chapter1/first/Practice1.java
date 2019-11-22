package chapter1.first;

public class Practice1 {
    public static void main(String[] args) {
        watchNews();
        listenMusic();
    }

    public static void watchNews(){
        while(true){
            System.out.println("good news");
            sleep(100);
        }
    }

    public static void listenMusic(){
        while(true){
            System.out.println("good music");
            sleep(100);
        }
    }

    public static void sleep(int millisecond){
        try {
            Thread.sleep(millisecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

