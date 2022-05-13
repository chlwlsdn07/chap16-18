// Iterator(반복자) 예제
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class chap16_05 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "Orange");
        map.put("key2", "Apple");

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println("["+key+" , "+value+"]");
        }
    }
}
