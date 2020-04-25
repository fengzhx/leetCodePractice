package designParttern.study2.commomclass;

public class CommonTreeNode {
    private Integer fatherId;
    private Integer id;
    private CommonTreeNode[] children;

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CommonTreeNode[] getChildren() {
        return children;
    }

    public void setChildren(CommonTreeNode[] children) {
        this.children = children;
    }


}
