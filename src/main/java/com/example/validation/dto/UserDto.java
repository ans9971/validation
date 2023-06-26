package com.example.validation.dto;

import com.example.validation.constraints.annotations.Blacklist;
import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserDto {
    private long id;

    @NotBlank //비어있지않다
    @Size(min = 8, message = "최소 8글자")
    @Blacklist(blacklist = {"malware.good","trojan.jjang"})
    private String username;

    @Email //형식이 email이여야함
    private String email;
    @NotNull
    private String phone;
    @Min(14)
    public Integer age;
    @Future
    private LocalDate validUtil;
    @NotNull //널이 아닌지만 검증
    private String notNullString;
    @NotEmpty //길이가 0이 아닌지만 검증
    private String notempty;
    @NotBlank //공백문자로만 이루어지지않았는지
    private String notBlank;


}
