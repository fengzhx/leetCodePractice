package designParttern.study2.factorymethod;


//工厂方法模式（1条标准）
//定义一个标准
public class factoryMathod {
    public static void main(String[] args) {
        Tree tree = StaticFactory.getTree(1);
        System.out.println(tree.getTree());
    }
}

class StaticFactory {
    public static Tree getTree(int type) {
        switch (type) {
            case 1:
                return new UserTree();
            case 2:
                return new EquipTree();
            default:
                return null;
        }
    }
}

abstract class Tree {
    abstract String getTree();
}


class UserTree extends Tree {

    @Override
    String getTree() {
        return "userTree";
    }
}

class EquipTree extends Tree {

    @Override
    String getTree() {
        return "EquipTree";
    }
}