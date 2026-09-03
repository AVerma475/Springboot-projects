package org.webdecoders.sender;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("email")
public class EmailSender implements NotificationSender {

    @Override
    public void send(String to, String msg) {
        System.out.println("Sending Email to - " + to + " , Msg - " + msg);
    }
}
