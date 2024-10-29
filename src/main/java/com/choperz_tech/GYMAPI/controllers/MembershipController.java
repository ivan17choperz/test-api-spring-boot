package com.choperz_tech.GYMAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.choperz_tech.GYMAPI.dto.MembershipDTO;
import com.choperz_tech.GYMAPI.models.Membership;
import com.choperz_tech.GYMAPI.services.MembershipService;

@RestController
@RequestMapping("/api")
public class MembershipController {

    @Autowired
    private MembershipService membershipService;

    @PostMapping("/membership")
    public Membership createMembership(@RequestBody MembershipDTO membershipDTO) {
        return membershipService.registerMembership(membershipDTO);
    }
}
