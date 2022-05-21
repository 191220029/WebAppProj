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
    @Query(nativeQuery = true, value = "SELECT * FROM kesulu_online.rolecard WHERE role_card_player_id = :UserId AND role_name = :RoleName")
    List<role> findRoleByUserNameAndRoleName(
            @Param("UserId") Integer userId,
            @Param("RoleName") String roleName
    );

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

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "INSERT INTO kesulu_online.rolecard (role_card_player_id,era,role_name,role_gender,role_age,role_home_address,role_job_id,role_hometown,rolestr,rolecon,rolesiz,roledex,roleapp,roleint,rolepow,roleedu,rolemov,role_img_path,role_cur_hit_points,role_max_hit_points,role_cur_sanity,role_max_sanity,role_luck,role_cur_magic,role_max_magic,role_physical_status,role_mental_status) VALUES (:_role_card_player_id,:_era,:_role_name,:_role_gender,:_role_age,:_role_home_address,:_role_job_id,:_role_hometown,:_rolestr,:_rolecon,:_rolesiz,:_roledex,:_roleapp,:_roleint,:_rolepow,:_roleedu,:_rolemov,:_role_img_path,:_role_cur_hit_points,:_role_max_hit_points,:_role_cur_sanity,:_role_max_sanity,:_role_luck,:_role_cur_magic,:_role_max_magic,:_role_physical_status,:_role_mental_status)")
    void insertRoleBaseInfo(
            @Param("_role_card_player_id")Integer _role_card_player_id,
            @Param("_era")String _era,
            @Param("_role_name")String _role_name,
            @Param("_role_gender")Integer _role_gender,
            @Param("_role_age")Integer _role_age,
            @Param("_role_home_address")String _role_home_address,
            @Param("_role_job_id")Integer _role_job_id,
            @Param("_role_hometown")String _role_hometown,
            @Param("_rolestr")Integer _rolestr,
            @Param("_rolecon")Integer _rolecon,
            @Param("_rolesiz")Integer _rolesiz,
            @Param("_roledex")Integer _roledex,
            @Param("_roleapp")Integer _roleapp,
            @Param("_roleint")Integer _roleint,
            @Param("_rolepow")Integer _rolepow,
            @Param("_roleedu")Integer _roleedu,
            @Param("_rolemov")Integer _rolemov,
            @Param("_role_img_path")String _role_img_path,
            @Param("_role_cur_hit_points")Integer _role_cur_hit_points,
            @Param("_role_max_hit_points")Integer _role_max_hit_points,
            @Param("_role_cur_sanity")Integer _role_cur_sanity,
            @Param("_role_max_sanity")Integer _role_max_sanity,
            @Param("_role_luck")Integer _role_luck,
            @Param("_role_cur_magic")Integer _role_cur_magic,
            @Param("_role_max_magic")Integer _role_max_magic,
            @Param("_role_physical_status")String _role_physical_status,
            @Param("_role_mental_status")String _role_mental_status
    );

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "DELETE FROM kesulu_online.rolecard WHERE role_card_id =:ID")
    void deleteRoleById(
            @Param("ID") Integer ID
    );

}
