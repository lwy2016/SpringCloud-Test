package com.lwy94.feigntest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author liweiya
 * @date 2019/8/20 9:06
 */

@FeignClient(value = "feign-client")
public interface IMyFeignClient {
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String test(@PathVariable("id")  Long id);

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String post(@RequestBody TestParam testParam);
}
