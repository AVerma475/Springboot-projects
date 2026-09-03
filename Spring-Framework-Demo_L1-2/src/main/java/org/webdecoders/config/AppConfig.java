package org.webdecoders.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.webdecoders.sender.EmailSender;
import org.webdecoders.sender.SMSSender;
import org.webdecoders.service.GreetingService;

@Configuration
@ComponentScan(basePackages = "org.webdecoders")
public class AppConfig {

    @Bean
    public GreetingService greetingService() {
        return new GreetingService("SpringBoot Project");
    }

//    @Bean
//    public SMSSender getSmsSender() {
//        return new SMSSender();
//    }
//
//    @Bean
//    public EmailSender getEmailSender() {
//        return new EmailSender();
//    }
}
