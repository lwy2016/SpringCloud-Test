package com.lwy94.eurekaclient1;

import org.springframework.web.bind.annotation.*;

/**
 * @author liweiya
 * @date 2019/8/19 15:54
 */

@RestController
public class TestController {

    @GetMapping("/{id}")
    public String getMessage(@PathVariable Long id) {
        return "the request1 id is " + id;
    }

    @PostMapping("/post")
    public String post(@RequestBody TestParam testParam) {
        return "testParam 1" + testParam.toString();
    }
}
