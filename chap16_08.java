import java.util.Comparator;

public class chap16_08 implements Comparator<chap16_06> {
    
    @Override
    public int compare(chap16_06 o1, chap16_06 o2){
        int compare = o1.getName().compareTo(o2.getName());
        return compare;
    }
}
