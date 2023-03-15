package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapToMap {
    private Map<Integer, String> map = new HashMap<>();

    public void addToMap(int KeyCode, String Value){
        map.put(KeyCode, Value);
    }
    public Map returnMap(){
        return map;
    }

    private Map <Integer, String> copyedMap = new HashMap<>();
    public void copyMap(){
        copyedMap = map;
    }
    public Map returnCopyedMap(){
        return copyedMap;
    }
}
