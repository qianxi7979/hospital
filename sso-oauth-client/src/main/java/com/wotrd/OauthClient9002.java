package com.wotrd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class OauthClient9002 {
    public static void main(String[] args) {
        SpringApplication.run(OauthClient9002.class,args);
    }
}
