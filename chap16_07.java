import java.util.ArrayList;
import java.util.List;

public class chap16_07 {
    public static void main(String[] args) {
        chap16_06 value1 = new chap16_06();
        value1.setName("Yoo");
        value1.setUniqueId("20140913");

        chap16_06 value2 = new chap16_06();
        value2.setName("Kim");
        value2.setUniqueId("20160930");

        chap16_06 value3 = new chap16_06();
        value3.setName("choi");
        value3.setUniqueId("20170727");

        List<chap16_06> list = new ArrayList<chap16_06>();
        list.add(value1);
        list.add(value2);
        list.add(value3);
        System.out.println(list);

        list.sort(new chap16_08());
        System.out.println(list);
    }
}
