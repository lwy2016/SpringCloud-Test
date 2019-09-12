package com.lwy94.feigntest;

import lombok.Data;

/**
 * @author liweiya
 * @date 2019/8/19 20:20
 */

@Data
public class TestParam {
    private int id;
    private String name;

    public TestParam(int id, String name) {
        this.id = id;
        this.name = name;
    }
}