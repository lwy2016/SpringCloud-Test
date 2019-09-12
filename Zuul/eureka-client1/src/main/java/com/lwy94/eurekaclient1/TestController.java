package com.lwy94.eurekaclient1;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

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

    @PostMapping(value = "/upload")
    public String handleFileUpload(@RequestParam(value = "file", required = true) MultipartFile file) throws Exception {
        byte [] bytes = file.getBytes();
        File fileToSave = new File(file.getOriginalFilename());
        FileCopyUtils.copy(bytes, fileToSave);
        return fileToSave.getAbsolutePath();
    }
}
