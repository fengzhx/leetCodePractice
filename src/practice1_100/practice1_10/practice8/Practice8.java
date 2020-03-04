package practice1_100.practice1_10.practice8;

public class Practice8 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myAtoi("     4223456789fagafdag"));
    }
}

class Solution {
    public int myAtoi(String str) {
        if(str.isEmpty()){
            return 0;
        }
        char[] mychar=str.toCharArray();
        long ans=0;
        int i=0,sign=1,n=str.length();
        while(i<n&&mychar[i]==' ') {
            i++;
        }
        if(i < n &&mychar[i]=='+') {
            i++;
        }
        else if(i < n &&mychar[i]=='-') {
            i++;
            sign =-1;
        }
        while(i<n&&(mychar[i]>='0'&&mychar[i]<='9')) {
            if(ans!=(int)ans) {
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            ans=ans*10+mychar[i++]-'0';
        }

        if(ans!=(int)ans) {
            return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }

        return (int)(ans*sign);
    }
}