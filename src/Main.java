import java.util.*;
import Collections.*;

public class Main {
    public static void main(String[] args) {
        //Map to map
        MapToMap mapToMap = new MapToMap();

        mapToMap.addToMap(1,"One");
        mapToMap.addToMap(2,"Two");
        mapToMap.addToMap(3,"Three");
        mapToMap.addToMap(4,"Four");
        mapToMap.addToMap(5,"Five");

        mapToMap.copyMap();
        System.out.println(mapToMap.returnMap());
        System.out.println(mapToMap.returnCopyedMap());


        //Map to Queue
        MapToQueue mapToQueue = new MapToQueue();

        mapToQueue.addToMap(1,"Unu");
        mapToQueue.addToMap(2,"Doi");
        mapToQueue.addToMap(3,"Trei");

        mapToQueue.MapToQueue();
        System.out.println(mapToQueue.returnMap());
        System.out.println(mapToQueue.returnQueue());


        //Map to Stack
        MapToStack mapToStack = new MapToStack();

        mapToStack.addToMap(1,"Name");
        mapToStack.addToMap(2,"Id");
        mapToStack.addToMap(3,"IDNP");
        mapToStack.addToMap(4,"Vacation");

        mapToStack.MapToStack();
        System.out.println(mapToStack.returnMap());
        System.out.println(mapToStack.returnStack());


        //Queue to map
        QueueToMap queueToMap = new QueueToMap();

        queueToMap.addToQueue("Luni");
        queueToMap.addToQueue("Marti");
        queueToMap.addToQueue("Mercuri");
        queueToMap.addToQueue("Joi");
        queueToMap.addToQueue("Vineri");
        queueToMap.addToQueue("Simbata");
        queueToMap.addToQueue("Duminica");

        queueToMap.queueToMap();
        System.out.println(queueToMap.returnQueue());
        System.out.println(queueToMap.returnMap());
    }
}