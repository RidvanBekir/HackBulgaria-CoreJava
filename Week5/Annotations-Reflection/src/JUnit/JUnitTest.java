package JUnit;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JUnitTest {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException,
            ClassNotFoundException {
        JUnitImplementation j = new JUnitImplementation();
        Method[] methods = j.getClass().getDeclaredMethods();
        int flag = 0;
        while (true) {
            for (int i = 0; i < methods.length; i++) {
                Annotation[] annotations = methods[i].getDeclaredAnnotations();
                for (Annotation annotation : annotations) {
                    if (annotation instanceof before && flag == 0) {
                        methods[i].invoke(j, new Object[] {});
                        flag++;
                    }
                    if (annotation instanceof execute && flag == 1) {
                        methods[i].invoke(j, new Object[] {});
                        flag++;
                    }
                    if (annotation instanceof after && flag == 2) {
                        methods[i].invoke(j, new Object[] {});
                        System.exit(1);
                    }
                }
            }
        }
    }
}