package Collections;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class QueueToMap {
    private Queue <String> queue = new ArrayDeque<>();

    public void addToQueue(String value){
        queue.add(value);
    }
    public Queue returnQueue(){
        return queue;
    }

    private int key = 0;
    private Map<Integer, String> map = new HashMap<>();
    public void queueToMap(){
        for (String index : queue){
            map.put(key,index);
            key += 1;
        }
    }
    public Map returnMap(){
        return map;
    }
}
