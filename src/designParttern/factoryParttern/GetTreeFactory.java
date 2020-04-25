package designParttern.factoryParttern;

public class GetTreeFactory {
    public static Object getTree(TreeEnum type) {
        switch (type) {
            case USER_TREE:
                return new GetUserTree().getTree();
            case EQUIP_TREE:
                return new GetEquipTree().getTree();
            default:
                return null;
        }
    }
}
