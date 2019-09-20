package lwy94.hystrixfeignweb.service.serviceImpl;

import lwy94.hystrixfeignweb.service.IMyFeignClient;
import org.springframework.stereotype.Component;

/**
 * @author liweiya
 * @date 2019/9/20 14:33
 */

@Component
public class TestCallBack implements IMyFeignClient {

    @Override
    public String test(Long id) {
        return "错误信息显示";
    }

}
