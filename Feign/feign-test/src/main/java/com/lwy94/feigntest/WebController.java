package com.lwy94.feigntest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liweiya
 * @date 2019/8/20 9:11
 */

@RestController
public class WebController {
    @Autowired
    private IMyFeignClient myFeignClient;

    @GetMapping("/test")
    public String test() {
        String result = myFeignClient.test(234L);
        System.out.println(result);
        return result;
    }

    @GetMapping("/test2")
    public String test2() {
        TestParam testParam = new TestParam(55, "zhangsan");
        String result = myFeignClient.post(testParam);
        System.out.println(result);
        return result;
    }
}
