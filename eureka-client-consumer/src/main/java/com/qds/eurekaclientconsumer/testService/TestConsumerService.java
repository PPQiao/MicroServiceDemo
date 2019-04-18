package com.qds.eurekaclientconsumer.testService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eureka-client-provider")
public interface TestConsumerService {

    @RequestMapping(value = "/test/sayHello")
    String saySomething();
}
