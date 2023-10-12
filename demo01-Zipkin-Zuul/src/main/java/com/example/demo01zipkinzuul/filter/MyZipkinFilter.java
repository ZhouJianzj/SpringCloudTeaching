package com.example.demo01zipkinzuul.filter;

import brave.Tracer;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;


@Component
public class MyZipkinFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 699;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Autowired
    Tracer tracer;
    @Autowired
    HttpServletRequest request;
    @Override
    public Object run() throws ZuulException {

        tracer.currentSpan().tag("name","zhoujian");
        String remoteAddr = request.getRemoteAddr();
        tracer.currentSpan().tag("Remote Address",remoteAddr);

        return null;
    }
}
