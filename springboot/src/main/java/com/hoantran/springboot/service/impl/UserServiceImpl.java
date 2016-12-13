/**
 * Created by Hoan Tran @ http://hoantran-it.blogspot.com
 *
 * Any modifications to this file must keep this entire header intact.
 *
 */
package com.hoantran.springboot.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoantran.springboot.entity.UserEntity;
import com.hoantran.springboot.repository.UserRepository;
import com.hoantran.springboot.service.UserService;

/**
 * User service implement.
 * 
 * @author hoan.tran
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * Tracking system operations.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    /**
     * The program Repository.
     */
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> getAllUser() {
        LOGGER.info("Service layer: Get all user");
        return userRepository.findAll();
    }

}
