import java.lang.annotation.Inherited;

public class chap18_01 {
    public static void main(String[] args) {
        new chap18_01().test();
    }

    private void test(){
        System.out.println(new AChild().getClass().getAnnotation(UnInheritaceAnnotation.class));
        System.out.println(new BChild().getClass().getAnnotation(InheritaceAnnotation.class));

    }

    @UnInheritaceAnnotation
    public class A {}

    public class AChild extends A {}
    @InheritaceAnnotation
    public class B {}

    public  class BChild extends B {}

}
