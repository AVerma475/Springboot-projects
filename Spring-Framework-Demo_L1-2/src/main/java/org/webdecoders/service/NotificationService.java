package org.webdecoders.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.webdecoders.sender.NotificationSender;

@Component
public class NotificationService {
    private final NotificationSender sender;

    public NotificationService(@Qualifier("email") NotificationSender sender) {
        this.sender = sender;
    }

    public void notifyUser(String email, String message) {
        sender.send(email, message);
    }
}
