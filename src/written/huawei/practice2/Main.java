package written.huawei.practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] name = br.readLine().split(" ");
            String key = name[0];
            String s = name[1];
            boolean flag = true;
            while(!"".equals(s)){
                int index = s.indexOf("]");
                String substring = s.substring(0, index + 1);
                flag = printString(key,substring);
                if(s.length() - 1 == index){
                    return;
                }
                s = s.substring(index+2);
            }
            if(!flag){
                System.out.println("FAIL");
            }
        }catch (Exception e){
            System.out.println("FAIL");
        }

    }

    public static boolean printString(String key,String pattren) throws Exception {
        String s = pattren.split("\\[")[0];
        if(key.equals(s)){
            pattren = pattren.substring(key.length() + 1,pattren.length() - 1);
            String[] split = pattren.split(",");

            for(int i = 0;i<split.length;i++){
                String[] split1 = split[i].split("=");
                if(split1[1].indexOf("0x") == -1 && split1[1].indexOf("0X") == -1){
                    throw new Exception("FAIL");
                }
                System.out.print(split1[1]);
                if(i != split.length - 1){
                    System.out.print(" ");
                }
            }
            System.out.println();
            return true;
        }else{
            return false;
        }
    }
}
