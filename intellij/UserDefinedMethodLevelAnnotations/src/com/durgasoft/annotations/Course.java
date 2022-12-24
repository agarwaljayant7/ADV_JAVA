package com.durgasoft.annotations;

import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Courses.class)
public @interface Course {
    String cid() default "C-111";
    String cname() default "Java";
    int ccost() default 50000;

}
