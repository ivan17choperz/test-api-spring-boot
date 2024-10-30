package com.choperz_tech.GYMAPI.services;

import com.choperz_tech.GYMAPI.dto.MembershipDTO;
import com.choperz_tech.GYMAPI.models.Membership;
import com.choperz_tech.GYMAPI.repositories.MembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembershipService {

    @Autowired
    private MembershipRepository membershipRepository;

    public List<Membership> getAllMembership() {
        return membershipRepository.findAll();
    }

    public Membership registerMembership(MembershipDTO membershipdto) {
        Membership membership = new Membership();
        membership.setType(membershipdto.getType());
        membership.setPrice(membershipdto.getPrice());
        membership.setTimeInMonths(membershipdto.getTimeInMonths());

        return membershipRepository.save(membership);
    }

    public Membership deleteMembership(Long idMembership) {
        Membership membership = membershipRepository.findById(idMembership).orElseThrow();
        membershipRepository.delete(membership);
        return membership;
    }

}
