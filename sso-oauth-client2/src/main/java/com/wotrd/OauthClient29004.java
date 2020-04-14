package com.wotrd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class OauthClient29004 {
    public static void main(String[] args) {
        SpringApplication.run(OauthClient29004.class,args);
    }
}
