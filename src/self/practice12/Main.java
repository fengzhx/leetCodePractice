package self.practice12;

//约瑟夫环
public class Main {
    public static void main(String[] args) {
        getResult(3,2);
    }

    public static void getResult(int n, int m){
        boolean[] outArray = new boolean[n];
        int flag = 0;
        int personNum = n;
        while(personNum != 1){
            for (int i = 0; i < n; i++) {
                if(outArray[i]){
                    continue;
                }
                flag++;
                if(flag == m){
                    outArray[i] = true;
                    personNum--;
                    flag = 0;
                }
                if(personNum == 1){
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (!outArray[i]){
                System.out.println(i + 1);
            }
        }
    }
}
