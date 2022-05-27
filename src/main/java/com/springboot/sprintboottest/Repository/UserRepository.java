package com.springboot.sprintboottest.Repository;

import com.springboot.sprintboottest.Entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface UserRepository extends JpaRepository<user, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM kesulu_online.user WHERE user_name = :username")
    user findByUserName(@Param("username") String username);

    @Query(nativeQuery = true, value = "SELECT * FROM kesulu_online.user WHERE user_id = :userId")
    user findByUserId(@Param("userId") Integer userId);

    @Query(nativeQuery = true, value = "SELECT * FROM kesulu_online.user WHERE user_name = :username")
    List<user> findsByUserName(@Param("username") String username);

    @Query(nativeQuery = true, value = "SELECT * FROM kesulu_online.user")
    List<user> findAllUsers();


    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "INSERT INTO kesulu_online.user("
            +"user_name,"
            +"user_password,"
            +"user_gender,"
            +"user_privilege_level,"
            +"user_assignment,"
            +"user_email,"
            +"user_icon_path,"
            +"user_registory_time,"
            +"user_last_login_time"
            +") VALUES ("
            +":User_name, "
            +":User_password, "
            +":User_gender, "
            +"100, "
            +":User_assignment, "
            +":User_email, "
            +":User_icon_path, "
            +":User_registory_time, "
            +":User_registory_time"
            +");")
    Integer insertUser(
            @Param("User_name") String User_name,
            @Param("User_password") String User_password,
            @Param("User_gender") Integer User_gender,
            @Param("User_assignment") String User_assignment,
            @Param("User_email") String User_email,
            @Param("User_icon_path") String User_icon_path,
            @Param("User_registory_time") String User_registory_time
            );

    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "UPDATE kesulu_online.user SET user_last_login_time = :loginTime" +
            " WHERE user_id = :userId")
    void setLoginTime(
            @Param("loginTime") String loginTime,
            @Param("userId") Integer userId
    );


    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "UPDATE kesulu_online.user SET user_assignment = :userAssignment,user_email = :userEmail,user_gender = :userGender,user_name = :userName WHERE user_id = :userId")
    void updateBaseInfo(
            @Param("userAssignment") String userAssignment,
            @Param("userEmail") String userEmail,
            @Param("userGender") Integer userGender,
            @Param("userName") String userName,
            @Param("userId") Integer userId
    );

    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "UPDATE kesulu_online.user SET user_icon_path = :iconPath WHERE user_id = :userId")
    void updateImg(
            @Param("iconPath") String iconPath,
            @Param("userId") Integer userId
    );


    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "UPDATE kesulu_online.user SET user_password = :password WHERE user_id = :userId")
    void updatePassword(
        @Param("password") String password,
        @Param("userId") Integer userId
    );
}
