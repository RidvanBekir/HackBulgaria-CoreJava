package classInfo;

import java.lang.annotation.Annotation;

public class MainClass {

    public static void main(String[] args) {
        AnnotatedClass myClass = new AnnotatedClass();
        Annotation[] myAnnotation = myClass.getClass().getAnnotations();
        for (Annotation a : myAnnotation) {
            System.out.println(a);
        }
    }
}
