package org.webdecoders.sender;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sms")
public class SMSSender implements NotificationSender {

    @Override

    public void send(String to, String msg) {
        System.out.println("Sending SMS to - " + to + " , Msg - " + msg);
    }


}
