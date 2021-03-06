package com.hoantran.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User entity.
 */
@Entity
@Table(name = "USER")
public class UserEntity implements java.io.Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6255997732752939054L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "IS_MALE")
    private Boolean isMale;

    /**
     * Instantiates a new user entity.
     */
    public UserEntity() {
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the isMale
     */
    public Boolean getIsMale() {
        return isMale;
    }

    /**
     * @param isMale the isMale to set
     */
    public void setIsMale(Boolean isMale) {
        this.isMale = isMale;
    }

}
