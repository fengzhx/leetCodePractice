package designParttern.factoryParttern;

public class GetUserTree<T extends CommonTreeNode<T>> implements GenerateTree<T> {
    @Override
    public T getTree() {
        UserTree userTree = new UserTree();
        userTree.setAge(1);
        userTree.setId(2L);
        T t = (T) userTree;
        return t;
    }
}
