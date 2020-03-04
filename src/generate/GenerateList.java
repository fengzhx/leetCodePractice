package generate;


public class GenerateList {
    private ListNode root = new ListNode(-1);
    public GenerateList(String s){
        String[] strings = s.split("->");
        ListNode temp = root;
        for(String s1 : strings){
            temp.next = new ListNode(Integer.parseInt(s1));
            temp = temp.next;
        }
    }

    public ListNode getRoot() {
        return root.next;
    }

    public void setRoot(ListNode root) {
        this.root.next = root;
    }
}

