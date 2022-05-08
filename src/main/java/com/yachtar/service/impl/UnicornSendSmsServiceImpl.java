package com.yachtar.service.impl;

import com.yachtar.service.SendSmsService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(prefix = "", name = "sms.name", havingValue = "lt")
public class UnicornSendSmsServiceImpl implements SendSmsService {

    @Override
    public void sendMsg() throws Exception {
        System.out.println("联通发送...");
    }

    @Override
    public void getStatus() throws Exception {
        System.out.println("联通查询...");
    }
}
