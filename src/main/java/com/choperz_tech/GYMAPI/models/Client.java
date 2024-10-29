package com.choperz_tech.GYMAPI.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;
    private String last_name;
    private String email;
    private String phone;
    private String sex;

    @OneToOne
    private Membership membership;

    @OneToMany(mappedBy = "")
    private List<Observations> observations;
}
