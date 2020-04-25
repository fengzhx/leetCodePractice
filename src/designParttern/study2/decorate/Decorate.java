package designParttern.study2.decorate;

//装饰者模式
//继承同一个接口，不改变原对象增强其功能
public class Decorate {
    public static void main(String[] args) {
        Old old = new Old();
        NewName newName = new NewName(old);
        newName.name();
    }

}

interface GetName{
    void name();
}

class Old implements GetName{

    @Override
    public void name() {
        System.out.println("old name");
    }
}

abstract class ChangeName{
    GetName getName;

    public ChangeName(GetName getName) {
        this.getName = getName;
    }
}


class NewName extends ChangeName implements GetName{

    public NewName(GetName getName) {
        super(getName);
    }

    @Override
    public void name() {
        getName.name();
        System.out.println("judge name");
    }
}