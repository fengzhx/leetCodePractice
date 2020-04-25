package written.QQ.practice4;

import java.io.*;

class Solution{
    int FileUniq(String input_filename, String output_filename){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(output_filename));
            FileReader inFR = new FileReader(input_filename);
            BufferedReader in = new BufferedReader(inFR)){
            String index = String.valueOf((char) 0);
            String temp = null;
            boolean judgeNewLine = true;
            while(in.readLine() != null){
                try(FileReader outFR = new FileReader(input_filename);
                    BufferedReader out = new BufferedReader(outFR)){
                    String strOut;
                    while((strOut = out.readLine()) != null){
                        if(temp == null){
                            if(strOut.compareTo(index) > 0){
                                temp = strOut;
                            }
                            continue;
                        }
                        if(strOut.compareTo(temp) < 0 && strOut.compareTo(index) > 0){
                            temp = strOut;
                        }
                    }
                    if(temp == null){
                        break;
                    }else{
                        if(judgeNewLine){
                            bw.write(temp);
                            judgeNewLine = false;
                        }else{
                            bw.newLine();
                            bw.write(temp);
                        }
                    }
                    index = temp;
                    temp = null;
                }catch(IOException e){
                    e.printStackTrace();
                    return 1;
                }

            }
            return 0;
        }catch(IOException e){
            e.printStackTrace();
            return 1;
        }
    }
}

public class Practice4 {
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        String input_filename = "F:\\项目\\leetCodePractice\\src\\input";
        String output_filename = "F:\\项目\\leetCodePractice\\src\\output";
        System.out.println(solution.FileUniq(input_filename, output_filename));
    }
}