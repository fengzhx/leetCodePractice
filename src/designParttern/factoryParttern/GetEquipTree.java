package designParttern.factoryParttern;

public class GetEquipTree<T extends CommonTreeNode<T>> implements GenerateTree<T> {
    @Override
    public T getTree() {
        EquipTree equipTree = new EquipTree();
        equipTree.setId(1L);
        equipTree.setEquipName("设备");
        return (T) equipTree;
    }
}
