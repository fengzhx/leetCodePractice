package written.QQ.practice5;

import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    private Map<String, Pair<String,String>> studentMap = new HashMap<>();
    private Map<String, List<String>> collegeInfo = new HashMap<>();
    private Map<String, List<String>> majorInfo = new HashMap<>();
    private Map<String, List<String>> gradeInfo = new HashMap<>();
    //构造函数，输入为文件名
    Student(String filename)
    {
        try(FileReader fr = new FileReader(filename)){
            BufferedReader file = new BufferedReader(fr);
            String s;
            while((s = file.readLine()) != null){
                String[] strings = s.split(" +");
                Pair<String,String> pair = new Pair<>(strings[1],strings[2]);
                if(!collegeInfo.containsKey(strings[1])){
                    List<String> list = new ArrayList<>();
                    collegeInfo.put(strings[1],list);
                }
                if(!majorInfo.containsKey(strings[2])){
                    List<String> list = new ArrayList<>();
                    majorInfo.put(strings[2],list);
                }
                if(!gradeInfo.containsKey(strings[3])){
                    List<String> list = new ArrayList<>();
                    gradeInfo.put(strings[3],list);
                }
                collegeInfo.get(strings[1]).add(strings[0]);
                majorInfo.get(strings[2]).add(strings[0]);
                gradeInfo.get(strings[3]).add(strings[0]);
                studentMap.put(strings[0],pair);
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
    //获取学生所在学院ID和专业ID,请自行定义Pair
    Pair<String,String> getStudentInfo(String strName)
    {
        return studentMap.get(strName);
    }
    //获取某学院的所有学生
    List<String> getMembersOfCollege(String strCollegeId)
    {
        return collegeInfo.get(strCollegeId);
    }
    //获取某专业的所有学生
    List<String> getMembersOfMajor(String strMajorId)
    {
        return majorInfo.get(strMajorId);
    }
    //获取某个年级的所有学生
    List<String> getMembersOfGrade(String strGradeId){
        return gradeInfo.get(strGradeId);
    }
}


public class Practice5 {
    public static void main(String[] args) {
        String input = "F:\\项目\\leetCodePractice\\src\\input";
        Student student = new Student(input);
        System.out.println(student.getMembersOfGrade("2018"));
    }

}
