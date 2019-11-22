package chapter1.second;

public class Practice1 {
    public static final int MAX_COUNT = 50;
    public static int count = 0;

    public static void main(String[] args) {
        for (int i = 0;i<4;i++){
            Thread thread = new Thread(new Machine());
            thread.start();
        }
    }
}

class Machine implements Runnable{
    @Override
    public void run() {
        while(true){
            if (Practice1.count < Practice1.MAX_COUNT){
                System.out.println(Practice1.count);
                Practice1.count ++;
            }
        }
    }
}

