package LRU;

import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LRUCache {
    private int capacity;
    private Set<LRUNode> cache = new LinkedHashSet<>();
    private Map<Integer,LRUNode> hashMap = new HashMap<>();

    public LRUCache(int capacity){
        this.capacity = capacity;
    }

    public int get(int key){
        if(!hashMap.containsKey(key))return -1;
        LRUNode node = hashMap.get(key);
        cache.remove(node);
        cache.add(node);
        return node.value;
    }

    public void put(int key , int value){
        if(hashMap.containsKey(key)){
            hashMap.get(key).value=value;
            get(key);
            return;
        }
        if(hashMap.size()==capacity){
            LRUNode lastNode = cache.iterator().next();
            cache.remove(lastNode);
            hashMap.remove(lastNode.key);
        }
        LRUNode newNode = new LRUNode(key,value);
        cache.add(newNode);
        hashMap.put(key,newNode);
    }
}
class LRUNode{
    int key;
    int value;
    LRUNode(int key,int value){
        this.key=key;
        this.value= value;
    }
}
