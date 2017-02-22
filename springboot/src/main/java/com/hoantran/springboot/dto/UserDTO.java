/**
 * Created by Hoan Tran @ http://hoantran-it.blogspot.com
 *
 * Any modifications to this file must keep this entire header intact.
 *
 */
package com.hoantran.springboot.dto;

/**
 * User DTO
 * 
 * @author hoan.tran
 */
public class UserDTO {

    private Long id;

    private String userName;

    private Integer age;

    private Boolean isMale;

    /**
     * Instantiates a new user DTO.
     */
    public UserDTO() {
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
