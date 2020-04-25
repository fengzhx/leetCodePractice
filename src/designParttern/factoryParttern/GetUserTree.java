package designParttern.factoryParttern;

public class GetUserTree implements GenerateTree {
    @Override
    public UserTree getTree() {
        UserTree userTree = new UserTree();
        userTree.setAge(1);
        userTree.setId(2L);
        return userTree;
    }


}
