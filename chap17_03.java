// 열거형 메소드 예제
public class chap17_03 {
    enum DayOfWeek {
        monday, thuseday, wendsday
    }
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.valueOf("monday"); // 데이터 반환
        System.out.println("day : "+day);

        DayOfWeek[] days = DayOfWeek.values(); // 데이터의 배열 반환
        for(DayOfWeek item : days) {
            System.out.println(item + " ");
        }
        System.out.println(" ");

        String name = day.name();
        System.out.println("day.name() : "+name); // 데이터에 대응되는 스트링 반환

        int ordainal = day.ordinal();
        System.out.println("day.ordinal : "+ordainal); // 데이터의 정의 순서에 따른 순서 int형 반환


        System.out.println("day.compareTo(DayOfWeek.monday) : "+day.compareTo(DayOfWeek.thuseday));
        // ordinal에 의한 비교 값 반환 

        boolean b = day.equals(DayOfWeek.monday);
        System.out.println("day.equals(DayOfWeek.monday) : "+b); // 동일 여부 반환 

        System.out.println("day==DayOfWeek.thusday : "+(day==DayOfWeek.thuseday));

    }
}
