/**
 * Created by Hoan Tran @ http://hoantran-it.blogspot.com
 *
 * Any modifications to this file must keep this entire header intact.
 *
 */
package com.hoantran.springboot.restcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hoantran.springboot.service.UserService;

/**
 * @author hoan.tran
 */
@Controller
public class HomeController {

    private final static Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap model) {
        String message = "Welcome to Spring Framework";
        LOGGER.info("Home controller with welcome message: {}", message);
        model.addAttribute("message", message);

        return "index";
    }

}
