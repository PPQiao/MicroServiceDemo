package com.qds.eurekaclientconsumer.testController;

import com.netflix.discovery.converters.Auto;
import com.qds.eurekaclientconsumer.testService.TestConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/test")
@Controller
public class TestConsumerController {

    @Autowired
    TestConsumerService testConsumerService;

    @RequestMapping("/say")
    @ResponseBody
    public String saySomething(){
        System.out.println(testConsumerService.saySomething());
        return testConsumerService.saySomething();
    }
}
