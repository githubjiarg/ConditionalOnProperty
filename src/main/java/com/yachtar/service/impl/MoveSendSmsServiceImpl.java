package com.yachtar.service.impl;

import com.yachtar.service.SendSmsService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service("moveSendSmsService")
@ConditionalOnProperty(prefix = "", name = "sms.name", havingValue = "yd")
public class MoveSendSmsServiceImpl implements SendSmsService {

    @Override
    public void sendMsg() throws Exception {
        System.out.println("移动发送...");
    }

    @Override
    public void getStatus() throws Exception {
        System.out.println("移动查询...");
    }
}
