package self.practice10;


import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }
}

class LRUCache<K, V> extends LinkedHashMap<K, V>{
    private final int cacheSize;

    public LRUCache(int cacheSize) {
        super((int)Math.ceil(cacheSize/0.75) + 1, 0.75f, true);
        this.cacheSize = cacheSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return cacheSize < size();
    }
}