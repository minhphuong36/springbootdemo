package com.example.demo_spring_boot.security.configurer;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
@Configuration
@EnableGlobalMethodSecurity
public class MethodSecurityConfigurer extends GlobalMethodSecurityConfiguration{

}
