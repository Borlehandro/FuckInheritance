package com.sibdever.fuckinheritance.sample;

import com.sibdever.fuckinheritance.lib.processing.FuckInheritanceProcessor;

public class Main {
    public static void main(String[] args) {
        var processor = new FuckInheritanceProcessor();

        var a = new TestChildA();
        var b = new TestChildB();

        System.out.println(processor.resolveAllMultiInheritanceMethods(a));
        System.out.println(processor.resolveAllMultiInheritanceMethods(b));
    }
}
