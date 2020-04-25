package written.QQ.practice2;

import java.util.*;

class Record {
    // 表示userA关注userB
    String userA;
    String userB;
};

class Solution {
    void GetTopUser(final List<Record> vecRecords, String strUserMaxFollow, String strUserMaxFollowed) {
        Map<String, Integer[]> map = new HashMap<>(16);
        for (int i = 0; i < vecRecords.size(); i++) {
            String userA = vecRecords.get(i).userA;
            String userB = vecRecords.get(i).userB;
            if (!map.containsKey(userA)) {
                Integer[] integers = new Integer[2];
                Arrays.fill(integers,0);
                map.put(userA, integers);
            }
            if (!map.containsKey(userB)) {
                Integer[] integers = new Integer[2];
                Arrays.fill(integers,0);
                map.put(userB, integers);
            }
            map.get(userA)[0]++;
            map.get(userB)[1]++;
        }
        int maxFollow = Integer.MIN_VALUE;
        int MaxFollowed = Integer.MIN_VALUE;
        for (String user : map.keySet()) {
            Integer[] integers = map.get(user);
            if (maxFollow < integers[0]) {
                maxFollow = integers[0];
                strUserMaxFollow = user;
            }
            if (MaxFollowed < integers[1]) {
                MaxFollowed = integers[1];
                strUserMaxFollowed = user;
            }
        }
        System.out.println("strUserMaxFollow: "+ strUserMaxFollow);
        System.out.println("strUserMaxFollowed: "+ strUserMaxFollowed);
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Record record_xiaoming = new Record();
        record_xiaoming.userA = "xiaoming";
        record_xiaoming.userB = "xiaoli";
        Record record_xiaoli = new Record();
        record_xiaoli.userA = "xiaoli";
        record_xiaoli.userB = "xiaohong";
        Record record_xiaohong = new Record();
        record_xiaohong.userA = "xiaohong";
        record_xiaohong.userB = "xiaoming";
        Record record_xiaolan = new Record();
        record_xiaolan.userA = "xiaoming";
        record_xiaolan.userB = "xiaohong";
        List<Record> records = new ArrayList<>();
        records.add(record_xiaoming);
        records.add(record_xiaoli);
        records.add(record_xiaohong);
        records.add(record_xiaolan);
        solution.GetTopUser(records,"","");
    }

}
