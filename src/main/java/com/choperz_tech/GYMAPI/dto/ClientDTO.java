package com.choperz_tech.GYMAPI.dto;

import java.time.LocalDate;



import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ClientDTO {
    private String name;
    private String last_name;
    private String email;
    private String phone;

    
    private String sex;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    private Long membershipId;
}
