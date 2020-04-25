package written.practice4;


import javafx.util.Pair;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

    }
}

//class Student {
//
//    Map<String,StudentInfo> studentMap = new HashMap<>();
//    //构造函数，输入为文件名
//    Student(String filename)
//    {
//        try(FileReader fr = new FileReader(filename);){
//            BufferedReader file = new BufferedReader(fr);
//            String s;
//            while((s = file.readLine()) != null){
//                String[] strings = s.split(" ");
//                StudentInfo studentInfo = new StudentInfo();
//                studentInfo.setName(strings[0]);
//                studentInfo.setCollegeId(Integer.parseInt(strings[1]));
//                studentInfo.setMajorId(Integer.parseInt(strings[2]));
//                studentInfo.setGrade(Integer.parseInt(strings[3]));
//                studentMap.put(s,studentInfo);
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//
//    };
//    //获取学生所在学院ID和专业ID,请自行定义Pair
//    Pair<String,String> getStudentInfo(String strName)
//    {
//        StudentInfo studentInfo = studentMap.get(strName);
//        String s = studentInfo.getName()
//    };
//    //获取某学院的所有学生
//    List<String> getMembersOfCollege(String strCollegeId)
//    {
//        //请面试人实现该函数体，时间复杂度O(1)
//    };
//    //获取某专业的所有学生
//    List<String> getMembersOfMajor(String strMajorId)
//    {
//        //请面试人实现该函数体，时间复杂度O(1)
//    };
//    //获取某个年级的所有学生
//    List<String> getMembersOfGrade(String strGradeId){
//
//    }
//    class StudentInfo{
//        private String name;
//        private Integer collegeId;
//        private Integer majorId;
//        private Integer grade;
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public Integer getCollegeId() {
//            return collegeId;
//        }
//
//        public void setCollegeId(Integer collegeId) {
//            this.collegeId = collegeId;
//        }
//
//        public Integer getMajorId() {
//            return majorId;
//        }
//
//        public void setMajorId(Integer majorId) {
//            this.majorId = majorId;
//        }
//
//        public Integer getGrade() {
//            return grade;
//        }
//
//        public void setGrade(Integer grade) {
//            this.grade = grade;
//        }
//    }
//}

//class Solution{
//    int FileUniq(String input_filename, String output_filename) {
//        try(FileReader fr = new FileReader(input_filename);
//            BufferedWriter bw = new BufferedWriter(new FileWriter(output_filename))){
//            BufferedReader out = new BufferedReader(fr);
//            BufferedReader in = new BufferedReader(fr);
//            String strout;
//            String strin;
//            while((strin = in.readLine()) != null){
//                while((strout = out.readLine()) != null){
//                    if(strin.compareTo(strout) < 0){
//                        strin = strout;
//                    }else if(strin.compareTo(strout) == 0){
//                        break;
//                    }
//                }
//                bw.write(strin);
//            }
//            return 0;
//        }catch (Exception e){
//            return 1;
//        }
//    }
//}
