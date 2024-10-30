package com.choperz_tech.GYMAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.choperz_tech.GYMAPI.dto.MembershipDTO;
import com.choperz_tech.GYMAPI.models.Membership;
import com.choperz_tech.GYMAPI.services.MembershipService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class MembershipController {

    @Autowired
    private MembershipService membershipService;

    @GetMapping("/memberships")
    public List<Membership> allMemberships() {
        return membershipService.getAllMembership();
    }

    @PostMapping("/save-membership")
    public Membership createMembership(@RequestBody MembershipDTO membershipDTO) {
        return membershipService.registerMembership(membershipDTO);
    }

    @DeleteMapping("/delete-membership/{id}")
    public Membership deleteMembership(@PathVariable Long id) {
        return membershipService.deleteMembership(id);
    }
}
