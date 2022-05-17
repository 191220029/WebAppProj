package com.springboot.sprintboottest.Repository;

import com.springboot.sprintboottest.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JobListRepository extends JpaRepository<Job, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM kesulu_online.job_list")
    List<Job> findAllJobs();
    @Query(nativeQuery = true, value = "SELECT * FROM kesulu_online.job_list WHERE job_id = :jobId")
    Job findByJobId(
            @Param("jobId") Integer jobId
    );
}
