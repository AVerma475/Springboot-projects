package org.webdecoders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.webdecoders.config.AppConfig;
import org.webdecoders.scope.RequestLogger;
import org.webdecoders.service.GreetingService;
import org.webdecoders.service.NotificationService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Demo1 - Using Beans
        GreetingService greetingService = context.getBean(GreetingService.class);
        System.out.println("1. GreetingService (via @Bean):");
        System.out.println(greetingService.getGreeting());

        // Demo2 - Using Interface - Constructor Injection
        NotificationService notificationService = context.getBean(NotificationService.class);
        System.out.println("2. NotificationService (Constructor Injection):");
        notificationService.notifyUser("student@webdecoders.in", "Welcome to Week 1!");


        // 3. Prototype scope demo
        RequestLogger logger1 = context.getBean(RequestLogger.class);
        RequestLogger logger2 = context.getBean(RequestLogger.class);
        System.out.println("3. Bean Scope Demo (Prototype):");
        System.out.println("   Logger 1 ID: " + logger1.getId());
        System.out.println("   Logger 2 ID: " + logger2.getId());
        System.out.println("   Same instance? " + (logger1 == logger2));

        System.out.println("\n=== Day 1 Demo Complete ===");
    }


}















/*
 * This simulates the MVC lifecycle used by web applications:
 *
 * 1. A client sends a request.
 * 2. The Controller receives the request.
 * 3. The Controller asks the Model for data.
 * 4. The Controller passes the data to the View.
 * 5. The View renders the response for the client.
 */