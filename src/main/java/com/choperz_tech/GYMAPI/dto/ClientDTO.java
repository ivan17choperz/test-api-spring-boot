package com.choperz_tech.GYMAPI.dto;

import lombok.Data;

@Data
public class ClientDTO {
    private String name;
    private String last_name;
    private String email;
    private String phone;
    private Long membershipId;
}
