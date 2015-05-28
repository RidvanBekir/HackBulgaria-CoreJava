package classInfo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public @Retention(RetentionPolicy.RUNTIME) @interface ClassInfo {
    String author();

    int revision() default 1;

    Class<?>[] newClasses();
}