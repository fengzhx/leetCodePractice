package designParttern.factoryParttern;

public class GetEquipTree implements GenerateTree {
    @Override
    public EquipTree getTree() {
        EquipTree equipTree = new EquipTree();
        equipTree.setId(1L);
        equipTree.setEquipName("设备");
        return equipTree;
    }
}
