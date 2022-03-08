package com.sibdever.fuckinheritance.sample;

import com.sibdever.fuckinheritance.lib.annotations.MultiExtend;

@MultiExtend(parents = {TestSuperA.class, TestSuperB.class})
public class TestChildA {

    public void childAMethod() {

    }
}
