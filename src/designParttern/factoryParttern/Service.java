package designParttern.factoryParttern;

public class Service {
    public static void main(String[] args) {
        UserTree tree = (UserTree) GetTreeFactory.getTree(TreeEnum.USER_TREE);
        System.out.println(tree);
    }
}
