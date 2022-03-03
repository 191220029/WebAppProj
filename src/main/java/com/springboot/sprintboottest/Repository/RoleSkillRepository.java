package com.springboot.sprintboottest.Repository;


import com.springboot.sprintboottest.Entity.roleSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoleSkillRepository extends JpaRepository<roleSkill, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM kesulu_online.role_skills" +
            " WHERE role_card_id = :role_card_id")
    roleSkill findRoleSkill(@Param("role_card_id") Integer role_card_id);
}
