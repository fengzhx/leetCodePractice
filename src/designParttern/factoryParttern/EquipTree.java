package designParttern.factoryParttern;

public class EquipTree extends CommonTreeNode<EquipTree> {
    private Integer runTime;
    private String equipName;

    public String getEquipName() {
        return equipName;
    }

    public void setEquipName(String equipName) {
        this.equipName = equipName;
    }

    public Integer getRunTime() {
        return runTime;
    }

    public void setRunTime(Integer runTime) {
        this.runTime = runTime;
    }
}
