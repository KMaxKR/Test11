package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MapToStack {
    private Map<Integer, String> map = new HashMap<>();

    public void addToMap(int KeyCode, String Value){
        map.put(KeyCode, Value);
    }
    public Map returnMap(){
        return map;
    }

    private Stack<String> stack = new Stack<>();
    public void MapToStack(){
        for (String index : map.values()){
            stack.push(index);
        }
    }
    public Stack returnStack(){
        return stack;
    }
}
