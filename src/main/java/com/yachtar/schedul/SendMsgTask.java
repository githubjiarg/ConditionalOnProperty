package com.yachtar.schedul;

import com.yachtar.service.SendSmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SendMsgTask {

    @Autowired
    private SendSmsService sendSmsService;

    @Scheduled(cron = "*/5 * * * * ?")
    public void sendScheduled() {
        try {
            sendSmsService.sendMsg();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
