/**
 * Created by Hoan Tran @ http://hoantran-it.blogspot.com
 *
 * Any modifications to this file must keep this entire header intact.
 *
 */
package com.hoantran.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hoan.tran
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    String home() {
        return "Spring Boot Home Page";
    }
}
