package lwy94.hystrixfeignclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liweiya
 * @date 2019/9/20 14:10
 */

@RestController
public class TestController {

    @GetMapping("/{id}")
    public String getMessage(@PathVariable Long id) {
        return "the request id is " + id;
    }

}