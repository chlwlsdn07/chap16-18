// enum(열거형) 기본 예제
public class chap17_01 {
    enum DayOfWeek {
        monday, thuseday, wendsday
    }

    public static void main(String[] args) {
        DayOfWeek dayofweek = DayOfWeek.monday;
        System.out.println(dayofweek);
    }
}
