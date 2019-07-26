package com.gqy.spring.web.mvc;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RequsetMapping {
    String value();
}
