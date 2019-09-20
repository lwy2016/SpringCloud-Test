package lwy94.hystrixfeignweb.service;

import lwy94.hystrixfeignweb.service.serviceImpl.TestCallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author liweiya
 * @date 2019/9/20 14:31
 */

@FeignClient(value="hystrix-feign-client", fallback= TestCallBack.class)
public interface IMyFeignClient {

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String test(@PathVariable("id") Long id);

}