package designParttern.factoryParttern;

public interface GenerateTree<T extends CommonTreeNode<T>> {
    T getTree();
}
