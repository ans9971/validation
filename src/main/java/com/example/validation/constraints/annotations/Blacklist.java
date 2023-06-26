package com.example.validation.constraints.annotations;

import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Blacklist {
    String message() default "username in blacklist";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    //추가 element작성
    String[] blacklist() default {};

}