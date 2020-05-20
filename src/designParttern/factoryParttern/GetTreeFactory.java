package designParttern.factoryParttern;

public class GetTreeFactory<T extends CommonTreeNode<T>> {
    public T getTree(TreeEnum type) {
        switch (type) {
            case USER_TREE:
                GetUserTree<T> getUserTree = new GetUserTree<>();
                return getUserTree.getTree();
            case EQUIP_TREE:
                GetEquipTree<T> equipTree = new GetEquipTree<>();
                return equipTree.getTree();
            default:
                return null;
        }
    }
}
