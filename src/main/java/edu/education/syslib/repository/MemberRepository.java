package edu.education.syslib.repository;

import edu.education.syslib.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    void deleteMemberById(Long id);
    Optional<Member> findMemberById(Long id);
    Optional<Member> findMemberByEmail(String email);
}
