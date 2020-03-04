package test;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        Student student1 = new Student();
        student1.setAge(1);
        priorityQueue.offer(student1);
        Student student3 = new Student();
        student3.setAge(3);
        priorityQueue.offer(student3);
        Student student2 = new Student();
        student2.setAge(2);
        priorityQueue.offer(student2);
        int size = priorityQueue.size();
        for(int i = 0;i<size;i++){
            Student poll = priorityQueue.poll();
            System.out.println(poll.getAge());
        }
    }
}

class Student implements Comparable<Student>{
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return age < o.age ? -1 : age.equals(o.age) ? 0 : 1;
    }
}
