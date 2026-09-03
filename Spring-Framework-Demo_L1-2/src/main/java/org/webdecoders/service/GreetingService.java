package org.webdecoders.service;

public class GreetingService {

    private final String message;

    public GreetingService(String msg) {
        this.message = msg;
    }


    public String getGreeting() {
        return "Hello from " + this.message + " !";
    }
}
