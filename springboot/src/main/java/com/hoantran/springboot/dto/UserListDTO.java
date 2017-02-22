/**
 * Created by Hoan Tran @ http://hoantran-it.blogspot.com
 *
 * Any modifications to this file must keep this entire header intact.
 *
 */
package com.hoantran.springboot.dto;

import java.util.List;

/**
 * User List DTO
 * 
 * @author hoan.tran
 */
public class UserListDTO {

    private List<UserDTO> userList;

    /**
     * @return the userList
     */
    public List<UserDTO> getUserList() {
        return userList;
    }

    /**
     * @param userList the userList to set
     */
    public void setUserList(List<UserDTO> userList) {
        this.userList = userList;
    }

}
