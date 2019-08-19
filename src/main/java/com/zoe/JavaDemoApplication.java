package com.zoe;

import com.zoe.message.MsgSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JavaDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(JavaDemoApplication.class, args);

        MsgSender msgSender = context.getBean(MsgSender.class);

        for (int i = 0; i < 3; i++) {
            //调用消息发送类中的消息发送方法
            msgSender.send();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
