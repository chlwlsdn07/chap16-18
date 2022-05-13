// 열거형에 데이터 연결하기 예제
public class chap17_02 {
    enum DayOfWeek {
        monday("월요일"), thuseday("화요일"), wendsday("수요일");
    
    final String korean;

    private DayOfWeek(String korean){
        this.korean = korean;
    }

    public String getKorean(){
        return korean;
    }
}
public static void main(String[] args) {
    DayOfWeek dayOfWeek = DayOfWeek.monday;
    System.out.println(dayOfWeek);
    System.out.println(dayOfWeek.getKorean());
}
}
