package binarySearch;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeMap {
    Map<String, TreeMap<Integer,String>> map;

    TimeMap(){
        map = new HashMap<>();
    }
    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new TreeMap<>());
        }
        map.get(key).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if(!map.containsKey(key))return "";
        TreeMap<Integer,String> timestamps = map.get(key);
        Map.Entry<Integer,String> entry = timestamps.floorEntry(timestamp);
    return entry==null ? "": entry.getValue();
    }
}
