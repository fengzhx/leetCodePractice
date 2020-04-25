package self.practice11;

public class Main {
    public static void main(String[] args) {
        fullPermutation(new char[]{'a','b','c','d'},0);
    }

    public static void fullPermutation(char[] chars,int current){
        if(chars == null || current < 0 || current > chars.length){
            return;
        }

        if(current == chars.length - 1){
            System.out.println(String.valueOf(chars));
        }else{
            for(int j = current;j<chars.length;j++){
                char temp = chars[j];
                chars[j] = chars[current];
                chars[current] = temp;
                fullPermutation(chars,current + 1);
                temp = chars[j];
                chars[j] = chars[current];
                chars[current] = temp;
            }
        }
    }
}
