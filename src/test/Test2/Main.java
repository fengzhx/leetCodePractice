package test.Test2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        System.out.println(trie.val == 0);
    }
}

class Trie {
    private static int length = 26;
    public char val;
    private Trie[] child = new Trie[length];
//    /** Initialize your data structure here. */
//    public Trie() {
//    }
//
//    /** Inserts a word into the trie. */
//    public void insert(String word) {
//        Trie[] tries = child;
//        for(int i = 0;i<word.length();i++){
//
//        }
//    }
//
//    /** Returns if the word is in the trie. */
//    public boolean search(String word) {
//
//    }
//
//    /** Returns if there is any word in the trie that starts with the given prefix. */
//    public boolean startsWith(String prefix) {
//
//    }
}