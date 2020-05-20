package designParttern.factoryParttern;

public class Service {
    public static void main(String[] args) {
        GetTreeFactory<UserTree> getTreeFactory = new GetTreeFactory<>();
        UserTree tree = getTreeFactory.getTree(TreeEnum.USER_TREE);
        System.out.println(tree.getAge());
    }
}
