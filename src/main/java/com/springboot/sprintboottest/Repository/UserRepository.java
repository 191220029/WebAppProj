package com.springboot.sprintboottest.Repository;

import com.springboot.sprintboottest.Entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<user, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM kesulu_online.user")
    user findByUserName(@Param("username") String username);
}
