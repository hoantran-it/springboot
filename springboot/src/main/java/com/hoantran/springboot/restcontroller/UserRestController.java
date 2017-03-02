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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hoantran.springboot.dto.UserCriteria;
import com.hoantran.springboot.dto.UserDTO;
import com.hoantran.springboot.entity.UserEntity;
import com.hoantran.springboot.service.UserService;
import com.hoantran.springboot.utils.RestDataConverter;

/**
 * @author hoan.tran
 */
@RestController
@RequestMapping(value = "/user")
public class UserRestController {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserRestController.class);

    @Autowired
    private RestDataConverter restDataConverter;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<UserDTO> getAllUser() {
        LOGGER.info("UserRestController layer: Get all user");
        List<UserEntity> userList = userService.getAllUser();
        return restDataConverter.buildUserDTOs(userList);
    }

    @RequestMapping(value = "/getUserByGender", method = RequestMethod.POST)
    public List<UserDTO> getUserByGender(@RequestBody UserCriteria criteria) {
        LOGGER.info("UserRestController layer: Get user by gender");
        List<UserEntity> userList = userService.getUserByGender(criteria.getIsMale());
        return restDataConverter.buildUserDTOs(userList);
    }
}
