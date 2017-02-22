/**
 * Created by Hoan Tran @ http://hoantran-it.blogspot.com
 *
 * Any modifications to this file must keep this entire header intact.
 *
 */
package com.hoantran.springboot.service;

import java.util.List;

import com.hoantran.springboot.entity.UserEntity;

/**
 * User service.
 * 
 * @author hoan.tran
 */
public interface UserService {

    /**
     * Get All User
     * 
     * @param isMale
     * @return
     */
    List<UserEntity> getAllUser();

    /**
     * Get User by gender
     * 
     * @param isMale
     * @return
     */
    List<UserEntity> getUserByGender(boolean isMale);

}
