/**
 * Created by Hoan Tran @ http://hoantran-it.blogspot.com
 *
 * Any modifications to this file must keep this entire header intact.
 *
 */
package com.hoantran.springboot.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hoantran.springboot.entity.UserEntity;
import com.hoantran.springboot.service.UserService;

/**
 * @author hoan.tran
 */
@RestController
@RequestMapping(value = "/user")
public class UserRestController {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserRestController.class);

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:8089")
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<UserEntity> getAllUser() {
        LOGGER.info("Controller layer: Get all user");
        List<UserEntity> userList = userService.getAllUser();
        return userList;
    }
}
