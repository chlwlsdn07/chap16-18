// HashMap 예제
import java.util.HashMap;
import java.util.Map;

public class chap16_04 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("key1", "Orange");
        map.put("key2", "Apple");
        System.out.println(map.toString());

        map.put("key1", "Banana");
        System.out.println(map.toString());

        String strValue = map.get("key2");
        System.out.println(strValue);
    }
}
