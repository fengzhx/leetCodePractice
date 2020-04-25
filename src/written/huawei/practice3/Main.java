package written.huawei.practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<Integer,FunctionCall> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" +");
        int count = Integer.parseInt(firstLine[0]);
        int[] functionCall = new int[count + 1];
        for(int i = 1;i<=count;i++){
            functionCall[i] = Integer.parseInt(firstLine[i]);
        }
        for(int i = 1;i<=count;i++){
            String[] eachLine = br.readLine().split(" +");
            if(functionCall[i] + 2 != eachLine.length){
                System.out.println("NA");
                return;
            }
            int[] subFunction = new int[functionCall[i]];
            for(int j = 2;j<eachLine.length;j++){
                subFunction[j - 2] = Integer.parseInt(eachLine[j]);
            }
            map.put(i,new FunctionCall(i,Integer.parseInt(eachLine[1]),subFunction));
        }
        try {
            System.out.println(getResult(map));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getResult(Map<Integer,FunctionCall> map) throws Exception {
        int maxSize = Integer.MIN_VALUE;
        for(int i : map.keySet()){
            List<Integer> list = new ArrayList<>();
            int size = getSize(i,map,list);
            if(maxSize < size){
                maxSize = size;
            }
        }
        return maxSize;
    }

    public static int getSize(int current,Map<Integer,FunctionCall> map,List<Integer> list) throws Exception {
        list.add(current);
        int[] subFunction = map.get(current).getSubFunction();
        if(map.get(current) == null){
            throw new Exception("NA");
        }
        int size = map.get(current).getStackSize();
        int tempSize = 0;
        for(int i = 0;i<subFunction.length;i++){
            if(list.contains(subFunction[i])){
                throw new Exception("R");
            }
            tempSize = Math.max(tempSize,getSize(subFunction[i],map,list));
        }
        list.remove(Integer.valueOf(current));
        return size + tempSize;

    }
}

class FunctionCall{
    private int num;
    private int stackSize;
    private int[] subFunction;

    public FunctionCall(int num, int stackSize, int[] subFunction) {
        this.num = num;
        this.stackSize = stackSize;
        this.subFunction = subFunction;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getStackSize() {
        return stackSize;
    }

    public void setStackSize(int stackSize) {
        this.stackSize = stackSize;
    }

    public int[] getSubFunction() {
        return subFunction;
    }

    public void setSubFunction(int[] subFunction) {
        this.subFunction = subFunction;
    }
}