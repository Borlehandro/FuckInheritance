package com.sibdever.fuckinheritance.lib.processing;

import com.sibdever.fuckinheritance.lib.annotations.MultiExtend;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FuckInheritanceProcessor {

    public List<String> resolveAllMultiInheritanceMethods(Object object) {
        var clazz = object.getClass();

        return resolveAllMultiInheritanceClassMethods(clazz);
    }

    private List<String> resolveAllMultiInheritanceClassMethods(Class<?> clazz) {

        var res = new ArrayList<>(Arrays.stream(clazz.getDeclaredMethods()).map(Method::getName).toList());

        if (clazz.isAnnotationPresent(MultiExtend.class)) {

            var annotation = clazz.getAnnotation(MultiExtend.class);

            Arrays.stream(annotation.parents()).forEach(it -> res.addAll(resolveAllMultiInheritanceClassMethods(it)));
        }

        return res;
    }

}
