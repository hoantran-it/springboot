///**
// * Created by Hoan Tran @ http://hoantran-it.blogspot.com
// *
// * Any modifications to this file must keep this entire header intact.
// *
// */
//package com.hoantran.springboot.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
///**
// * @author hoan.tran
// */
//@Configuration
//@EnableWebMvc
//public class MvcConfiguration extends WebMvcConfigurerAdapter {
//    @Bean
//    public ViewResolver defaultViewResolver() {
//        InternalResourceViewResolver viewResolve = new InternalResourceViewResolver();
//        viewResolve.setPrefix("/WEB-INF/");
//        viewResolve.setSuffix(".jsp");
//
//        return viewResolve;
//    }
//
//    @Override
//    public void configureDefaultServletHandling(
//            DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }
// }
