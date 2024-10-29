package com.choperz_tech.GYMAPI.repositories;

import com.choperz_tech.GYMAPI.models.Membership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipRepository extends JpaRepository<Membership, Long> {
}
