package com.tml.template.common.interceptor;

import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

@Component
public class MyMethodArgumentResolver implements HandlerMethodArgumentResolver {

    @Override
    public Object resolveArgument(MethodParameter arg0, ModelAndViewContainer arg1, NativeWebRequest arg2,
            WebDataBinderFactory arg3) throws Exception {
        ServletWebRequest req = (ServletWebRequest)arg2;
        //TODO 获取参数, 实例化对象并return对象
        return null;
    }

    @Override
    public boolean supportsParameter(MethodParameter arg0) {
        //TODO 判断是否存在特定自定义注解
        return false;
    }

}