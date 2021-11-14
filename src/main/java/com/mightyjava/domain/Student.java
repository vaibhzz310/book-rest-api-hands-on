package com.mightyjava.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Student")
public class Student {

    public Student() {
    }

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long studentId;
	
	// // foreign key
    // @NotNull
    // @Column(name="coursesOpted", length=50, nullable=false, unique=false)
	// private Long coursesOpted;
	
	@NotNull
    @Column(name="name", length=50, nullable=false)
	private String name;

    @NotNull
    @Column(name="emailId", length=50, nullable=false)
	private String emailId;

    @NotNull
    @Column(name="coursesOpted")
	private String[] coursesOpted;
	

    public Long getStudentId() {
        return this.studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String[] getCoursesOpted() {
        return this.coursesOpted;
    }

    public void setCoursesOpted(String[] coursesOpted) {
        this.coursesOpted = coursesOpted;
    }

}
