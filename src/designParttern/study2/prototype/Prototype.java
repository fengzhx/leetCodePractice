package designParttern.study2.prototype;

import designParttern.study2.commomclass.Student;

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student aaa = new Student();
        aaa.setAge(18);
        aaa.setName("aaa");
        Student bbb = new Student();
        bbb.setAge(18);
        bbb.setName("bbb");
        aaa.setLover(bbb);
        Student ccc = aaa.clone();
        ccc.setLover(aaa);
        System.out.println(aaa);
        System.out.println(ccc);


    }
}
