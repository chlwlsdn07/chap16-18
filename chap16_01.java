// HashSet 예제
import java.util.HashSet;
import java.util.Set;

public class chap16_01{

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();

        hashSet.add("Human"); // add하는 순서가 상관없음 
        hashSet.add("Dog");
        hashSet.add("Fish");
        hashSet.add("Monkey");
        hashSet.add("Bird");

        hashSet.add("Human"); // 중복과는 상관없이 하나로 따짐
        hashSet.add(null);

        System.out.println(hashSet.toString());

        boolean isExist = hashSet.contains("Human");
        System.out.println(isExist);

        hashSet.remove("Human");
        System.out.println(hashSet.toString());



    }
}