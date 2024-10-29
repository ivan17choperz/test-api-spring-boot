package com.choperz_tech.GYMAPI.dto;

import lombok.Data;

@Data
public class MembershipDTO {
    private String type;
    private Double price;
    private Integer timeInMonths;
}
