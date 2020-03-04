package practice201_300.practice201_210.practice208;

public class Practice208 {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("a");
        System.out.println(trie.search("a"));
        System.out.println(trie.startsWith("a"));
    }
}

class Trie {
    private static int length = 26;
    private char val;
    private boolean isEnd = false;
    private Trie[] child = new Trie[length];
    /** Initialize your data structure here. */
    public Trie() {
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie[] tries = child;
        for(int i = 0;i<word.length();i++){
            char c = word.charAt(i);
            int index = c - 'a';
            if(tries[index] == null){
                tries[index] = new Trie();
                tries[index].val = c;
            }
            if(i == word.length() - 1){
                tries[index].isEnd = true;
            }
            tries = tries[index].child;
        }
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie[] tries = child;
        for(int i = 0;i<word.length();i++){
            char c = word.charAt(i);
            int index = c - 'a';
            if(tries[index] == null || tries[index].val != word.charAt(i)){
                return false;
            }
            if(i == word.length() - 1){
                if(tries[index].isEnd){
                    return true;
                }
            }
            tries = tries[index].child;
        }
        return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie[] tries = child;
        for(int i = 0;i<prefix.length();i++){
            char c = prefix.charAt(i);
            int index = c - 'a';
            if(tries[index] == null || tries[index].val != prefix.charAt(i)){
                return false;
            }
            tries = tries[index].child;

        }
        return true;
    }
}

