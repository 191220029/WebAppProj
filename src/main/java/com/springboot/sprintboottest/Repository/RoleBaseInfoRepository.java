package com.springboot.sprintboottest.Repository;

import com.springboot.sprintboottest.Entity.roleBaseInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RoleBaseInfoRepository extends JpaRepository<roleBaseInfo, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM kesulu_online.role_base_info WHERE role_card_player_id = :RoleCardPlayerId")
    List<roleBaseInfo> findRolebaseinfo(@Param("RoleCardPlayerId") Integer RoleCardPlayerId);

    @Query(nativeQuery = true, value = "SELECT * FROM kesulu_online.role_base_info WHERE role_card_id = :RoleCardId")
    roleBaseInfo findRolebaseinfo_id(@Param("RoleCardId") Integer RoleCardId);

}
