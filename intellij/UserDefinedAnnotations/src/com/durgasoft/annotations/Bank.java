package com.durgasoft.annotations;

import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Bank {
    String bankId() default "B-111";
    String bankName() default "ICICI Bank";
    String branchName() default "Ameerpet";
    String website() default "www.icicibank.com/ameerpet";
    long mobile() default 9988776655L;
}
