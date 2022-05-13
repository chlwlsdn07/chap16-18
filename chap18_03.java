import java.lang.reflect.Method;

import javax.print.attribute.standard.Media;

public class chap18_03 {
    public static void main(String[] args) {
        try {
            Class testClass = Class.forName(chap18_02.class.getName());
            Object obj = testClass.newInstance();

            for (Method m : testClass.getDeclaredMethods()){
                if (m.isAnnotationPresent(TestAnnotation.class)){
                    m.invoke(obj);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
