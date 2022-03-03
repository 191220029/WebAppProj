package com.springboot.sprintboottest.Repository;

import com.springboot.sprintboottest.Entity.roleElement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoleElementRepository extends JpaRepository<roleElement, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM role_elements WHERE role_card_id = :RoleCardId")
    roleElement findRoleElement_id(@Param("RoleCardId") Integer RoleCardId);
}
