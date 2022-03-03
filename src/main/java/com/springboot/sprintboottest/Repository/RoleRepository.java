package com.springboot.sprintboottest.Repository;

import com.springboot.sprintboottest.Entity.role;
import com.springboot.sprintboottest.Entity.roleBaseInfo;
import com.springboot.sprintboottest.Entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface RoleRepository extends JpaRepository<role, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM kesulu_online.rolecard WHERE role_card_id = :RoleCardId")
    role findRole(@Param("RoleCardId") Integer RoleCardId);
    @Query(nativeQuery = true, value = "SELECT * FROM kesulu_online.rolecard WHERE role_card_player_id = :RoleCardPlayerId")
    List<role> findRoles(@Param("RoleCardPlayerId") Integer RoleCardPlayerId);

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "UPDATE kesulu_online.rolecard SET " +
            "role_name = :RoleName, era = :Era, role_gender= :RoleGender, role_age = :RoleAge," +
            "role_job_id = :RoleJobId, role_home_address = :RoleHomeAddress, " +
            "role_hometown = :RoleHometown WHERE role_card_id = :RoleCardId")
    void updateRoleBaseInfo(@Param("RoleCardId") Integer RoleCardId,
                               @Param("RoleName") String RoleName,
                               @Param("Era") String Era,
                               @Param("RoleGender") Integer RoleGender,
                               @Param("RoleAge") Integer RoleAge,
                               @Param("RoleJobId") Integer RoleJobId,
                               @Param("RoleHomeAddress") String RoleHomeAddress,
                               @Param("RoleHometown") String RoleHometown);

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "UPDATE kesulu_online.rolecard SET " +
            "rolestr = :RoleStr, rolecon = :RoleCon, rolesiz = :RoleSiz, roledex = :RoleDex," +
            "roleapp = :RoleApp, roleint = :RoleInt, rolepow = :RolePow, role_luck = :RoleLuck," +
            "roleedu = :RoleEdu, rolemov = :RoleMov WHERE role_card_id = :RoleCardId" )
    void updateRoleElement(
            @Param("RoleStr") Integer RoleStr,
            @Param("RoleCon") Integer RoleCon,
            @Param("RoleSiz") Integer RoleSiz,
            @Param("RoleDex") Integer RoleDex,
            @Param("RoleApp") Integer RoleApp,
            @Param("RoleInt") Integer RoleInt,
            @Param("RolePow") Integer RolePow,
            @Param("RoleLuck") Integer RoleLuck,
            @Param("RoleEdu") Integer RoleEdu,
            @Param("RoleMov") Integer RoleMov,
            @Param("RoleCardId") Integer RoleCardId
    );

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "UPDATE kesulu_online.rolecard SET " +
            "role_cur_hit_points = :role_cur_hit_points, role_max_hit_points = :role_max_hit_points, " +
            "role_cur_sanity = :role_cur_sanity, role_max_sanity = :role_max_sanity," +
            "role_cur_magic = :role_cur_magic, role_max_magic = :role_max_magic, " +
            "role_physical_status = :role_physical_status, role_mental_status = :role_mental_status " +
            "WHERE role_card_id = :RoleCardId" )
    void updateRoleStatus(
            @Param("role_cur_hit_points") Integer role_cur_hit_points,
            @Param("role_max_hit_points") Integer role_max_hit_points,
            @Param("role_cur_sanity") Integer role_cur_sanity,
            @Param("role_max_sanity") Integer role_max_sanity,
            @Param("role_cur_magic") Integer role_cur_magic,
            @Param("role_max_magic") Integer role_max_magic,
            @Param("role_physical_status") String role_physical_status,
            @Param("role_mental_status") String role_mental_status,
            @Param("RoleCardId") Integer RoleCardId
    );
}
