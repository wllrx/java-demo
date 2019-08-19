package com.zoe.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author zoe
 **/
@Component
@Slf4j
public class MsgSender {

    @Resource
    private KafkaTemplate<String,String> kafkaTemplate;

    public void send(){
        kafkaTemplate.send("circle","消息");
        log.info("发送消息............");
    }
}
