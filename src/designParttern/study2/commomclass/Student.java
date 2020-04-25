package designParttern.study2.commomclass;

import java.io.*;

public class Student implements Cloneable,Serializable{
    private static final long serialVersionUID = 42L;
    private String name;
    private Integer age;
    private Student lover;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student getLover() {
        return lover;
    }

    public void setLover(Student lover) {
        this.lover = lover;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", lover=" + lover +
                '}';
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try(ObjectOutputStream oos = new ObjectOutputStream(baos)){
            oos.writeObject(this);
        }catch (IOException e) {
            e.printStackTrace();
        }

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        try(ObjectInputStream ois = new ObjectInputStream(bais)){
            return ((Student) ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
//        return ((Student) super.clone());
    }
}
