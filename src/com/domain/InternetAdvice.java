package com.domain;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;


public class InternetAdvice implements MethodBeforeAdvice {
    private CafeOwner cafeOwner;

    public CafeOwner getCafeOwner() {
        return cafeOwner;
    }

    public void setCafeOwner(CafeOwner cafeOwner) {
        this.cafeOwner = cafeOwner;
    }

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
    this.getCafeOwner().LongInTime();
    }
}
