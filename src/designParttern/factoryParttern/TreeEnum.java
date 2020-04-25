package designParttern.factoryParttern;

enum TreeEnum{
    EQUIP_TREE("equipTree"),
    USER_TREE("userTree");

    private String name;
    TreeEnum(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
