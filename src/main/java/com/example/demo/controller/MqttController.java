package com.example.demo.controller;

import com.example.demo.config.MqttGateway;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/mqtt")
public class MqttController {

    @Resource
    private MqttGateway mqttGateway;

    @RequestMapping("/sendMqtt")
    public String sendMqtt(@RequestParam String sendData, @RequestParam String topic) {
        mqttGateway.sendToMqtt(sendData, topic);
        return "OK";
    }
}
