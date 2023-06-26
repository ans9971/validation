package com.example.validation.constraints.annotations;
import com.example.validation.constraints.EmailWhitelistValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 어노테이션을 어디에 적용할 것인지 (선택)
@Target(ElementType.FIELD)
// 어노테이션이 언제까지 유지될 것인지
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailWhitelistValidator.class)
//phone010가 붙은 필드는 유효성 검사시
//(010)또는 010-으로 시작해야 한다.
public @interface Phone010 {
    // Annotation Element
    String message() default "email not in whitelist";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}