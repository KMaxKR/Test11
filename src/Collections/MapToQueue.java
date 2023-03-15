package Collections;

import java.util.*;

public class MapToQueue {
    private Map<Integer, String> map = new HashMap<>();

    public void addToMap(int KeyCode, String Value){
        map.put(KeyCode, Value);
    }
    public Map returnMap(){
        return map;
    }

    private Queue <Integer> queue = new ArrayDeque<>();
    public void MapToQueue(){
        for(Integer index : map.keySet()){
            queue.add(index);
        }
    }
    public Queue returnQueue(){
        return queue;
    }
}
