package com.springboot.sprintboottest.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_list")
public class Job {
    @Id
    @Column(name = "job_id")
    private Integer jobId;

    @Column(name = "job_name")
    private String jobName;
    @Column(name = "credit_range")
    private String creditRange;
    @Column(name = "skill_point_formula")
    private String skillPointFormula;
    @Column(name = "jobS_skills")
    private String jobSkills;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getCreditRange() {
        return creditRange;
    }

    public void setCreditRange(String creditRange) {
        this.creditRange = creditRange;
    }

    public String getSkillPointFormula() {
        return skillPointFormula;
    }

    public void setSkillPointFormula(String skillPointFormula) {
        this.skillPointFormula = skillPointFormula;
    }

    public String getJobSkills() {
        return jobSkills;
    }

    public void setJobSkills(String jobSkills) {
        this.jobSkills = jobSkills;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobId=" + jobId +
                ", jobName='" + jobName + '\'' +
                ", creditRange='" + creditRange + '\'' +
                ", skillPointFormula='" + skillPointFormula + '\'' +
                ", jobSkills='" + jobSkills + '\'' +
                '}';
    }
}
