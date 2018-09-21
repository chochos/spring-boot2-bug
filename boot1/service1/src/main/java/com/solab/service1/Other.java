package com.solab.service1;

import javax.annotation.Resource;
import com.solab.lib.SharedClass;
import javax.annotation.PostConstruct;

public class Other {

    @Resource
    private SharedClass shared;

    @PostConstruct
    public void init() {
        System.out.println("AND HERE AS WELL " + shared);
    }
}
