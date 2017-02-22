/**
 * Created by Hoan Tran @ http://hoantran-it.blogspot.com
 *
 * Any modifications to this file must keep this entire header intact.
 *
 */
package com.hoantran.springboot.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hoantran.springboot.dto.UserDTO;
import com.hoantran.springboot.entity.UserEntity;

/**
 * @author hoan.tran
 */
@Component
public class RestDataConverter {

    public UserDTO buildUserDTO(UserEntity userEntity) {
        UserDTO dto = new UserDTO();
        dto.setId(userEntity.getId());
        dto.setUserName(userEntity.getUserName());
        dto.setAge(userEntity.getAge());
        dto.setIsMale(userEntity.getIsMale());
        return dto;
    }

    public List<UserDTO> buildUserDTOs(List<UserEntity> userEntityList) {
        List<UserDTO> dtos = new ArrayList<>();
        for (UserEntity userEntity : userEntityList) {
            dtos.add(buildUserDTO(userEntity));
        }
        return dtos;
    }
}
