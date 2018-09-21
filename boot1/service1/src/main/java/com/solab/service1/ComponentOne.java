package com.solab.service1;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import com.solab.lib.SharedClass;

@Component
public class ComponentOne {

    @Resource
    private SharedClass sharedClass;

    @PostConstruct
    public void init() {
        System.out.println();
        System.out.println("****************************");
        System.out.println(sharedClass);
        System.out.println("****************************");
        System.out.println();
    }

}
