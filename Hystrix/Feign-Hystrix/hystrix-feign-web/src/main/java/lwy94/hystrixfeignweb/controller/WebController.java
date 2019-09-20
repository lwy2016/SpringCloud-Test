package lwy94.hystrixfeignweb.controller;

import lwy94.hystrixfeignweb.service.IMyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liweiya
 * @date 2019/9/20 14:34
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

}
