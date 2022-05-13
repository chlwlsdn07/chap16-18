// ArrayList 예제
import java.util.ArrayList;
import java.util.List;

public class chap16_02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Human"); // list에서는 add의 순서가 상관있음
        list.add("Human"); // 중복값은 그대로 출력 
        list.add("Dog");
        list.add("Fish");
        list.add(null);
        System.out.println(list.toString());

        list.add(0, "Monkey"); // 주소를 지정해서 오브젝트를 추가해 순서 조정 가능
        list.add(1, "Bird");
        System.out.println(list);

        list.remove("Human"); // 오브젝트 하나만 제거해서 중복값 모두가 제거되지 않음
        System.out.println(list);

        list.remove(1); 
        System.out.println(list);

        String strValue = list.get(2);
        System.out.println(strValue);


    }
}
