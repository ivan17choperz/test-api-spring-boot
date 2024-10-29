package com.choperz_tech.GYMAPI.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class ClientDTO {
    private String name;
    private String last_name;
    private String email;
    private String phone;
    private String sex;
    private Date birth_date;
    private Long membershipId;
}
