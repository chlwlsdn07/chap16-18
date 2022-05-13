// foreach 예문
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class chap16_03 {

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "grape"};

        for(String item : arr){
            System.out.println(item);
        }

        List<String> list = new ArrayList<String>(Arrays.asList(arr));
        for(String item : list){
            System.out.println(item);
        }
    }
    
}
