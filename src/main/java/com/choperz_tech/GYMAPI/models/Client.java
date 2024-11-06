package com.choperz_tech.GYMAPI.models;

import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDate;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonManagedReference;

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
    private LocalDate birthday;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="membersip_id")
    private Membership membership;

    @OneToMany(mappedBy = "client")
    @JsonManagedReference
    private List<Observations> observations;
}
