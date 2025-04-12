package hashTable;

import java.util.HashMap;

public class EncodeDecode {
    // Encodes a URL to a shortened URL.
    private HashMap<Integer, String> map = new HashMap<>();
    private int id = 0;
    private static final String BASE_URL = "http://tinyurl.com/";

    public String encode(String longUrl) {
        // Store the long URL with current id
        map.put(id, longUrl);
        // Create a tiny URL by appending id to base URL and return it
        return BASE_URL + id++;
    }

    public String decode(String shortUrl) {
        // Extract the id from the short URL
        int id = Integer.parseInt(shortUrl.replace(BASE_URL, ""));
        // Get the long URL using the id from the map
        return map.get(id);
    }
    public static void main(String[] args) {
        EncodeDecode obj = new EncodeDecode();
        obj.encode("");

    }
}
