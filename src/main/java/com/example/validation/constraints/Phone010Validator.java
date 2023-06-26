package com.example.validation.constraints;

import com.example.validation.constraints.annotations.Phone010;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.HashSet;
import java.util.Set;

public class Phone010Validator implements ConstraintValidator<Phone010, String> {

//    private final Set<String> whitelist;
//
//    public PhoneWhitelistValidator() {
//        this.whitelist = new HashSet<>();
//        this.whitelist.add("(010)");
//        this.whitelist.add("010-");
//
//    }
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
//        String[] split = value.split("-");
//        String firstNum = split[0];
//        return whitelist.contains(firstNum);

        boolean withDash = value.startsWith("010-");
        boolean withPar = value.startsWith("(010)");
        return withDash || withPar;
    }
}