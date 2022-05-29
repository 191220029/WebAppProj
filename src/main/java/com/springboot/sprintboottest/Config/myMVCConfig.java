package com.springboot.sprintboottest.Config;

import org.apache.tomcat.jni.Local;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

//拓展 spring-mvc
//实现一些定制化的功能：重写相关组件交给spring-boot进行自动装配
@Configuration
public class myMVCConfig implements WebMvcConfigurer {

    //ViewResolver 重写实现视图解析器的类
    @Bean
    public ViewResolver MyViewResolver(){
        return new MyViewResolver();
    }
    public static class MyViewResolver implements ViewResolver {
        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }
    //注入自定义的国际化组件
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }

    //自定义拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //设置拦截器其起作用的链接和默认不拦截的链接
        registry.addInterceptor(new LoginHandlerInterceptor())
        .addPathPatterns("/**").excludePathPatterns(
                "/login", "/logon", "/test", "/testRequest",
                "/user/**", "/css/**","/fonts/**","/img/**","/js/**");

        //registry.addInterceptor(new AdminHandlerInterceptor()).addPathPatterns("/admin/**");
    }

    //配置本地资源映射路径
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler(
                "/serverfs/**"
        ).addResourceLocations("file:./serverfs/");
    }
}
