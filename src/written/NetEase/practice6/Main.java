package written.NetEase.practice6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(",");
        String begin = s[0];
        String end = s[1];
        Map<String, String[]> map = getMap();
        List<String> temp = new ArrayList<>();
        List<String> result = new ArrayList<>();
        getResult(begin,end,map,result,temp);
        StringBuilder sb = new StringBuilder();
        for(String ssss: result){
            sb.append(ssss);
            sb.append(",");
        }
        if(result.size() > 0){
            sb.append(",");
        }
        System.out.println(sb.toString());
    }

    public static void getResult(String begin,String end,Map<String, String[]> map,List<String> result,List<String> temp){
        if(begin.equals(end)){
            result = new ArrayList<>(temp);
            return;
        }
        String[] directort = new String[]{"north","south","west","east"};
        String[] strings = map.get(begin);
        for(int i = 0;i<strings.length;i++){
            temp.add(directort[i]);
            if(begin.equals(strings[i]) || "".equals(strings[i])){
                continue;
            }
            getResult(strings[i],end,map,result,temp);
            temp.remove(temp.size() - 1);
        }
    }

    public static Map<String,String[]> getMap(){
        Map<String,String[]> map = new HashMap<>();
        String[] DAOTIAN1 = new String[]{"","TULU1","",""};
        map.put("DAOTIAN1",DAOTIAN1);
        String[] TULU1 = new String[]{"DAOTIAN1","DAOTIAN","","TULU2"};
        map.put("TULU1",TULU1);
        String[] DAOTIAN = new String[]{"TULU1","TULU","",""};
        map.put("DAOTIAN",DAOTIAN);
        String[] TULU = new String[]{"DAOTIAN","CUNKOU","",""};
        map.put("TULU",TULU);
        String[] CUNKOU = new String[]{"TULU","","","NONGSHE"};
        map.put("CUNKOU",CUNKOU);
        String[] NONGSHE = new String[]{"","","CUNKOU",""};
        map.put("NONGSHE",NONGSHE);
        String[] TULU2 = new String[]{"","","TULU1","JIEDAO"};
        map.put("TULU2",TULU2);
        String[] LIUJIABUDIAN = new String[]{"","JIEDAO","",""};
        map.put("LIUJIABUDIAN",LIUJIABUDIAN);
        String[] JIEDAO = new String[]{"LIUJIABUDIAN","TIEPU","TULU2","JIEDAO1"};
        map.put("JIEDAO",JIEDAO);
        String[] TIEPU = new String[]{"JIEDAO","","",""};
        map.put("TIEPU",TIEPU);
        String[] YASHI = new String[]{"","GUIGE","",""};
        map.put("YASHI",YASHI);
        String[] GUIGE = new String[]{"YASHI","","","HOUYUAN"};
        map.put("GUIGE",GUIGE);
        String[] PIANTING = new String[]{"","","","ZHENGTING"};
        map.put("PIANTING",PIANTING);
        String[] ZHANGFANG = new String[]{"","","","ZHENGYUAN"};
        map.put("ZHANGFANG",ZHANGFANG);
        String[] JIEDAO1 = new String[]{"","XIAOJIUGUAN","JIEDAO","GAOJIADAYUAN"};
        map.put("JIEDAO1",JIEDAO1);
        String[] XIAOJIUGUAN = new String[]{"JIEDAO1","","",""};
        map.put("XIAOJIUGUAN",XIAOJIUGUAN);
        String[] HUAYUAN = new String[]{"","HOUYUAN","",""};
        map.put("HUAYUAN",HUAYUAN);
        String[] HOUYUAN = new String[]{"HUAYUAN","ZHENGTING","GUIGE","XIYIFANG"};
        map.put("HOUYUAN",HOUYUAN);
        String[] ZHENGTING = new String[]{"HOUYUAN","ZHENGYUAN","PIANTING","FANTING"};
        map.put("ZHENGTING",ZHENGTING);
        String[] ZHENGYUAN = new String[]{"ZHENGTING","GAOJIADAYUAN","ZHANGFANG","PIANFANG"};
        map.put("ZHENGYUAN",ZHENGYUAN);
        String[] GAOJIADAYUAN = new String[]{"ZHENGYUAN","","JIEDAO1","JIEDAO2"};
        map.put("GAOJIADAYUAN",GAOJIADAYUAN);
        String[] XIYIFANG = new String[]{"","","HOUYUAN",""};
        map.put("XIYIFANG",XIYIFANG);
        String[] FANTING = new String[]{"","","ZHENGTING",""};
        map.put("FANTING",FANTING);
        String[] PIANFANG = new String[]{"","","ZHENGYUAN",""};
        map.put("PIANFANG",PIANFANG);
        String[] JIEDAO2 = new String[]{"","","GAOJIADAYUAN","TULU3"};
        map.put("JIEDAO2",JIEDAO2);
        String[] TULU3 = new String[]{"","","JIEDAO2","QINGSHILU"};
        map.put("TULU3",TULU3);
        String[] QINGSHILU = new String[]{"","","TULU3",""};
        map.put("QINGSHILU",QINGSHILU);
        return map;
    }
}